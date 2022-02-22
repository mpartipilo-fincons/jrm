package com.fincons.srm.model;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;

@Entity(name = "test_contracts" )
public class Contracts {

	private UUID id;
	private String status;
	private String name;
	private LocalDateTime dateCreated;
	private LocalDateTime dateUpdated;
	private UUID userCreated;
	private UUID userUpdated;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	public LocalDateTime getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(LocalDateTime dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	public UUID getUserCreated() {
		return userCreated;
	}
	public void setUserCreated(UUID userCreated) {
		this.userCreated = userCreated;
	}
	public UUID getUserUpdated() {
		return userUpdated;
	}
	public void setUserUpdated(UUID userUpdated) {
		this.userUpdated = userUpdated;
	}
 }
