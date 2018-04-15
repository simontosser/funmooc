/**
 * 
 */
package fr.eservices.drive.model;

/**
 * @author simon
 *
 */
public class Product extends Article {

	/**
	 * 
	 */
	public Product() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param ean13
	 * @param price
	 * @param vat
	 * @param name
	 * @param img
	 * @param category
	 */
	public Product(Integer id, String ean13, int price, Float vat, String name, String img, Category category) {
		super(id, ean13, price, vat, name, img, category);
	}

}
