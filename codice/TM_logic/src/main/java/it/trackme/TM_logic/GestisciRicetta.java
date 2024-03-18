package it.trackme.TM_logic;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import it.trackme.TM_db.DBconnection;
import it.trackme.jooq.generated.tables.Alimento;
import it.trackme.jooq.generated.tables.Composizionericetta;
import it.trackme.jooq.generated.tables.Ricetta;
import it.trackme.jooq.generated.tables.records.AlimentoRecord;
import it.trackme.jooq.generated.tables.records.RicettaRecord;


public class GestisciRicetta {
	public static int nuovaRicetta(String nome, int quantita) {
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
		RicettaRecord ricetta = create.newRecord(Ricetta.RICETTA);
		ricetta.setNome(nome);
		ricetta.setQuantità(quantita);
		ricetta.store();
		return ricetta.getIdricetta();

	}
	
}
