package it.trackme.TM_logic;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import it.trackme.TM_db.DBconnection;
import it.trackme.jooq.generated.tables.Alimento;
import it.trackme.jooq.generated.tables.records.AlimentoRecord;

public class GestisciAlimento {
	public static int selezionaAlimento(String nome)
	{
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
    	AlimentoRecord alimento = create.newRecord(Alimento.ALIMENTO);
    	alimento.setNome(nome);
    	alimento.store();
    	return alimento.getIdalimento();
	}
	public static void inserisciNuovoAlimento(String nome,float carbo,float proteine,float grassi)
	{
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
    	AlimentoRecord alimento = create.newRecord(Alimento.ALIMENTO);
    	alimento.setNome(nome);
    	alimento.setCarbo(carbo);
    	alimento.setProteine(proteine);
    	alimento.setGrassi(grassi);
    	Integer calorie=0;
    	calorie= (int) ((carbo*4)+(proteine*4)+(grassi*9));
    	alimento.setCalorie(calorie);
    	alimento.store();
	}

}
