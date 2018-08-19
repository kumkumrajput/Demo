package com.commodity.rest.dto;

import java.util.List;

import com.commodity.domain.model.DmCommodityId;
import com.commodity.domain.model.DmMasterData;
import com.commodity.domain.model.Forwards;
import com.commodity.domain.model.Futures;
import com.commodity.domain.model.Listed;
import com.commodity.domain.model.Swaps;

public class Data {
	
	public List<Futures> futures;
	
	public List<Listed> listedOptions;
	
	public List<Forwards> forwards;
	
	public List<Swaps> swaps;
	
	public List<DmCommodityId> dmCommodityId;
	
	public List<DmMasterData> dmMasterData;

	/**
	 * @return the futures
	 */
	public List<Futures> getFutures() {
		return futures;
	}

	/**
	 * @param futures the futures to set
	 */
	public void setFutures(List<Futures> futures) {
		this.futures = futures;
	}

	/**
	 * @return the listedOptions
	 */
	public List<Listed> getListedOptions() {
		return listedOptions;
	}

	/**
	 * @param listedOptions the listedOptions to set
	 */
	public void setListedOptions(List<Listed> listedOptions) {
		this.listedOptions = listedOptions;
	}

	/**
	 * @return the forwards
	 */
	public List<Forwards> getForwards() {
		return forwards;
	}

	/**
	 * @param forwards the forwards to set
	 */
	public void setForwards(List<Forwards> forwards) {
		this.forwards = forwards;
	}

	/**
	 * @return the swaps
	 */
	public List<Swaps> getSwaps() {
		return swaps;
	}

	/**
	 * @param swaps the swaps to set
	 */
	public void setSwaps(List<Swaps> swaps) {
		this.swaps = swaps;
	}
	
	

	/**
	 * @return the dmCommodityId
	 */
	public List<DmCommodityId> getDmCommodityId() {
		return dmCommodityId;
	}

	/**
	 * @param dmCommodityId the dmCommodityId to set
	 */
	public void setDmCommodityId(List<DmCommodityId> dmCommodityId) {
		this.dmCommodityId = dmCommodityId;
	}

	/**
	 * @return the dmMasterData
	 */
	public List<DmMasterData> getDmMasterData() {
		return dmMasterData;
	}

	/**
	 * @param dmMasterData the dmMasterData to set
	 */
	public void setDmMasterData(List<DmMasterData> dmMasterData) {
		this.dmMasterData = dmMasterData;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Data [futures=" + futures + ", listedOptions=" + listedOptions + ", forwards=" + forwards + ", swaps="
				+ swaps + ", dmCommodityId=" + dmCommodityId + ", dmMasterData=" + dmMasterData + "]";
	}

	
	}
