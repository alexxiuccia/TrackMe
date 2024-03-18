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
import it.trackme.jooq.generated.tables.Ricetta;


public class GestisciPianoAlimentare {
	
	
	public static int consumoDelGiorno(int userId) {
	   DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);

	    LocalDate oggi = LocalDate.now();

	    Result<Record1<Integer>> result = create
	        .select(Alimento.ALIMENTO.CALORIE
	        		.mul(Composizionericetta.COMPOSIZIONERICETTA.DOSE)
	                .mul(Creazionepasto.CREAZIONEPASTO.QUANTITÀ).divide(100))
	                
	        .from(Pasto.PASTO)
	        .join(Creazionepasto.CREAZIONEPASTO)
	        .on(Pasto.PASTO.IDPASTO.eq(Creazionepasto.CREAZIONEPASTO.IDPASTO))
	        .join(Composizionericetta.COMPOSIZIONERICETTA)
	        .on(Creazionepasto.CREAZIONEPASTO.IDRICETTA.eq(Composizionericetta.COMPOSIZIONERICETTA.IDRICETTA))
	        .join(Alimento.ALIMENTO)
	        .on(Composizionericetta.COMPOSIZIONERICETTA.IDALIMENTO.eq(Alimento.ALIMENTO.IDALIMENTO))
	        .where(Pasto.PASTO.DATA.eq(oggi).and(Pasto.PASTO.IDUTENTE.eq(userId)))
	        .fetch();
	    
	   
	     //Per verificare le calorie degli alimenti   
	    /*for (Record1<Integer> record : result) {
	    	 Integer value = record.value1();
	    	 System.out.println("Valore: " + value);
	    }*/
	    int calorieTotali = 0;
	    for (Record1<Integer> record : result) {
	    	
	        calorieTotali += record.value1();
	    }
		

	    System.out.println("Calorie totali consumate oggi dall'utente " + userId + ": " + calorieTotali);
	    return calorieTotali;
	    
		}
	
	public static int consumoPeriodo(LocalDate inizio, LocalDate fine, int userId)
	{
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
		int calorieTotali = 0;
		int cont=0;
	
		for (LocalDate dataCorrente = inizio; !dataCorrente.isAfter(fine); dataCorrente = dataCorrente.plusDays(1))
		{
			cont++;
			Result<Record1<Integer>> result = create
			        .select(Alimento.ALIMENTO.CALORIE
			        		.mul(Composizionericetta.COMPOSIZIONERICETTA.DOSE)
			                .mul(Creazionepasto.CREAZIONEPASTO.QUANTITÀ).divide(100))
			                
			        .from(Pasto.PASTO)
			        .join(Creazionepasto.CREAZIONEPASTO)
			        .on(Pasto.PASTO.IDPASTO.eq(Creazionepasto.CREAZIONEPASTO.IDPASTO))
			        .join(Composizionericetta.COMPOSIZIONERICETTA)
			        .on(Creazionepasto.CREAZIONEPASTO.IDRICETTA.eq(Composizionericetta.COMPOSIZIONERICETTA.IDRICETTA))
			        .join(Alimento.ALIMENTO)
			        .on(Composizionericetta.COMPOSIZIONERICETTA.IDALIMENTO.eq(Alimento.ALIMENTO.IDALIMENTO))
			        .where(Pasto.PASTO.DATA.eq(dataCorrente).and(Pasto.PASTO.IDUTENTE.eq(userId)))
			        .fetch();
			    
			  //Per verificare le calorie degli alimenti   
				/*for (Record1<Integer> record : result) {
		    	 Integer value = record.value1();
		    	 System.out.println("Valore: " + value);
		    	}*/  
			    
			    for (Record1<Integer> record : result) {
			    	
			        calorieTotali += record.value1();
			    }
		}
	  System.out.println("Le calorie medie assunte giornalmente dal "+ inizio+" al "+fine+ " sono "+ calorieTotali/cont);
	  return calorieTotali;
	}
}
