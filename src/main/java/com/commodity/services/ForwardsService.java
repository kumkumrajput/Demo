package com.commodity.services;

import com.commodity.bean.CommodityBean;
import com.commodity.domain.model.Forwards;

public interface ForwardsService {
	
	public boolean saveAll(CommodityBean bean);

	public Iterable<Forwards> findAll();


}
