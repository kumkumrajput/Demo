package com.commodity.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Table(name="futures_tb")
@DynamicUpdate
@Entity
public class Futures {	
	
	private Integer id;
	
	private String commodityId;
	
	private String exchange;
	
	private String counterParty;
	
	private float futurePrice;
	
	private String startDate;
		
	private String endDate;
	
	private String investType;
	
	private String contractDate;
	
	private String ack;

	/**
	 * @return the id
	 */
	@Id
    @Column(name="pk_futures_tb")
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
	 * @return the commodityId
	 */
	@Column(name="commodity_id")
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
	 * @return the exchange
	 */
	@Column(name="exchange")
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
	@Column(name="counter_party")
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
	@Column(name="future_price")
	public float getFuturePrice() {
		return futurePrice;
	}

	/**
	 * @param futurePrice the futurePrice to set
	 */
	public void setFuturePrice(float futurePrice) {
		this.futurePrice = futurePrice;
	}

	/**
	 * @return the startDate
	 */
	@Column(name="start_date")
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
	@Column(name="end_date")
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
	 * @return the investType
	 */
	@Column(name="investment_type")
	public String getInvestType() {
		return investType;
	}

	/**
	 * @param investType the investType to set
	 */
	public void setInvestType(String investType) {
		this.investType = investType;
	}

	/**
	 * @return the contractDate
	 */
	@Column(name="contract_date")
	public String getContractDate() {
		return contractDate;
	}

	/**
	 * @param contractDate the contractDate to set
	 */
	public void setContractDate(String contractDate) {
		this.contractDate = contractDate;
	}

	/**
	 * @return the ack
	 */
	@Column(name="ack")
	public String getAck() {
		return ack;
	}

	/**
	 * @param ack the ack to set
	 */
	public void setAck(String ack) {
		this.ack = ack;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Futures [id=" + id + ", commodityId=" + commodityId + ", exchange=" + exchange + ", counterParty="
				+ counterParty + ", futurePrice=" + futurePrice + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", investType=" + investType + ", contractDate=" + contractDate + ", ack=" + ack + "]";
	}

	
}
