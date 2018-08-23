package com.commodity.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Table(name = "forwards_tb")
@DynamicUpdate
@Entity
public class Forwards {

	private Integer id;

	private String commodityId;

	private String exchange;

	private String counterParty;

	private String startDate;

	private String endDate;

	private String investType;

	private String contractDate;

	private float forwardPrice;

	private float spotPrice;

	private String ack;

	/**
	 * @return the id
	 */
	@Id
    @Column(name="pk_forwards_tb")
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
	 * @return the forwardPrice
	 */
	@Column(name="forward_price")
	public float getForwardPrice() {
		return forwardPrice;
	}

	/**
	 * @param forwardPrice the forwardPrice to set
	 */
	public void setForwardPrice(float forwardPrice) {
		this.forwardPrice = forwardPrice;
	}

	/**
	 * @return the spotPrice
	 */
	@Column(name="spot_price")
	public float getSpotPrice() {
		return spotPrice;
	}

	/**
	 * @param spotPrice the spotPrice to set
	 */
	public void setSpotPrice(float spotPrice) {
		this.spotPrice = spotPrice;
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

	
}
