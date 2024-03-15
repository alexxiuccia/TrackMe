package it.trackme.TM_logic;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import it.trackme.TM_db.DBconnection;
import it.trackme.jooq.generated.tables.Composizionericetta;
import it.trackme.jooq.generated.tables.records.ComposizionericettaRecord;


public class GestisciComposizioneRicetta {
public static void ComposizioneRicetta(int idRicetta, int idAlimento, int dose) {
		
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
    	ComposizionericettaRecord composizioneRicetta = create.newRecord(Composizionericetta.COMPOSIZIONERICETTA);
    	composizioneRicetta.setIdricetta(idRicetta);
    	composizioneRicetta.setIdalimento(idAlimento);
    	composizioneRicetta.setDose(dose);
	}

}
