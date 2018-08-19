package com.commodity.services;

import com.commodity.bean.CommodityBean;
import com.commodity.domain.model.Futures;

public interface FuturesServices {
	
	public boolean saveAll(CommodityBean bean);
	
	public Iterable<Futures> findAll();

}
