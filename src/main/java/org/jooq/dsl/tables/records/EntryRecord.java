/*
 * This file is generated by jOOQ.
 */
package org.jooq.dsl.tables.records;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.dsl.tables.Entry;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EntryRecord extends UpdatableRecordImpl<EntryRecord> implements Record8<Integer, String, String, String, Integer, JSONB, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1967872821;

    /**
     * Setter for <code>mvp.entry.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mvp.entry.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mvp.entry.group_code</code>.
     */
    public void setGroupCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mvp.entry.group_code</code>.
     */
    public String getGroupCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mvp.entry.code</code>.
     */
    public void setCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mvp.entry.code</code>.
     */
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mvp.entry.desc</code>.
     */
    public void setDesc(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mvp.entry.desc</code>.
     */
    public String getDesc() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mvp.entry.seq_id</code>.
     */
    public void setSeqId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mvp.entry.seq_id</code>.
     */
    public Integer getSeqId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mvp.entry.custom_fields</code>.
     */
    public void setCustomFields(JSONB value) {
        set(5, value);
    }

    /**
     * Getter for <code>mvp.entry.custom_fields</code>.
     */
    public JSONB getCustomFields() {
        return (JSONB) get(5);
    }

    /**
     * Setter for <code>mvp.entry.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>mvp.entry.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>mvp.entry.updated_at</code>.
     */
    public void setUpdatedAt(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>mvp.entry.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, String, String, String, Integer, JSONB, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, String, String, String, Integer, JSONB, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Entry.ENTRY.ID;
    }

    @Override
    public Field<String> field2() {
        return Entry.ENTRY.GROUP_CODE;
    }

    @Override
    public Field<String> field3() {
        return Entry.ENTRY.CODE;
    }

    @Override
    public Field<String> field4() {
        return Entry.ENTRY.DESC;
    }

    @Override
    public Field<Integer> field5() {
        return Entry.ENTRY.SEQ_ID;
    }

    @Override
    public Field<JSONB> field6() {
        return Entry.ENTRY.CUSTOM_FIELDS;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return Entry.ENTRY.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Entry.ENTRY.UPDATED_AT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getGroupCode();
    }

    @Override
    public String component3() {
        return getCode();
    }

    @Override
    public String component4() {
        return getDesc();
    }

    @Override
    public Integer component5() {
        return getSeqId();
    }

    @Override
    public JSONB component6() {
        return getCustomFields();
    }

    @Override
    public LocalDateTime component7() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component8() {
        return getUpdatedAt();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getGroupCode();
    }

    @Override
    public String value3() {
        return getCode();
    }

    @Override
    public String value4() {
        return getDesc();
    }

    @Override
    public Integer value5() {
        return getSeqId();
    }

    @Override
    public JSONB value6() {
        return getCustomFields();
    }

    @Override
    public LocalDateTime value7() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value8() {
        return getUpdatedAt();
    }

    @Override
    public EntryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public EntryRecord value2(String value) {
        setGroupCode(value);
        return this;
    }

    @Override
    public EntryRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public EntryRecord value4(String value) {
        setDesc(value);
        return this;
    }

    @Override
    public EntryRecord value5(Integer value) {
        setSeqId(value);
        return this;
    }

    @Override
    public EntryRecord value6(JSONB value) {
        setCustomFields(value);
        return this;
    }

    @Override
    public EntryRecord value7(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public EntryRecord value8(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public EntryRecord values(Integer value1, String value2, String value3, String value4, Integer value5, JSONB value6, LocalDateTime value7, LocalDateTime value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EntryRecord
     */
    public EntryRecord() {
        super(Entry.ENTRY);
    }

    /**
     * Create a detached, initialised EntryRecord
     */
    public EntryRecord(Integer id, String groupCode, String code, String desc, Integer seqId, JSONB customFields, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(Entry.ENTRY);

        set(0, id);
        set(1, groupCode);
        set(2, code);
        set(3, desc);
        set(4, seqId);
        set(5, customFields);
        set(6, createdAt);
        set(7, updatedAt);
    }
}
