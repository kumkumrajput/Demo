package com.commodity.services;

import com.commodity.bean.DmMasterDataBean;
import com.commodity.domain.model.DmMasterData;

public interface DmMasterDataServices {
	
public boolean displayAll();
	
	public boolean saveAll(DmMasterDataBean bean);
	
	public Iterable<DmMasterData> findAll();

}
