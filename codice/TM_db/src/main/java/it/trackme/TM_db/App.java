package it.trackme.TM_db;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import it.trackme.jooq.generated.tables.User;
import it.trackme.jooq.generated.tables.records.UserRecord;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
    	UserRecord bill = create.newRecord(User.USER);
    	bill.setNome("bill");
    	bill.store();*/
    }
}