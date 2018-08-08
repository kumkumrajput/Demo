package com.commodity.bean;

public class ContractDataBean {
	
	private String typeOfInvestment;
	
	private String contractDate;
	
	//1.1 included Type of Trade
	private String typeOfTrade;

	public String getTypeOfTrade() {
		return typeOfTrade;
	}

	public void setTypeOfTrade(String typeOfTrade) {
		this.typeOfTrade = typeOfTrade;
	}

	/**
	 * @return the typeOfInvestment
	 */
	public String getTypeOfInvestment() {
		return typeOfInvestment;
	}

	/**
	 * @param typeOfInvestment the typeOfInvestment to set
	 */
	public void setTypeOfInvestment(String typeOfInvestment) {
		this.typeOfInvestment = typeOfInvestment;
	}

	/**
	 * @return the contractDate
	 */
	public String getContractDate() {
		return contractDate;
	}

	/**
	 * @param contractDate the contractDate to set
	 */
	public void setContractDate(String contractDate) {
		this.contractDate = contractDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContractDataBean [typeOfInvestment=" + typeOfInvestment + ", contractDate=" + contractDate + ", typeOfTrade=" +typeOfTrade+"]";
	}
}
