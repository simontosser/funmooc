package fr.eservices.drive.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Article {
	
	@Id
	protected Integer id;
	protected String ean13;
	protected int price;
	protected Float vat;
	protected String name;
	protected String img;
	protected Category category;
	protected List<Cart> carts;
	protected List<Order> orders;
		
	public Article() {
		super();
	}
		
	public Article(Integer id, String ean13, int price, Float vat, String name, String img, Category category) {
		super();
		
		this.id = id;
		this.ean13 = ean13;
		this.price = price;
		this.vat = vat;
		this.name = name;
		this.img = img;
		this.category = category;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the ean13
	 */
	public String getEan13() {
		return ean13;
	}
	/**
	 * @param ean13 the ean13 to set
	 */
	public void setEan13(String ean13) {
		this.ean13 = ean13;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the vat
	 */
	public Float getVat() {
		return vat;
	}
	/**
	 * @param vat the vat to set
	 */
	public void setVat(Float vat) {
		this.vat = vat;
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
	 * @return the img
	 */
	public String getImg() {
		return img;
	}
	/**
	 * @param img the img to set
	 */
	public void setImg(String img) {
		this.img = img;
	}

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * @return the carts
	 */
	public List<Cart> getCarts() {
		return carts;
	}

	/**
	 * @param carts the carts to set
	 */
	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	/**
	 * @return the orders
	 */
	public List<Order> getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}


	
	

}
