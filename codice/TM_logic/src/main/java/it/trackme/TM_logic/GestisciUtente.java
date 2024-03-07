
package it.trackme.TM_logic;

import java.time.LocalDate;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import it.trackme.TM_db.DBconnection;

import it.trackme.jooq.generated.tables.User;

import it.trackme.jooq.generated.tables.records.UserRecord;

public class GestisciUtente {
	public static int registraUtente (String nome, String cognome, LocalDate dataNascita, float peso, int altezza, int eta, String attivita,Integer id, String password )
	{
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
		UserRecord utente = create.selectFrom(User.USER)
                .where(User.USER.IDUSER.eq(id))
                .fetchOne();
		if (utente != null) {
			 System.out.println("L'utente è gia registrato ");
			 return 1;
		}
    	UserRecord nuovoutente = create.newRecord(User.USER);
    	nuovoutente.setNome(nome);
    	nuovoutente.setCognome(cognome);
    	nuovoutente.setPeso(peso);
    	nuovoutente.setAltezza(altezza);
    	nuovoutente.setEtà(eta);
    	nuovoutente.setStiledivita(attivita);
    	nuovoutente.setDatanascita(dataNascita);
    	
    	nuovoutente.setIduser(id);
    	nuovoutente.setPassword(password);
    	
    	nuovoutente.store();
    	return nuovoutente.getIduser();
	}
	
	public static boolean accessoUtentr(Integer id, String password)
	{
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
		UserRecord utente = create.selectFrom(User.USER)
                .where(User.USER.IDUSER.eq(id))
                .fetchOne();
		if (utente != null && utente.getPassword().equals(password)) 
            return true;
            
        else {
            System.out.println("ID o password errati, riprovare. ");
            return false;
        }
    
	}

	
}
