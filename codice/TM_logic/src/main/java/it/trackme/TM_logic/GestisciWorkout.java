package it.trackme.TM_logic;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import it.trackme.TM_db.DBconnection;
import it.trackme.jooq.generated.tables.Workout;
import it.trackme.jooq.generated.tables.records.WorkoutRecord;

public class GestisciWorkout {
	public static void inserisciWorkout(int idUtente, int calorie)
	{
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
    	WorkoutRecord workout = create.newRecord(Workout.WORKOUT);
    	workout.setIdutente(idUtente);
    	workout.setCalorie(calorie); 
    	workout.store();
	}

}
