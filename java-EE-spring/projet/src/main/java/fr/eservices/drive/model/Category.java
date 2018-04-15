/**
 * 
 */
package fr.eservices.drive.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author simon
 *
 */
@Entity
public class Category {
	
	@Id
	private Integer id;
	private String name;
	private int orderIdx;
	

	/**
	 * 
	 */
	
	public Category() {
	}

	/**
	 * @return the id
	 */
	public final Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the orderIdx
	 */
	public final int getOrderIdx() {
		return orderIdx;
	}

	/**
	 * @param orderIdx the orderIdx to set
	 */
	public final void setOrderIdx(int orderIdx) {
		this.orderIdx = orderIdx;
	}

}
