
package it.trackme.TM_logic;

import java.sql.Date;
import java.time.LocalDate;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import it.trackme.TM_db.DBconnection;
import it.trackme.jooq.generated.tables.User;
import it.trackme.jooq.generated.tables.records.UserRecord;

public class GestisciUtente {
	public static int registraUtente (String nome, String cognome, LocalDate dataNascita, float peso, int altezza, int eta, String attivita )
	{
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
    	UserRecord utente = create.newRecord(User.USER);
    	utente.setNome(nome);
    	utente.setCognome(cognome);
    	utente.setPeso(peso);
    	utente.setAltezza(altezza);
    	utente.setEtà(eta);
    	utente.setStiledivita(attivita);
    	utente.setDatanascita(dataNascita);
    	
    	utente.store();
    	return utente.getIduser();
	}

	
}
