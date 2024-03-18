package it.trackme.TM_logic;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import it.trackme.TM_db.DBconnection;
import it.trackme.jooq.generated.tables.Alimento;

import it.trackme.jooq.generated.tables.records.AlimentoRecord;


public class GestisciAlimento {
	public static Integer selezionaAlimento(String nome)
	{
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
		AlimentoRecord alimentoPresente = create.selectFrom(Alimento.ALIMENTO)
                .where(Alimento.ALIMENTO.NOME.eq(nome))
                .fetchOne();
		if (alimentoPresente != null) {
			 return alimentoPresente.getIdalimento();
		}
		System.out.println("L'alimento non è presente ");
    	return null;
	}
	public static Integer inserisciNuovoAlimento(String nome,float carbo,float proteine,float grassi)
	{
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
		AlimentoRecord alimentoPresente = create.selectFrom(Alimento.ALIMENTO)
                .where(Alimento.ALIMENTO.NOME.eq(nome))
                .fetchOne();
		if (alimentoPresente != null) {
			 System.out.println("L'alimento è gia presente ");
			 return null;
		}
    	AlimentoRecord alimento = create.newRecord(Alimento.ALIMENTO);
    	alimento.setNome(nome);
    	alimento.setCarbo(carbo);
    	alimento.setProteine(proteine);
    	alimento.setGrassi(grassi);
    	int calorie=0;
    	calorie= (int) ((carbo*4)+(proteine*4)+(grassi*9));
    	alimento.setCalorie(calorie);
    	alimento.store();
    	return alimento.getIdalimento();
	}

}
