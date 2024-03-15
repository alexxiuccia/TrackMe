
package it.trackme.TM_logic;

import java.time.LocalDate;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import it.trackme.TM_db.DBconnection;

import it.trackme.jooq.generated.tables.User;

import it.trackme.jooq.generated.tables.records.UserRecord;

public class GestisciUtente {
	public static boolean registraUtente (String nomeUtente, String nome, String cognome, LocalDate dataNascita, float peso, int altezza, int eta, String attivita, String password, Integer cal)
	{
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
		UserRecord utente = create.selectFrom(User.USER)
                .where(User.USER.NOMEUTENTE.eq(nomeUtente))
                .fetchOne();
		if (utente != null) {
			 System.out.println("L'utente è gia registrato ");
			 return false;
		}
		LocalDate oggi = LocalDate.now();
    	if(dataNascita.isAfter(oggi))
    	{
    		System.out.println("La data di nascita inserita è successiva alla data odierna");
    		return false;
    	}
    	
    	UserRecord nuovoutente = create.newRecord(User.USER);
    	nuovoutente.setNomeutente(nomeUtente);
    	nuovoutente.setNome(nome);
    	nuovoutente.setCognome(cognome);
    	nuovoutente.setPeso(peso);
    	nuovoutente.setAltezza(altezza);
    	nuovoutente.setDatanascita(dataNascita);
    	nuovoutente.setEtà(eta);
    	nuovoutente.setStiledivita(attivita);
    	nuovoutente.setPassword(password);
    	nuovoutente.setCalgoal(cal);
    	
    	nuovoutente.store();
    	return true;
	}
	
	public static boolean accessoUtente(Integer id, String password)
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
