package com.commodity.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Table(name = "listed_tb")
@DynamicUpdate
@Entity
public class Listed {

	private Integer id;

	private String commodityId;

	private String exchange;

	private String counterParty;

	private String startDate;

	private String maturityDate;

	private String investType;

	private String contractDate;	

	private String ack;
	
	private float option;
	
	private float strikePrice;
	
	private String callPutt;

	/**
	 * @return the id
	 */
	@Id
    @Column(name="pk_listed_tb")
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
	 * @return the maturityDate
	 */
	@Column(name="maturity_date")
	public String getMaturityDate() {
		return maturityDate;
	}

	/**
	 * @param maturityDate the maturityDate to set
	 */
	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
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
	
	

	/**
	 * @return the strikePrice
	 */
	@Column(name="strike_price")
	public float getStrikePrice() {
		return strikePrice;
	}

	/**
	 * @param strikePrice the strikePrice to set
	 */
	public void setStrikePrice(float strikePrice) {
		this.strikePrice = strikePrice;
	}

	/**
	 * @return the option
	 */
	@Column(name="option_premium")
	public float getOption() {
		return option;
	}

	/**
	 * @param option the option to set
	 */
	public void setOption(float option) {
		this.option = option;
	}

		/**
	 * @return the callPutt
	 */
	@Column(name="call_putt")
	public String getCallPutt() {
		return callPutt;
	}

	/**
	 * @param callPutt the callPutt to set
	 */
	public void setCallPutt(String callPutt) {
		this.callPutt = callPutt;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Listed [id=" + id + ", commodityId=" + commodityId + ", exchange=" + exchange + ", counterParty="
				+ counterParty + ", startDate=" + startDate + ", maturityDate=" + maturityDate + ", investType="
				+ investType + ", contractDate=" + contractDate + ", ack=" + ack + ", option=" + option
				+ ", strikePrice=" + strikePrice + ", callPutt=" + callPutt + "]";
	}

	
	
	

}
