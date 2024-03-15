package it.trackme.TM_logic;

import java.time.LocalDate;

import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import it.trackme.TM_db.DBconnection;
import it.trackme.jooq.generated.tables.Alimento;
import it.trackme.jooq.generated.tables.Composizionericetta;
import it.trackme.jooq.generated.tables.Creazionepasto;
import it.trackme.jooq.generated.tables.Pasto;

public class GestisciPianoAlimentare {
	
	public static void consumoDelGiorno(int userId) {
	   /* DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);

	    LocalDate oggi = LocalDate.now();

	    Result<Record1<Integer>> result = create
	        .select(DSL.sum(Alimento.ALIMENTO.CALORIE
	                .mul(Composizionericetta.COMPOSIZIONERICETTA.DOSE)
	                .mul(Creazionepasto.CREAZIONEPASTO.QUANTITÀ))
	                .cast(Integer.class))
	        .from(Pasto.PASTO)
	        .join(Creazionepasto.CREAZIONEPASTO)
	        .on(Pasto.PASTO.IDPASTO.eq(Creazionepasto.CREAZIONEPASTO.IDPASTO))
	        .join(Composizionericetta.COMPOSIZIONERICETTA)
	        .on(Creazionepasto.CREAZIONEPASTO.IDRICETTA.eq(Composizionericetta.COMPOSIZIONERICETTA.IDRICETTA))
	        .join(Alimento.ALIMENTO)
	        .on(Composizionericetta.COMPOSIZIONERICETTA.IDALIMENTO.eq(Alimento.ALIMENTO.IDALIMENTO))
	        .where(Pasto.PASTO.DATA.eq(oggi).and(Pasto.PASTO.IDUTENTE.eq(userId)))
	        .groupBy(Pasto.PASTO.IDPASTO)
	        .fetch();
	    System.out.println(create
	            .select(DSL.sum(Alimento.ALIMENTO.CALORIE
	                    .mul(Composizionericetta.COMPOSIZIONERICETTA.DOSE)
	                    .mul(Creazionepasto.CREAZIONEPASTO.QUANTITÀ))
	                    .cast(Integer.class))
	            .from(Pasto.PASTO)
	            .join(Creazionepasto.CREAZIONEPASTO)
	            .on(Pasto.PASTO.IDPASTO.eq(Creazionepasto.CREAZIONEPASTO.IDPASTO))
	            .join(Composizionericetta.COMPOSIZIONERICETTA)
	            .on(Creazionepasto.CREAZIONEPASTO.IDRICETTA.eq(Composizionericetta.COMPOSIZIONERICETTA.IDRICETTA))
	            .join(Alimento.ALIMENTO)
	            .on(Composizionericetta.COMPOSIZIONERICETTA.IDALIMENTO.eq(Alimento.ALIMENTO.IDALIMENTO))
	            .where(Pasto.PASTO.DATA.eq(oggi).and(Pasto.PASTO.IDUTENTE.eq(userId)))
	            .groupBy(Pasto.PASTO.IDPASTO)
	            .getSQL());
	    
	    for (Record1<Integer> record : result) {
	        System.out.println("Calorie per pasto: " + record.value1());
	    }

	    int totalCalories = 0;
	    for (Record1<Integer> record : result) {
	        totalCalories += record.value1();
	    }
		

	    System.out.println("Calorie totali consumate oggi dall'utente " + userId + ": " + totalCalories);*/
		// Ottieni il contesto DSL per eseguire la query
        DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);

        // Ottieni la data odierna
        LocalDate oggi = LocalDate.now();

        // Esegui la query per ottenere la somma delle calorie consumate per ogni pasto
        Result<Record1<Integer>> result = create.select(
                DSL.cast(DSL.sum(Alimento.ALIMENTO.CALORIE
                        .mul(Composizionericetta.COMPOSIZIONERICETTA.DOSE)
                        .mul(Creazionepasto.CREAZIONEPASTO.QUANTITÀ))
                        , Integer.class)
        )
        .from(Pasto.PASTO)
        .join(Creazionepasto.CREAZIONEPASTO).on(Pasto.PASTO.IDPASTO.eq(Creazionepasto.CREAZIONEPASTO.IDPASTO))
        .join(Composizionericetta.COMPOSIZIONERICETTA).on(Creazionepasto.CREAZIONEPASTO.IDRICETTA.eq(Composizionericetta.COMPOSIZIONERICETTA.IDRICETTA))
        .join(Alimento.ALIMENTO).on(Composizionericetta.COMPOSIZIONERICETTA.IDALIMENTO.eq(Alimento.ALIMENTO.IDALIMENTO))
        .where(Pasto.PASTO.DATA.eq(oggi).and(Pasto.PASTO.IDUTENTE.eq(userId)))
        .groupBy(Pasto.PASTO.IDPASTO)
        .fetch();

        // Calcola il totale delle calorie consumate
        int totalCalories = 0;
        for (Record1<Integer> record : result) {
            totalCalories += record.value1();
        }

        // Stampare il totale delle calorie consumate
        System.out.println("Calorie totali consumate oggi dall'utente " + userId + ": " + totalCalories);
    }
	
	public static void consumoPeriodo(LocalDate inizio, LocalDate fine, int userId)
	{
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
		int totalCalories = 0;
		int cont=0;
	
		for (LocalDate dataCorrente = inizio; !dataCorrente.isAfter(fine); dataCorrente = dataCorrente.plusDays(1))
		{
			cont++;
			Result<Record1<Integer>> result = create
				    	.select(DSL.sum(Alimento.ALIMENTO.CALORIE
				                    	.mul(Composizionericetta.COMPOSIZIONERICETTA.DOSE)
				                    	.mul(Creazionepasto.CREAZIONEPASTO.QUANTITÀ))
				                    	.cast(Integer.class))
				    	.from(Pasto.PASTO)
				    	.join(Creazionepasto.CREAZIONEPASTO)
				    	.on(Pasto.PASTO.IDPASTO.eq(Creazionepasto.CREAZIONEPASTO.IDPASTO))
				    	.join(Composizionericetta.COMPOSIZIONERICETTA)
				    	.on(Creazionepasto.CREAZIONEPASTO.IDRICETTA.eq(Composizionericetta.COMPOSIZIONERICETTA.IDRICETTA))
				    	.join(Alimento.ALIMENTO)
				    	.on(Composizionericetta.COMPOSIZIONERICETTA.IDALIMENTO.eq(Alimento.ALIMENTO.IDALIMENTO))
				    	.where(Pasto.PASTO.DATA.eq(dataCorrente).and(Pasto.PASTO.IDUTENTE.eq(userId)))
				    	.groupBy(Pasto.PASTO.IDPASTO)
				    	.fetch();

				
					for (Record1<Integer> record : result) {
						totalCalories += record.value1();
					}
		}
	  System.out.println("Le calorie medie assunte giornalmente dal "+ inizio+" al "+fine+ " sono "+totalCalories/cont);
	}
}
