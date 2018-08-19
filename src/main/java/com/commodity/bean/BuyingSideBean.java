package com.commodity.bean;

public class BuyingSideBean {
	
	private String commodityFixedPrice;
	
	private String effectiveDate;

	/**
	 * @return the commodityFixedPrice
	 */
	public String getCommodityFixedPrice() {
		return commodityFixedPrice;
	}

	/**
	 * @param commodityFixedPrice the commodityFixedPrice to set
	 */
	public void setCommodityFixedPrice(String commodityFixedPrice) {
		this.commodityFixedPrice = commodityFixedPrice;
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
		return "BuyingSideBean [commodityFixedPrice=" + commodityFixedPrice + ", effectiveDate=" + effectiveDate + "]";
	}
}	
