package model;

import java.io.Serializable;

import org.apache.tomcat.util.codec.binary.Base64;


public class Items implements Serializable
{
	private String itemName;
	private String categoryId;
	private String yearsOfUsage;
	private String itemId;
	private byte[] itemImage;
	private String userId;
	private String price;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getYearsOfUsage() {
		return yearsOfUsage;
	}
	public void setYearsOfUsage(String yearsOfUsage) {
		this.yearsOfUsage = yearsOfUsage;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public byte[] getItemImage() {
		return itemImage;
	}
	public void setItemImage(byte[] itemImage) {
		this.itemImage = itemImage;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getImage()
	{
		String s = "";
		
	     s = Base64.encodeBase64String(getItemImage());
	     
	     return s;
		
	}
	
	
	Items()
	{
		
	}
	
	public Items(String itemName, String categoryId, String yearsOfUsage, String itemId, byte[] itemImage,
			String userId, String price) {
		super();
		this.itemName = itemName;
		this.categoryId = categoryId;
		this.yearsOfUsage = yearsOfUsage;
		this.itemId = itemId;
		this.itemImage = itemImage;
		this.userId = userId;
		this.price = price;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	

}
