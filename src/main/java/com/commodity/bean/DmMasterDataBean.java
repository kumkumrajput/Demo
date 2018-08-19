package com.commodity.bean;

import java.util.List;

//import java.util.List;

public class DmMasterDataBean {
	
	private String counterPartyId;
	private String name;
	private String address;
	private String bankName;
	private String bankAcc;
	private String contactPerson;
	private  List<String> auth;
	/**
	 * @return the counterPartyId
	 */
	public String getCounterPartyId() {
		return counterPartyId;
	}
	/**
	 * @param counterPartyId the counterPartyId to set
	 */
	public void setCounterPartyId(String counterPartyId) {
		this.counterPartyId = counterPartyId;
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
	 * @return the address
	 */
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
	public String getBankAcc() {
		return bankAcc;
	}
	/**
	 * @param bankAcc the bankAcc to set
	 */
	public void setBankAcc(String bankAcc) {
		this.bankAcc = bankAcc;
	}
	/**
	 * @return the contactPerson
	 */
	public String getContactPerson() {
		return contactPerson;
	}
	/**
	 * @param contactPerson the contactPerson to set
	 */
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	/**
	 * @return the auth
	 */
	public List<String> getAuth() {
		return auth;
	}
	/**
	 * @param auth the auth to set
	 */
	public void setAuth(List<String> auth) {
		this.auth = auth;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DmMasterDataBean [counterPartyId=" + counterPartyId + ", name=" + name + ", address=" + address
				+ ", bankName=" + bankName + ", bankAcc=" + bankAcc + ", contactPerson=" + contactPerson + ", auth="
				+ auth + "]";
	}
}
