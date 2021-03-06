/*
 * This file is generated by jOOQ.
*/
package com.generator.tables;


import com.generator.Indexes;
import com.generator.Keys;
import com.generator.tables.records.UserRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User extends TableImpl<UserRecord> {

    private static final long serialVersionUID = 1571844404;

    /**
     * The reference instance of <code>user.user</code>
     */
    public static final User USER_ = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>user.user.id</code>.
     */
    public final TableField<UserRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>user.user.address</code>.
     */
    public final TableField<UserRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>user.user.birthday</code>.
     */
    public final TableField<UserRecord, LocalDateTime> BIRTHDAY = createField("birthday", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>user.user.sex</code>.
     */
    public final TableField<UserRecord, String> SEX = createField("sex", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>user.user.username</code>.
     */
    public final TableField<UserRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>user.user</code> table reference
     */
    public User() {
        this(DSL.name("user"), null);
    }

    /**
     * Create an aliased <code>user.user</code> table reference
     */
    public User(String alias) {
        this(DSL.name(alias), USER_);
    }

    /**
     * Create an aliased <code>user.user</code> table reference
     */
    public User(Name alias) {
        this(alias, USER_);
    }

    private User(Name alias, Table<UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private User(Name alias, Table<UserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return com.generator.User.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRecord> getPrimaryKey() {
        return Keys.KEY_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRecord>>asList(Keys.KEY_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(String alias) {
        return new User(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(Name alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(String name) {
        return new User(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(Name name) {
        return new User(name, null);
    }
}
