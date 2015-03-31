/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "load_balancer_listener", schema = "cattle")
public interface LoadBalancerListener extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.load_balancer_listener.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.load_balancer_listener.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>cattle.load_balancer_listener.account_id</code>.
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Setter for <code>cattle.load_balancer_listener.kind</code>.
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>cattle.load_balancer_listener.uuid</code>.
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>cattle.load_balancer_listener.description</code>.
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>cattle.load_balancer_listener.state</code>.
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	/**
	 * Setter for <code>cattle.load_balancer_listener.created</code>.
	 */
	public void setCreated(java.util.Date value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	public java.util.Date getCreated();

	/**
	 * Setter for <code>cattle.load_balancer_listener.removed</code>.
	 */
	public void setRemoved(java.util.Date value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	public java.util.Date getRemoved();

	/**
	 * Setter for <code>cattle.load_balancer_listener.remove_time</code>.
	 */
	public void setRemoveTime(java.util.Date value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	public java.util.Date getRemoveTime();

	/**
	 * Setter for <code>cattle.load_balancer_listener.data</code>.
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 65535)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>cattle.load_balancer_listener.source_port</code>.
	 */
	public void setSourcePort(java.lang.Integer value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.source_port</code>.
	 */
	@javax.persistence.Column(name = "source_port", precision = 10)
	public java.lang.Integer getSourcePort();

	/**
	 * Setter for <code>cattle.load_balancer_listener.source_protocol</code>.
	 */
	public void setSourceProtocol(java.lang.String value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.source_protocol</code>.
	 */
	@javax.persistence.Column(name = "source_protocol", length = 255)
	public java.lang.String getSourceProtocol();

	/**
	 * Setter for <code>cattle.load_balancer_listener.target_port</code>.
	 */
	public void setTargetPort(java.lang.Integer value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.target_port</code>.
	 */
	@javax.persistence.Column(name = "target_port", precision = 10)
	public java.lang.Integer getTargetPort();

	/**
	 * Setter for <code>cattle.load_balancer_listener.target_protocol</code>.
	 */
	public void setTargetProtocol(java.lang.String value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.target_protocol</code>.
	 */
	@javax.persistence.Column(name = "target_protocol", length = 255)
	public java.lang.String getTargetProtocol();

	/**
	 * Setter for <code>cattle.load_balancer_listener.service_id</code>.
	 */
	public void setServiceId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.load_balancer_listener.service_id</code>.
	 */
	@javax.persistence.Column(name = "service_id", precision = 19)
	public java.lang.Long getServiceId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface LoadBalancerListener
	 */
	public void from(io.cattle.platform.core.model.LoadBalancerListener from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface LoadBalancerListener
	 */
	public <E extends io.cattle.platform.core.model.LoadBalancerListener> E into(E into);
}
