package com.quickeat.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurants")
public class RegisterRestaurant {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id; 
	
	@Column(name="stall_id")
	private int stallId; 
	
	@Column(name="name")
	private String name; 
	
	@Column(name="description")
	private String description;
	
	@Column(name="location_id")
	private String locationId; 
	
	@Column(name="image")
	private String image;
	
	@Column(name="rating")
	private String rating ; 
	
	@Column(name="delivery_time")
	private String deliveryTime; 
	
	@Column(name="price_range")
	private String priceRange;
	
	@Column(name="is_pure_veg")
	private int isPureVeg;
	
	@Column(name="created_at")
	private LocalDateTime createdAt; 
	
	@Column(name="updated_at")
	private LocalDateTime updatedAt; 
	
	@Column(name="slug")
	private String slug; 
	
	@Column(name="placeholder_image")
	private String placeholderImage; 
	
	@Column(name="latitude")
	private String latitude; 
	
	@Column(name="longitude")
	private String longitude; 
	
	@Column(name="certificate")
	private String certificate; 
	
	@Column(name="restaurant_charges")
	private Double restaurantCharges;
	
	@Column(name="delivery_charges")
	private Double deliveryCharges; 
	
	@Column(name="address")
	private String address; 
	
	@Column(name="phone_no")
	private String phone; 
	
	@Column(name="pincode")
	private String pincode; 
	
	@Column(name="landmark")
	private String landmark;
	
	@Column(name="sku")
	private String sku; 
	
	@Column(name="is_active")
	private int isActive; 
	
	@Column(name="is_accepted")
	private int isAccepted; 
	
	@Column(name="is_featured")
	private int isFeatured; 
	
	@Column(name="commission_rate")
	private double commissionRate; 
	
	@Column(name="delivery_type")
	private int deliveryType; 
	
	@Column(name="delivery_radius")
	private double deliveryRadius; 
	
	@Column(name="delivery_charge_type")
	private String deliveryChargeType; 
	
	@Column(name="base_delivery_charge")
	private double baseDeliveryCharge; 
	
	@Column(name="base_delivery_distance")
	private int baseDeliveryDistance; 
	
	@Column(name="extra_delivery_charge")
	private double extraDeliveryCharge; 
	
	@Column(name="extra_delivery_distance")
	private int extraDeliveryDistance; 
	
	@Column(name="min_order_price")
	private double minOrderPrice; 
	
	@Column(name="is_notifiable")
	private int isNotifiable; 
	
	@Column(name="auto_acceptable")
	private int autoAcceptable; 
	
	@Column(name="schedule_data")
	private String scheduleData; 
	
	@Column(name="order_column")
	private int orderColumn; 
	
	public RegisterRestaurant(){
		
	}

