package com.springboot.foodorder.main.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;




@Entity
public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	String imageUrl;
	String name;
	int price;
	boolean favorite;
	int star;
	
	String[] tags;
	String cookTime;
	String[] origins;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public String getCookTime() {
		return cookTime;
	}
	public void setCookTime(String cookTime) {
		this.cookTime = cookTime;
	}
	public String[] getOrigins() {
		return origins;
	}
	public void setOrigins(String[] origins) {
		this.origins = origins;
	}
	public Food(long id, String imageUrl, String name, int price, boolean favorite, int star, String[] tags,
			String cookTime, String[] origins) {
		super();
		this.id = id;
		this.imageUrl = imageUrl;
		this.name = name;
		this.price = price;
		this.favorite = favorite;
		this.star = star;
		this.tags = tags;
		this.cookTime = cookTime;
		this.origins = origins;
	}
	public Food(String imageUrl, String name, int price, boolean favorite, int star, String[] tags, String cookTime,
			String[] origins) {
		super();
		this.imageUrl = imageUrl;
		this.name = name;
		this.price = price;
		this.favorite = favorite;
		this.star = star;
		this.tags = tags;
		this.cookTime = cookTime;
		this.origins = origins;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
