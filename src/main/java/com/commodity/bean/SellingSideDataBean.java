package com.commodity.bean;

import java.util.List;

public class SellingSideDataBean {

	private List<String> commodityFloatingPrice;

	private String effectiveDate;

	/**
	 * @return the commodityFloatingPrice
	 */
	public List<String> getCommodityFloatingPrice() {
		return commodityFloatingPrice;
	}

	/**
	 * @param commodityFloatingPrice the commodityFloatingPrice to set
	 */
	public void setCommodityFloatingPrice(List<String> commodityFloatingPrice) {
		this.commodityFloatingPrice = commodityFloatingPrice;
	}

	/**
	 * @return the effectiveDate
	 */
	public String getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * @param effectiveDate the effectiveDate to set
	 */
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SellingSideData [commodityFloatingPrice=" + commodityFloatingPrice + ", effectiveDate=" + effectiveDate
				+ "]";
	}
}
