/*
 * This file is generated by jOOQ.
 */
package it.trackme.jooq.generated.tables.records;


import it.trackme.jooq.generated.tables.Workout;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkoutRecord extends UpdatableRecordImpl<WorkoutRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>workout.idWorkout</code>.
     */
    public void setIdworkout(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>workout.idWorkout</code>.
     */
    public Integer getIdworkout() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>workout.calorie</code>.
     */
    public void setCalorie(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>workout.calorie</code>.
     */
    public Integer getCalorie() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>workout.idUtente</code>.
     */
    public void setIdutente(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>workout.idUtente</code>.
     */
    public Integer getIdutente() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Workout.WORKOUT.IDWORKOUT;
    }

    @Override
    public Field<Integer> field2() {
        return Workout.WORKOUT.CALORIE;
    }

    @Override
    public Field<Integer> field3() {
        return Workout.WORKOUT.IDUTENTE;
    }

    @Override
    public Integer component1() {
        return getIdworkout();
    }

    @Override
    public Integer component2() {
        return getCalorie();
    }

    @Override
    public Integer component3() {
        return getIdutente();
    }

    @Override
    public Integer value1() {
        return getIdworkout();
    }

    @Override
    public Integer value2() {
        return getCalorie();
    }

    @Override
    public Integer value3() {
        return getIdutente();
    }

    @Override
    public WorkoutRecord value1(Integer value) {
        setIdworkout(value);
        return this;
    }

    @Override
    public WorkoutRecord value2(Integer value) {
        setCalorie(value);
        return this;
    }

    @Override
    public WorkoutRecord value3(Integer value) {
        setIdutente(value);
        return this;
    }

    @Override
    public WorkoutRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WorkoutRecord
     */
    public WorkoutRecord() {
        super(Workout.WORKOUT);
    }

    /**
     * Create a detached, initialised WorkoutRecord
     */
    public WorkoutRecord(Integer idworkout, Integer calorie, Integer idutente) {
        super(Workout.WORKOUT);

        setIdworkout(idworkout);
        setCalorie(calorie);
        setIdutente(idutente);
        resetChangedOnNotNull();
    }
}
