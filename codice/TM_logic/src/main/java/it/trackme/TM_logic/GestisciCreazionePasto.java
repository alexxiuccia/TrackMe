package it.trackme.TM_logic;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import it.trackme.TM_db.DBconnection;
import it.trackme.jooq.generated.tables.Creazionepasto;
import it.trackme.jooq.generated.tables.records.CreazionepastoRecord;


public class GestisciCreazionePasto {
	public static void creazionePasto(int idPasto, int idRicetta, int quantita) {
		
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
    	CreazionepastoRecord creazionePasto = create.newRecord(Creazionepasto.CREAZIONEPASTO);
    	creazionePasto.setIdpasto(idPasto);
    	creazionePasto.setIdricetta(idRicetta);
    	creazionePasto.setQuantità(quantita);
    	
	}

}
