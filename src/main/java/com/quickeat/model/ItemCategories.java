package com.quickeat.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item_categories")
public class ItemCategories {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id; 
	
	@Column(name="name")
	private String name; 
	
	@Column(name="is_enabled")
	private int isEnabled; 
	
	@Column(name="created_at")
	private LocalDateTime created_at;
	
	@Column(name="updated_at")
	private LocalDateTime updatedAt; 
	
	@Column(name="user_id")
	private String userId;
	
	public ItemCategories() {
		// TODO Auto-generated constructor stub
	}

	public ItemCategories(Integer id, String name, int isEnabled, LocalDateTime created_at, LocalDateTime updatedAt,
			String userId) {
		super();
		Id = id;
		this.name = name;
		this.isEnabled = isEnabled;
		this.created_at = created_at;
		this.updatedAt = updatedAt;
		this.userId = userId;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		Id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the isEnabled
	 */
	public int getIsEnabled() {
		return isEnabled;
	}

	/**
	 * @param isEnabled the isEnabled to set
	 */
	public void setIsEnabled(int isEnabled) {
		this.isEnabled = isEnabled;
	}

	/**
	 * @return the created_at
	 */
	public LocalDateTime getCreated_at() {
		return created_at;
	}

	/**
	 * @param created_at the created_at to set
	 */
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	/**
	 * @return the updatedAt
	 */
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
}
