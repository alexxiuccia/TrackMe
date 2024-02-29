package it.trackme.TM_logic;

import java.time.LocalDate;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import it.trackme.TM_db.DBconnection;
import it.trackme.jooq.generated.tables.Pasto;
import it.trackme.jooq.generated.tables.records.PastoRecord;

public class GestisciPasto {
	public static int inserisciPasto(int idUtente, LocalDate data, String tipoPasto)
	{
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
    	PastoRecord pasto = create.newRecord(Pasto.PASTO);
    	pasto.setIdutente(idUtente);
    	pasto.setData(data);
    	pasto.setTipo(tipoPasto);
    	pasto.store();
    	return pasto.getIdpasto();
	}

}
