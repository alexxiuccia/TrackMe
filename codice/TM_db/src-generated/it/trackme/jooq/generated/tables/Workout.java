/*
 * This file is generated by jOOQ.
 */
package it.trackme.jooq.generated.tables;


import it.trackme.jooq.generated.DefaultSchema;
import it.trackme.jooq.generated.Keys;
import it.trackme.jooq.generated.tables.records.WorkoutRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Workout extends TableImpl<WorkoutRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>workout</code>
     */
    public static final Workout WORKOUT = new Workout();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WorkoutRecord> getRecordType() {
        return WorkoutRecord.class;
    }

    /**
     * The column <code>workout.idWorkout</code>.
     */
    public final TableField<WorkoutRecord, Integer> IDWORKOUT = createField(DSL.name("idWorkout"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>workout.calorie</code>.
     */
    public final TableField<WorkoutRecord, Integer> CALORIE = createField(DSL.name("calorie"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>workout.idUtente</code>.
     */
    public final TableField<WorkoutRecord, Integer> IDUTENTE = createField(DSL.name("idUtente"), SQLDataType.INTEGER.nullable(false), this, "");

    private Workout(Name alias, Table<WorkoutRecord> aliased) {
        this(alias, aliased, null);
    }

    private Workout(Name alias, Table<WorkoutRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>workout</code> table reference
     */
    public Workout(String alias) {
        this(DSL.name(alias), WORKOUT);
    }

    /**
     * Create an aliased <code>workout</code> table reference
     */
    public Workout(Name alias) {
        this(alias, WORKOUT);
    }

    /**
     * Create a <code>workout</code> table reference
     */
    public Workout() {
        this(DSL.name("workout"), null);
    }

    public <O extends Record> Workout(Table<O> child, ForeignKey<O, WorkoutRecord> key) {
        super(child, key, WORKOUT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<WorkoutRecord, Integer> getIdentity() {
        return (Identity<WorkoutRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<WorkoutRecord> getPrimaryKey() {
        return Keys.WORKOUT__PK_WORKOUT;
    }

    @Override
    public Workout as(String alias) {
        return new Workout(DSL.name(alias), this);
    }

    @Override
    public Workout as(Name alias) {
        return new Workout(alias, this);
    }

    @Override
    public Workout as(Table<?> alias) {
        return new Workout(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Workout rename(String name) {
        return new Workout(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Workout rename(Name name) {
        return new Workout(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Workout rename(Table<?> name) {
        return new Workout(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
