package com.quickeat.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.hibernate.annotations.GenericGenerator;

import com.sun.istack.NotNull;

/**
 * This is Users Entity Class
 * 
 * @author sheikhhameed
 *
 */
@Entity
@Table(name = "Users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GenericGenerator(name = "native",strategy = "native")
	@Column(name = "id") 
	private Integer Id;

	@Column(name = "name")
	@NotNull
	private String name;

	@Column(name = "email")
	@NotNull
	@Email
	private String email;

	@Column(name = "email_verified_at")
	private LocalDateTime emailVerifiedat;

	@Column(name = "password")
	@NotNull
	private String password;

	@Column(name = "remember_token")
	private String rememberToken;

	@Column(name = "created_at")
//	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
//	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime updatedAt;

	@Column(name = "auth_token")
	private String authToken;

	@Column(name = "phone")
	@NotNull
	private String phone;

	@Column(name = "default_address_id")
	private Integer defaultAddrId;

	@Column(name = "delivery_pin")
	private String deliveryPin;

	@Column(name = "delivery_guy_detail_id")
	private Integer deliveryGuyDetailId;

	@Column(name = "avatar")
	private String avatar;

	@Column(name = "restaurant_id")
	private Integer restaurantId;

	@Column(name = "item_id")
	private String itemId;

	@Column(name = "status")
	@NotNull
	private String status;

	/**
	 * Default Constructor
	 */
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Entity object with constructor with object
	 * 
	 * @param Id
	 * @param name
	 * @param email
	 * @param emailVerifiedat
	 * @param password
	 * @param rememberToken
	 * @param createdAt
	 * @param updatedAt
	 * @param authToken
	 * @param phone
	 * @param defaultAddrId
	 * @param deliveryPin
	 * @param deliveryGuyDetailId
	 * @param avatar
	 * @param restaurantId
	 * @param itemId
	 * @param status
	 */
	public Users(Integer Id, String name, String email, LocalDateTime emailVerifiedat, String password,
			String rememberToken, LocalDateTime createdAt, LocalDateTime updatedAt, String authToken, String phone,
			Integer defaultAddrId, String deliveryPin, Integer deliveryGuyDetailId, String avatar, Integer restaurantId,
			String itemId, String status) {
		super();
		this.Id = Id;
		this.name = name;
		this.email = email;
		this.emailVerifiedat = emailVerifiedat;
		this.password = password;
		this.rememberToken = rememberToken;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.authToken = authToken;
		this.phone = phone;
		this.defaultAddrId = defaultAddrId;
		this.deliveryPin = deliveryPin;
		this.deliveryGuyDetailId = deliveryGuyDetailId;
		this.avatar = avatar;
		this.restaurantId = restaurantId;
		this.itemId = itemId;
		this.status = status;
	}

	/**
	 * This will get userId
	 * 
	 * @return
	 */
	public Integer getId() {
		return Id;
	}

	/**
	 * This will set Id 
	 * @param Id
	 */
	public void setId(Integer Id) {
		this.Id = Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getEmailVerifiedat() {
		return emailVerifiedat;
	}

	public void setEmailVerifiedat(LocalDateTime emailVerifiedat) {
		this.emailVerifiedat = emailVerifiedat;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRememberToken() {
		return rememberToken;
	}

	public void setRememberToken(String rememberToken) {
		this.rememberToken = rememberToken;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getDefaultAddrId() {
		return defaultAddrId;
	}

	public void setDefaultAddrId(Integer defaultAddrId) {
		this.defaultAddrId = defaultAddrId;
	}

	public String getDeliveryPin() {
		return deliveryPin;
	}

	public void setDeliveryPin(String deliveryPin) {
		this.deliveryPin = deliveryPin;
	}

	public Integer getDeliveryGuyDetailId() {
		return deliveryGuyDetailId;
	}

	public void setDeliveryGuyDetailId(Integer deliveryGuyDetailId) {
		this.deliveryGuyDetailId = deliveryGuyDetailId;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "RegisterEntity [Id=" + Id + ", name=" + name + ",email=" + email + ", emailVerifiedat="
				+ emailVerifiedat + ", password=" + password + ", rememberToken=" + rememberToken + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", authToken=" + authToken + ", phone=" + phone
				+ ", defaultAddrId=" + defaultAddrId + ", deliveryPin=" + deliveryPin + ", deliveryGuyDetailId="
				+ deliveryGuyDetailId + ", avatar=" + avatar + ", restaurantId=" + restaurantId + ", itemId=" + itemId
				+ ", status=" + status + "]";
	}

}
