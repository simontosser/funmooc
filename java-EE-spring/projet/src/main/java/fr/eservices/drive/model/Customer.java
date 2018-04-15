/**
 * 
 */
package fr.eservices.drive.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author simon
 *
 */
@Entity
public class Customer {
	
	@Id
	private Integer id;
	private String login;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Cart activeCart;
	private Set<Cart> carts;
	private Set<Order> orders;
	

	/**
	 * 
	 */
	public Customer() {
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
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}


	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the activeCart
	 */
	public Cart getActiveCart() {
		return activeCart;
	}


	/**
	 * @param activeCart the activeCart to set
	 */
	public void setActiveCart(Cart activeCart) {
		this.activeCart = activeCart;
	}


	/**
	 * @return the carts
	 */
	public Set<Cart> getCarts() {
		return carts;
	}


	/**
	 * @param carts the carts to set
	 */
	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}


	/**
	 * @return the orders
	 */
	public Set<Order> getOrders() {
		return orders;
	}


	/**
	 * @param orders the orders to set
	 */
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	

}
