package com.commodity.services;

import com.commodity.bean.DmCommodityIdBean;
import com.commodity.domain.model.DmCommodityId;

public interface DmCommodityIdServices {
	
	public boolean displayAll();
	
	public boolean saveAll(DmCommodityIdBean bean);
	
	public Iterable<DmCommodityId> findAll();
}
