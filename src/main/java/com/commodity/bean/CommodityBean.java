package com.commodity.bean;

import java.util.Map;

public class CommodityBean {
	
	private String primaryKey;
	
	private String commodityId;
	
	private Map<String, String> commodityIdMap;
	
	private String exchange;
	
	private String counterParty;
	
	private String futurePrice;

	private String startDate;
	
	private String endDate;
	
	private String maturity;
	
	private String strikePrice;
	
	private String optionPremium;
	
	//1.1 included forwardPrice & spotPrice
	private String forwardPrice;
	
	private String spotPrice;
	
	private String strikePriceOption;
	
	private ContractDataBean contractDataBean;
	
	private BuyingSideBean buyingSideBean;
	
	private String agreementNumber;
	
	private SellingSideDataBean sellingSideDataBean;

	/**
	 * @return the primaryKey
	 */
	public String getPrimaryKey() {
		return primaryKey;
	}

	/**
	 * @param primaryKey the primaryKey to set
	 */
	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	/**
	 * @return the commodityId
	 */
	public String getCommodityId() {
		return commodityId;
	}

	/**
	 * @param commodityId the commodityId to set
	 */
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	/**
	 * @return the commodityIdMap
	 */
	public Map<String, String> getCommodityIdMap() {
		return commodityIdMap;
	}

	/**
	 * @param commodityIdMap the commodityIdMap to set
	 */
	public void setCommodityIdMap(Map<String, String> commodityIdMap) {
		this.commodityIdMap = commodityIdMap;
	}

	/**
	 * @return the exchange
	 */
	public String getExchange() {
		return exchange;
	}

	/**
	 * @param exchange the exchange to set
	 */
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	/**
	 * @return the counterParty
	 */
	public String getCounterParty() {
		return counterParty;
	}

	/**
	 * @param counterParty the counterParty to set
	 */
	public void setCounterParty(String counterParty) {
		this.counterParty = counterParty;
	}

	/**
	 * @return the futurePrice
	 */
	public String getFuturePrice() {
		return futurePrice;
	}

	/**
	 * @param futurePrice the futurePrice to set
	 */
	public void setFuturePrice(String futurePrice) {
		this.futurePrice = futurePrice;
	}

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the maturity
	 */
	public String getMaturity() {
		return maturity;
	}

	/**
	 * @param maturity the maturity to set
	 */
	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}

	/**
	 * @return the strikePrice
	 */
	public String getStrikePrice() {
		return strikePrice;
	}

	/**
	 * @param strikePrice the strikePrice to set
	 */
	public void setStrikePrice(String strikePrice) {
		this.strikePrice = strikePrice;
	}

	/**
	 * @return the optionPremium
	 */
	public String getOptionPremium() {
		return optionPremium;
	}

	/**
	 * @param optionPremium the optionPremium to set
	 */
	public void setOptionPremium(String optionPremium) {
		this.optionPremium = optionPremium;
	}

	/**
	 * @return the forwardPrice
	 */
	public String getForwardPrice() {
		return forwardPrice;
	}

	/**
	 * @param forwardPrice the forwardPrice to set
	 */
	public void setForwardPrice(String forwardPrice) {
		this.forwardPrice = forwardPrice;
	}

	/**
	 * @return the spotPrice
	 */
	public String getSpotPrice() {
		return spotPrice;
	}

	/**
	 * @param spotPrice the spotPrice to set
	 */
	public void setSpotPrice(String spotPrice) {
		this.spotPrice = spotPrice;
	}

	/**
	 * @return the strikePriceOption
	 */
	public String getStrikePriceOption() {
		return strikePriceOption;
	}

	/**
	 * @param strikePriceOption the strikePriceOption to set
	 */
	public void setStrikePriceOption(String strikePriceOption) {
		this.strikePriceOption = strikePriceOption;
	}

	/**
	 * @return the contractDataBean
	 */
	public ContractDataBean getContractDataBean() {
		return contractDataBean;
	}

	/**
	 * @param contractDataBean the contractDataBean to set
	 */
	public void setContractDataBean(ContractDataBean contractDataBean) {
		this.contractDataBean = contractDataBean;
	}

	/**
	 * @return the buyingSideBean
	 */
	public BuyingSideBean getBuyingSideBean() {
		return buyingSideBean;
	}

	/**
	 * @param buyingSideBean the buyingSideBean to set
	 */
	public void setBuyingSideBean(BuyingSideBean buyingSideBean) {
		this.buyingSideBean = buyingSideBean;
	}

	/**
	 * @return the agreementNumber
	 */
	public String getAgreementNumber() {
		return agreementNumber;
	}

	/**
	 * @param agreementNumber the agreementNumber to set
	 */
	public void setAgreementNumber(String agreementNumber) {
		this.agreementNumber = agreementNumber;
	}

	/**
	 * @return the sellingSideDataBean
	 */
	public SellingSideDataBean getSellingSideDataBean() {
		return sellingSideDataBean;
	}

	/**
	 * @param sellingSideDataBean the sellingSideDataBean to set
	 */
	public void setSellingSideDataBean(SellingSideDataBean sellingSideDataBean) {
		this.sellingSideDataBean = sellingSideDataBean;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommodityBean [primaryKey=" + primaryKey + ", commodityId=" + commodityId + ", commodityIdMap="
				+ commodityIdMap + ", exchange=" + exchange + ", counterParty=" + counterParty + ", futurePrice="
				+ futurePrice + ", startDate=" + startDate + ", endDate=" + endDate + ", maturity=" + maturity
				+ ", strikePrice=" + strikePrice + ", optionPremium=" + optionPremium + ", forwardPrice=" + forwardPrice
				+ ", spotPrice=" + spotPrice + ", strikePriceOption=" + strikePriceOption + ", contractDataBean="
				+ contractDataBean + ", buyingSideBean=" + buyingSideBean + ", agreementNumber=" + agreementNumber
				+ ", sellingSideDataBean=" + sellingSideDataBean + "]";
	}
}
