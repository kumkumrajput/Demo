package com.commodity.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commodity.bean.CommodityBean;
import com.commodity.domain.model.Forwards;
import com.commodity.domain.repository.ForwardsRepository;
import com.commodity.services.ForwardsService;

@Service
public class ForwardsServiceImpl implements ForwardsService{
	
	@Autowired
	private ForwardsRepository forwardsRepository;

	@Override
	public boolean saveAll(CommodityBean bean) {
		// TODO Auto-generated method stub
		boolean isInsert=false;
		Forwards forwards=new Forwards();
		
		try {
			if(null!=bean) {				
				forwards.setCommodityId(bean.getCommodityId());
				forwards.setContractDate(bean.getContractDataBean().getContractDate());
				forwards.setCounterParty(bean.getCounterParty());
				forwards.setExchange(bean.getExchange());
				forwards.setInvestType(bean.getContractDataBean().getTypeOfInvestment());
				forwards.setStartDate(bean.getStartDate());
				forwards.setEndDate(bean.getEndDate());
										
				if(null != bean.getForwardPrice() && !bean.getForwardPrice().isEmpty()) {
					forwards.setForwardPrice((Float.valueOf(bean.getForwardPrice())));
				}
				if(null != bean.getSpotPrice() && !bean.getSpotPrice().isEmpty()) {
					forwards.setSpotPrice((Float.valueOf(bean.getSpotPrice())));
				}
				
				forwardsRepository.save(forwards);
				isInsert=true;
				System.out.println("Forwards options save is ::"+isInsert);

				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(" Exception occurred while saving Forwards :: " + e);
			e.printStackTrace();
		}
		
		
		return isInsert;
	}

	@Override
	public Iterable<Forwards> findAll() {
		// TODO Auto-generated method stub
		Iterable<Forwards> iterable = forwardsRepository.findAll();
		return iterable;
			}

}
