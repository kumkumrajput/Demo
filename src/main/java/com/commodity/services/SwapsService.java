package com.commodity.services;

import com.commodity.bean.CommodityBean;
import com.commodity.domain.model.Swaps;

public interface SwapsService {
	
	public boolean saveAll(CommodityBean bean);

	public Iterable<Swaps> findAll();

}
