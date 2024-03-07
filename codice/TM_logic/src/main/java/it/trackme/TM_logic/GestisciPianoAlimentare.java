package it.trackme.TM_logic;

import java.math.BigDecimal;
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
import it.trackme.jooq.generated.tables.records.RicettaRecord;

public class GestisciPianoAlimentare {
	
	public static void consumoDelGiorno() {
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);

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
		    .where(Pasto.PASTO.DATA.eq(oggi))
		    .groupBy(Pasto.PASTO.IDPASTO)
		    .fetch();

		int totalCalories = 0;
		for (Record1<Integer> record : result) {
		    totalCalories += record.value1();
		}

		System.out.println("Calorie totali consumate oggi: " + totalCalories);
	}

}
