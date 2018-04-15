package fr.eservices.drive.model;

import java.util.Date;

public class Perishable extends Article{

	private Date bestBefore;
	private String lot;
	
	public Perishable() {
	}
		
	public Perishable(Integer id, String ean13, int price, Float vat, String name, String img, Category category,
			Date bestBefore, String lot) {
		super(id, ean13, price, vat, name, img, category);
		this.bestBefore = bestBefore;
		this.lot = lot;
	}



	/**
	 * @return the bestBefore
	 */
	public Date getBestBefore() {
		return bestBefore;
	}
	/**
	 * @param bestBefore the bestBefore to set
	 */
	public void setBestBefore(Date bestBefore) {
		this.bestBefore = bestBefore;
	}
	/**
	 * @return the lot
	 */
	public String getLot() {
		return lot;
	}
	/**
	 * @param lot the lot to set
	 */
	public void setLot(String lot) {
		this.lot = lot;
	}
	
	

}
