package com.commodity.services;

import com.commodity.bean.CommodityBean;
import com.commodity.domain.model.Listed;

public interface ListedServices {

	public boolean saveAll(CommodityBean bean);

	public Iterable<Listed> findAll();

	public Listed getlistedOptionsById(Integer Id);

}