	public RegisterRestaurant(int id, int stallId, String name, String description, String locationId, String image,
			String rating, String deliveryTime, String priceRange, int isPureVeg, LocalDateTime createdAt,
			LocalDateTime updatedAt, String slug, String placeholderImage, String latitude, String longitude,
			String certificate, Double restaurantCharges, Double deliveryCharges, String address, String phone,
			String pincode, String landmark, String sku, int isActive, int isAccepted, int isFeatured,
			double commissionRate, int deliveryType, double deliveryRadius, String deliveryChargeType,
			double baseDeliveryCharge, int baseDeliveryDistance, double extraDeliveryCharge, int extraDeliveryDistance,
			double minOrderPrice, int isNotifiable, int autoAcceptable, String scheduleData, int orderColumn) {
		super();
		this.id = id;
		this.stallId = stallId;
		this.name = name;
		this.description = description;
		this.locationId = locationId;
		this.image = image;
		this.rating = rating;
		this.deliveryTime = deliveryTime;
		this.priceRange = priceRange;
		this.isPureVeg = isPureVeg;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.slug = slug;
		this.placeholderImage = placeholderImage;
		this.latitude = latitude;
		this.longitude = longitude;
		this.certificate = certificate;
		this.restaurantCharges = restaurantCharges;
		this.deliveryCharges = deliveryCharges;
		this.address = address;
		this.phone = phone;
		this.pincode = pincode;
		this.landmark = landmark;
		this.sku = sku;
		this.isActive = isActive;
		this.isAccepted = isAccepted;
		this.isFeatured = isFeatured;
		this.commissionRate = commissionRate;
		this.deliveryType = deliveryType;
		this.deliveryRadius = deliveryRadius;
		this.deliveryChargeType = deliveryChargeType;
		this.baseDeliveryCharge = baseDeliveryCharge;
		this.baseDeliveryDistance = baseDeliveryDistance;
		this.extraDeliveryCharge = extraDeliveryCharge;
		this.extraDeliveryDistance = extraDeliveryDistance;
		this.minOrderPrice = minOrderPrice;
		this.isNotifiable = isNotifiable;
		this.autoAcceptable = autoAcceptable;
		this.scheduleData = scheduleData;
		this.orderColumn = orderColumn;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the stallId
	 */
	public int getStallId() {
		return stallId;
	}

	/**
	 * @param stallId the stallId to set
	 */
	public void setStallId(int stallId) {
		this.stallId = stallId;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the locationId
	 */
	public String getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * @return the deliveryTime
	 */
	public String getDeliveryTime() {
		return deliveryTime;
	}

	/**
	 * @param deliveryTime the deliveryTime to set
	 */
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	/**
	 * @return the priceRange
	 */
	public String getPriceRange() {
		return priceRange;
	}

	/**
	 * @param priceRange the priceRange to set
	 */
	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	/**
	 * @return the isPureVeg
	 */
	public int getIsPureVeg() {
		return isPureVeg;
	}

	/**
	 * @param isPureVeg the isPureVeg to set
	 */
	public void setIsPureVeg(int isPureVeg) {
		this.isPureVeg = isPureVeg;
	}

	/**
	 * @return the createdAt
	 */
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
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
	 * @return the slug
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * @param slug the slug to set
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}

	/**
	 * @return the placeholderImage
	 */
	public String getPlaceholderImage() {
		return placeholderImage;
	}

	/**
	 * @param placeholderImage the placeholderImage to set
	 */
	public void setPlaceholderImage(String placeholderImage) {
		this.placeholderImage = placeholderImage;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the certificate
	 */
	public String getCertificate() {
		return certificate;
	}

	/**
	 * @param certificate the certificate to set
	 */
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	/**
	 * @return the restaurantCharges
	 */
	public Double getRestaurantCharges() {
		return restaurantCharges;
	}

	/**
	 * @param restaurantCharges the restaurantCharges to set
	 */
	public void setRestaurantCharges(Double restaurantCharges) {
		this.restaurantCharges = restaurantCharges;
	}

	/**
	 * @return the deliveryCharges
	 */
	public Double getDeliveryCharges() {
		return deliveryCharges;
	}

	/**
	 * @param deliveryCharges the deliveryCharges to set
	 */
	public void setDeliveryCharges(Double deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the landmark
	 */
	public String getLandmark() {
		return landmark;
	}

	/**
	 * @param landmark the landmark to set
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * @return the isActive
	 */
	public int getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the isAccepted
	 */
	public int getIsAccepted() {
		return isAccepted;
	}

	/**
	 * @param isAccepted the isAccepted to set
	 */
	public void setIsAccepted(int isAccepted) {
		this.isAccepted = isAccepted;
	}

	/**
	 * @return the isFeatured
	 */
	public int getIsFeatured() {
		return isFeatured;
	}

	/**
	 * @param isFeatured the isFeatured to set
	 */
	public void setIsFeatured(int isFeatured) {
		this.isFeatured = isFeatured;
	}

	/**
	 * @return the commissionRate
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * @param commissionRate the commissionRate to set
	 */
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	/**
	 * @return the deliveryType
	 */
	public int getDeliveryType() {
		return deliveryType;
	}

	/**
	 * @param deliveryType the deliveryType to set
	 */
	public void setDeliveryType(int deliveryType) {
		this.deliveryType = deliveryType;
	}

	/**
	 * @return the deliveryRadius
	 */
	public double getDeliveryRadius() {
		return deliveryRadius;
	}

	/**
	 * @param deliveryRadius the deliveryRadius to set
	 */
	public void setDeliveryRadius(double deliveryRadius) {
		this.deliveryRadius = deliveryRadius;
	}

	/**
	 * @return the deliveryChargeType
	 */
	public String getDeliveryChargeType() {
		return deliveryChargeType;
	}

	/**
	 * @param deliveryChargeType the deliveryChargeType to set
	 */
	public void setDeliveryChargeType(String deliveryChargeType) {
		this.deliveryChargeType = deliveryChargeType;
	}

	/**
	 * @return the baseDeliveryCharge
	 */
	public double getBaseDeliveryCharge() {
		return baseDeliveryCharge;
	}

	/**
	 * @param baseDeliveryCharge the baseDeliveryCharge to set
	 */
	public void setBaseDeliveryCharge(double baseDeliveryCharge) {
		this.baseDeliveryCharge = baseDeliveryCharge;
	}

	/**
	 * @return the baseDeliveryDistance
	 */
	public int getBaseDeliveryDistance() {
		return baseDeliveryDistance;
	}

	/**
	 * @param baseDeliveryDistance the baseDeliveryDistance to set
	 */
	public void setBaseDeliveryDistance(int baseDeliveryDistance) {
		this.baseDeliveryDistance = baseDeliveryDistance;
	}

	/**
	 * @return the extraDeliveryCharge
	 */
	public double getExtraDeliveryCharge() {
		return extraDeliveryCharge;
	}

	/**
	 * @param extraDeliveryCharge the extraDeliveryCharge to set
	 */
	public void setExtraDeliveryCharge(double extraDeliveryCharge) {
		this.extraDeliveryCharge = extraDeliveryCharge;
	}

	/**
	 * @return the extraDeliveryDistance
	 */
	public int getExtraDeliveryDistance() {
		return extraDeliveryDistance;
	}

	/**
	 * @param extraDeliveryDistance the extraDeliveryDistance to set
	 */
	public void setExtraDeliveryDistance(int extraDeliveryDistance) {
		this.extraDeliveryDistance = extraDeliveryDistance;
	}

	/**
	 * @return the minOrderPrice
	 */
	public double getMinOrderPrice() {
		return minOrderPrice;
	}

	/**
	 * @param minOrderPrice the minOrderPrice to set
	 */
	public void setMinOrderPrice(double minOrderPrice) {
		this.minOrderPrice = minOrderPrice;
	}

	/**
	 * @return the isNotifiable
	 */
	public int getIsNotifiable() {
		return isNotifiable;
	}

	/**
	 * @param isNotifiable the isNotifiable to set
	 */
	public void setIsNotifiable(int isNotifiable) {
		this.isNotifiable = isNotifiable;
	}

	/**
	 * @return the autoAcceptable
	 */
	public int getAutoAcceptable() {
		return autoAcceptable;
	}

	/**
	 * @param autoAcceptable the autoAcceptable to set
	 */
	public void setAutoAcceptable(int autoAcceptable) {
		this.autoAcceptable = autoAcceptable;
	}

	/**
	 * @return the scheduleData
	 */
	public String getScheduleData() {
		return scheduleData;
	}

	/**
	 * @param scheduleData the scheduleData to set
	 */
	public void setScheduleData(String scheduleData) {
		this.scheduleData = scheduleData;
	}

	/**
	 * @return the orderColumn
	 */
	public int getOrderColumn() {
		return orderColumn;
	}

	/**
	 * @param orderColumn the orderColumn to set
	 */
	public void setOrderColumn(int orderColumn) {
		this.orderColumn = orderColumn;
	}
	
	
	
}
