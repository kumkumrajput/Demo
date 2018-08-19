package com.commodity.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Table(name = "swaps_tb")
@DynamicUpdate
@Entity
public class Swaps {
	
	private Integer id;

	private String commodityId;

	private String exchange;

	private String counterParty;

	private String startDate;

	private String endDate;

	private String tradeType;

	private String contractDate;
	
	private float commFixed;
	
	private String eDateBuy;
	
	private float commFloat;
	
	private String eDateSell;
	
	private String ack;

	/**
	 * @return the id
	 */
	@Id
    @Column(name="pk_swaps_tb")
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
	 * @return the tradeType
	 */
	@Column(name="trade_type")
	public String getTradeType() {
		return tradeType;
	}

	/**
	 * @param tradeType the tradeType to set
	 */
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	/**
	 * @return the commFixed
	 */
	@Column(name="commodity_fixed")
	public float getCommFixed() {
		return commFixed;
	}

	/**
	 * @param commFixed the commFixed to set
	 */
	public void setCommFixed(float commFixed) {
		this.commFixed = commFixed;
	}

	/**
	 * @return the eDateBuy
	 */
	@Column(name="eff_date_buying")
	public String geteDateBuy() {
		return eDateBuy;
	}

	/**
	 * @param eDateBuy the eDateBuy to set
	 */
	public void seteDateBuy(String eDateBuy) {
		this.eDateBuy = eDateBuy;
	}

	/**
	 * @return the commFloat
	 */
	@Column(name="commodity_floating")
	public float getCommFloat() {
		return commFloat;
	}

	/**
	 * @param commFloat the commFloat to set
	 */
	public void setCommFloat(float commFloat) {
		this.commFloat = commFloat;
	}

	/**
	 * @return the eDateSell
	 */
	@Column(name="eff_date_selling")
	public String geteDateSell() {
		return eDateSell;
	}

	/**
	 * @param eDateSell the eDateSell to set
	 */
	public void seteDateSell(String eDateSell) {
		this.eDateSell = eDateSell;
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
		return "Swaps [id=" + id + ", commodityId=" + commodityId + ", exchange=" + exchange + ", counterParty="
				+ counterParty + ", startDate=" + startDate + ", endDate=" + endDate + ", tradeType=" + tradeType
				+ ", contractDate=" + contractDate + ", commFixed=" + commFixed + ", eDateBuy=" + eDateBuy
				+ ", commFloat=" + commFloat + ", eDateSell=" + eDateSell + ", ack=" + ack + "]";
	}

	
}
