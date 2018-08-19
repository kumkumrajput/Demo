package com.commodity.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commodity.bean.DmCommodityIdBean;
import com.commodity.domain.model.DmCommodityId;
import com.commodity.domain.repository.DmCommodityIdRepository;
import com.commodity.services.DmCommodityIdServices;

@Service
public class DmCommodityIdServicesImpl implements DmCommodityIdServices {
	
	
	@Autowired
	private DmCommodityIdRepository dmCommodityIdRepository;

	@Override
	public boolean displayAll() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveAll(DmCommodityIdBean bean) {
		boolean isInsert = false;
		DmCommodityId dmCommodityId = new DmCommodityId();
		try {
			if(null != bean) {
				dmCommodityId.setCommodityId(bean.getCommodityId());
				dmCommodityId.setType(bean.getType());
				dmCommodityId.setIssuer(bean.getIssuer());
				dmCommodityId.setDescription(bean.getDescription());
				dmCommodityId.setExchange(bean.getExchange());
				dmCommodityId.setStartDate(bean.getStartDate());
				dmCommodityIdRepository.save(dmCommodityId);
				isInsert = true;
			}
		}catch(Exception e) {
			System.out.println(" Exception occurred while saving data management commodity :: " + e);
			e.printStackTrace();
			
		}
		return isInsert;
	}

	@Override
	public Iterable<DmCommodityId> findAll() {
		Iterable<DmCommodityId> iterable = dmCommodityIdRepository.findAll();
		return iterable;
	}

}
