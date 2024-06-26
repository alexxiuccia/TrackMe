/*
 * This file is generated by jOOQ.
 */
package it.trackme.jooq.generated.tables;


import it.trackme.jooq.generated.DefaultSchema;
import it.trackme.jooq.generated.Keys;
import it.trackme.jooq.generated.tables.records.CreazionepastoRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
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
public class Creazionepasto extends TableImpl<CreazionepastoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>creazionePasto</code>
     */
    public static final Creazionepasto CREAZIONEPASTO = new Creazionepasto();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CreazionepastoRecord> getRecordType() {
        return CreazionepastoRecord.class;
    }

    /**
     * The column <code>creazionePasto.idPasto</code>.
     */
    public final TableField<CreazionepastoRecord, Integer> IDPASTO = createField(DSL.name("idPasto"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>creazionePasto.idRicetta</code>.
     */
    public final TableField<CreazionepastoRecord, Integer> IDRICETTA = createField(DSL.name("idRicetta"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>creazionePasto.quantità</code>.
     */
    public final TableField<CreazionepastoRecord, Integer> QUANTITÀ = createField(DSL.name("quantità"), SQLDataType.INTEGER.nullable(false), this, "");

    private Creazionepasto(Name alias, Table<CreazionepastoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Creazionepasto(Name alias, Table<CreazionepastoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>creazionePasto</code> table reference
     */
    public Creazionepasto(String alias) {
        this(DSL.name(alias), CREAZIONEPASTO);
    }

    /**
     * Create an aliased <code>creazionePasto</code> table reference
     */
    public Creazionepasto(Name alias) {
        this(alias, CREAZIONEPASTO);
    }

    /**
     * Create a <code>creazionePasto</code> table reference
     */
    public Creazionepasto() {
        this(DSL.name("creazionePasto"), null);
    }

    public <O extends Record> Creazionepasto(Table<O> child, ForeignKey<O, CreazionepastoRecord> key) {
        super(child, key, CREAZIONEPASTO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<CreazionepastoRecord> getPrimaryKey() {
        return Keys.CREAZIONEPASTO__PK_CREAZIONEPASTO;
    }

    @Override
    public Creazionepasto as(String alias) {
        return new Creazionepasto(DSL.name(alias), this);
    }

    @Override
    public Creazionepasto as(Name alias) {
        return new Creazionepasto(alias, this);
    }

    @Override
    public Creazionepasto as(Table<?> alias) {
        return new Creazionepasto(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Creazionepasto rename(String name) {
        return new Creazionepasto(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Creazionepasto rename(Name name) {
        return new Creazionepasto(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Creazionepasto rename(Table<?> name) {
        return new Creazionepasto(name.getQualifiedName(), null);
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
