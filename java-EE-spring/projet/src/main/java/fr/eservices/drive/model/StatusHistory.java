package fr.eservices.drive.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StatusHistory {
	
	@Id
	private Integer id;
	private Date statusDate;
	private Status status;

	public StatusHistory() {
		
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
	 * @return the statusDate
	 */
	public final Date getStatusDate() {
		return statusDate;
	}

	/**
	 * @param statusDate the statusDate to set
	 */
	public final void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	/**
	 * @return the status
	 */
	public final Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public final void setStatus(Status status) {
		this.status = status;
	}
	
	

}
