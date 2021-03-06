/*
 * This file is generated by jOOQ.
 */
package org.jooq.dsl.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.dsl.Indexes;
import org.jooq.dsl.Keys;
import org.jooq.dsl.Mvp;
import org.jooq.dsl.tables.records.TranslationRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Translation extends TableImpl<TranslationRecord> {

    private static final long serialVersionUID = 150471574;

    /**
     * The reference instance of <code>mvp.translation</code>
     */
    public static final Translation TRANSLATION = new Translation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TranslationRecord> getRecordType() {
        return TranslationRecord.class;
    }

    /**
     * The column <code>mvp.translation.id</code>.
     */
    public final TableField<TranslationRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('mvp.translation_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mvp.translation.key</code>.
     */
    public final TableField<TranslationRecord, String> KEY = createField(DSL.name("key"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>mvp.translation.locale</code>.
     */
    public final TableField<TranslationRecord, String> LOCALE = createField(DSL.name("locale"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>mvp.translation.value</code>.
     */
    public final TableField<TranslationRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>mvp.translation.created_at</code>.
     */
    public final TableField<TranslationRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>mvp.translation.updated_at</code>.
     */
    public final TableField<TranslationRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * Create a <code>mvp.translation</code> table reference
     */
    public Translation() {
        this(DSL.name("translation"), null);
    }

    /**
     * Create an aliased <code>mvp.translation</code> table reference
     */
    public Translation(String alias) {
        this(DSL.name(alias), TRANSLATION);
    }

    /**
     * Create an aliased <code>mvp.translation</code> table reference
     */
    public Translation(Name alias) {
        this(alias, TRANSLATION);
    }

    private Translation(Name alias, Table<TranslationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Translation(Name alias, Table<TranslationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Translation(Table<O> child, ForeignKey<O, TranslationRecord> key) {
        super(child, key, TRANSLATION);
    }

    @Override
    public Schema getSchema() {
        return Mvp.MVP;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TRANSLATION_KEY_LOCALE_IDX);
    }

    @Override
    public Identity<TranslationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TRANSLATION;
    }

    @Override
    public UniqueKey<TranslationRecord> getPrimaryKey() {
        return Keys.TRANSLATION_PKEY;
    }

    @Override
    public List<UniqueKey<TranslationRecord>> getKeys() {
        return Arrays.<UniqueKey<TranslationRecord>>asList(Keys.TRANSLATION_PKEY);
    }

    @Override
    public Translation as(String alias) {
        return new Translation(DSL.name(alias), this);
    }

    @Override
    public Translation as(Name alias) {
        return new Translation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Translation rename(String name) {
        return new Translation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Translation rename(Name name) {
        return new Translation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
