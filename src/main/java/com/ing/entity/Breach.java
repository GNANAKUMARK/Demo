package com.ing.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="Breach_Complaince")
@NamedQuery(name="Breach.updateIncident",query="update Breach b set b.status= :status , b.updatedBy=:updatedBy where b.id=:breachId")
public class Breach implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	//Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Column(name="Name")
	String name;
	
	@Column(name="Description")
	String description;
	
	@Column(name="priority")
	Integer priority;
	
	@Column(name="status")
	String status;
	
	@Column(name="updatedBy")
	String updatedBy;
	
	@Column(name="raisedBy")
	String raisedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public String getDescription() { return descrition; }
	 * 
	 * public void setDesc(String desc) { this.descrition = descrition; }
	 */
	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getRaisedBy() {
		return raisedBy;
	}

	public void setRaisedBy(String raisedBy) {
		this.raisedBy = raisedBy;
	}
	

	//String department;
	
	

}
