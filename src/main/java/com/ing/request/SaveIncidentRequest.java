package com.ing.request;

import java.io.Serializable;


public class SaveIncidentRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String description;
	private Integer priority;
	private String raisedBy;
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "SaveIncidentRequest [name=" + name + ", description=" + description + ", priority=" + priority
				+ ", updatedBy=" + raisedBy + "]";
	}
	public String getRaisedBy() {
		return raisedBy;
	}
	public void setRaisedBy(String raisedBy) {
		this.raisedBy = raisedBy;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	/*
	 * public String getUpdatedBy() { return updatedBy; } public void
	 * setUpdatedBy(String updatedBy) { this.updatedBy = updatedBy; }
	 */
}
