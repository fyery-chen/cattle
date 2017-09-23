/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.StorageDriver;
import io.cattle.platform.core.model.tables.StorageDriverTable;
import io.cattle.platform.db.jooq.utils.TableRecordJaxb;

import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "storage_driver", schema = "cattle")
public class StorageDriverRecord extends UpdatableRecordImpl<StorageDriverRecord> implements TableRecordJaxb, Record12<Long, String, String, String, String, String, Date, Date, Date, Map<String,Object>, Long, Long>, StorageDriver {

    private static final long serialVersionUID = -1418768955;

    /**
     * Setter for <code>cattle.storage_driver.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.storage_driver.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.storage_driver.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.storage_driver.name</code>.
     */
    @Column(name = "name", length = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cattle.storage_driver.kind</code>.
     */
    @Override
    public void setKind(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.storage_driver.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    @Override
    public String getKind() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cattle.storage_driver.uuid</code>.
     */
    @Override
    public void setUuid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.storage_driver.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    @Override
    public String getUuid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cattle.storage_driver.description</code>.
     */
    @Override
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.storage_driver.description</code>.
     */
    @Column(name = "description", length = 1024)
    @Override
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cattle.storage_driver.state</code>.
     */
    @Override
    public void setState(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.storage_driver.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    @Override
    public String getState() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cattle.storage_driver.created</code>.
     */
    @Override
    public void setCreated(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.storage_driver.created</code>.
     */
    @Column(name = "created")
    @Override
    public Date getCreated() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>cattle.storage_driver.removed</code>.
     */
    @Override
    public void setRemoved(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.storage_driver.removed</code>.
     */
    @Column(name = "removed")
    @Override
    public Date getRemoved() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>cattle.storage_driver.remove_time</code>.
     */
    @Override
    public void setRemoveTime(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.storage_driver.remove_time</code>.
     */
    @Column(name = "remove_time")
    @Override
    public Date getRemoveTime() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>cattle.storage_driver.data</code>.
     */
    @Override
    public void setData(Map<String,Object> value) {
        set(9, value);
    }

    /**
     * Getter for <code>cattle.storage_driver.data</code>.
     */
    @Column(name = "data", length = 16777215)
    @Override
    public Map<String,Object> getData() {
        return (Map<String,Object>) get(9);
    }

    /**
     * Setter for <code>cattle.storage_driver.service_id</code>.
     */
    @Override
    public void setServiceId(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>cattle.storage_driver.service_id</code>.
     */
    @Column(name = "service_id", precision = 19)
    @Override
    public Long getServiceId() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>cattle.storage_driver.cluster_id</code>.
     */
    @Override
    public void setClusterId(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>cattle.storage_driver.cluster_id</code>.
     */
    @Column(name = "cluster_id", nullable = false, precision = 19)
    @Override
    public Long getClusterId() {
        return (Long) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, String, String, String, String, Date, Date, Date, Map<String,Object>, Long, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, String, String, String, String, Date, Date, Date, Map<String,Object>, Long, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return StorageDriverTable.STORAGE_DRIVER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return StorageDriverTable.STORAGE_DRIVER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return StorageDriverTable.STORAGE_DRIVER.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return StorageDriverTable.STORAGE_DRIVER.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return StorageDriverTable.STORAGE_DRIVER.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return StorageDriverTable.STORAGE_DRIVER.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return StorageDriverTable.STORAGE_DRIVER.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return StorageDriverTable.STORAGE_DRIVER.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return StorageDriverTable.STORAGE_DRIVER.REMOVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map<String,Object>> field10() {
        return StorageDriverTable.STORAGE_DRIVER.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return StorageDriverTable.STORAGE_DRIVER.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return StorageDriverTable.STORAGE_DRIVER.CLUSTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value9() {
        return getRemoveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String,Object> value10() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getClusterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StorageDriverRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StorageDriverRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StorageDriverRecord value3(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StorageDriverRecord value4(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StorageDriverRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StorageDriverRecord value6(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StorageDriverRecord value7(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StorageDriverRecord value8(Date value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StorageDriverRecord value9(Date value) {
        setRemoveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StorageDriverRecord value10(Map<String,Object> value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StorageDriverRecord value11(Long value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StorageDriverRecord value12(Long value) {
        setClusterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StorageDriverRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, Date value7, Date value8, Date value9, Map<String,Object> value10, Long value11, Long value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(StorageDriver from) {
        setId(from.getId());
        setName(from.getName());
        setKind(from.getKind());
        setUuid(from.getUuid());
        setDescription(from.getDescription());
        setState(from.getState());
        setCreated(from.getCreated());
        setRemoved(from.getRemoved());
        setRemoveTime(from.getRemoveTime());
        setData(from.getData());
        setServiceId(from.getServiceId());
        setClusterId(from.getClusterId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends StorageDriver> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StorageDriverRecord
     */
    public StorageDriverRecord() {
        super(StorageDriverTable.STORAGE_DRIVER);
    }

    /**
     * Create a detached, initialised StorageDriverRecord
     */
    public StorageDriverRecord(Long id, String name, String kind, String uuid, String description, String state, Date created, Date removed, Date removeTime, Map<String,Object> data, Long serviceId, Long clusterId) {
        super(StorageDriverTable.STORAGE_DRIVER);

        set(0, id);
        set(1, name);
        set(2, kind);
        set(3, uuid);
        set(4, description);
        set(5, state);
        set(6, created);
        set(7, removed);
        set(8, removeTime);
        set(9, data);
        set(10, serviceId);
        set(11, clusterId);
    }
}