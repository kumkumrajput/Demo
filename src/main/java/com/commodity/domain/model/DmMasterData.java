package com.commodity.domain.model;

//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Table(name="dm_masterdata_tb")
@DynamicUpdate
@Entity
public class DmMasterData {
	
	private Integer id;
	private String counterpartyId;
	private String name;
	private String address;
	private String bankName;
	private Integer bankAcc;
	private String contact;
	private String auth;
	
	
	/**
	 * @return the id
	 */
	@Id
    @Column(name="pk_dm_masterdata_tb")
    @GeneratedValue(strategy= GenerationType.AUTO)
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
	 * @return the counterpartyId
	 */
	@Column(name="counterparty")
	public String getCounterpartyId() {
		return counterpartyId;
	}
	/**
	 * @param counterpartyId the counterpartyId to set
	 */
	public void setCounterpartyId(String counterpartyId) {
		this.counterpartyId = counterpartyId;
	}
	/**
	 * @return the name
	 */
	@Column(name="name")
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
	 * @return the address
	 */
	@Column(name="address")
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
	 * @return the bankName
	 */
	@Column(name="bank_name")
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the bankAcc
	 */
	@Column(name="bank_account")
	public Integer getBankAcc() {
		return bankAcc;
	}
	/**
	 * @param bankAcc the bankAcc to set
	 */
	public void setBankAcc(Integer bankAcc) {
		this.bankAcc = bankAcc;
	}
	/**
	 * @return the contact
	 */
	@Column(name="contact_person")
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	/**
	 * @return the auth
	 */
	@Column(name="authorization")
	public String getAuth() {
		return auth;
	}
	/**
	 * @param auth the auth to set
	 */
	public void setAuth(String auth) {
		this.auth = auth;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DmMasterData [id=" + id + ", counterpartyId=" + counterpartyId + ", name=" + name + ", address="
				+ address + ", bankName=" + bankName + ", bankAcc=" + bankAcc + ", contact=" + contact + ", auth="
				+ auth + "]";
	}
	
	

}
