package model;
public class Address
{
	private String street;
	private String subLocation;
	private String city;
	private String state;
	private String country;
	private String pincode;
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSubLocation() {
		return subLocation;
	}
	public void setSubLocation(String subLocation) {
		this.subLocation = subLocation;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	Address()
	{
		
	}
	
	public Address(String street, String subLocation, String city, String state, String country, String pincode, String userId) {
		super();
		this.street = street;
		this.subLocation = subLocation;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.userId = userId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
