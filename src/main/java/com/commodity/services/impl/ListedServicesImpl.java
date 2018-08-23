package com.commodity.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commodity.bean.CommodityBean;
import com.commodity.domain.model.Listed;
import com.commodity.domain.repository.ListedRepository;
import com.commodity.services.ListedServices;

@Service
public class ListedServicesImpl implements ListedServices{
	
	@Autowired
	private ListedRepository listedRepository;
	

	@Override
	public boolean saveAll(CommodityBean bean) {
		// TODO Auto-generated method stub
		boolean isInsert=false;
		Listed listed =new Listed();
		
		try {
			if(null!=bean) {
				if(null != bean.getPrimaryKey() && !"".equalsIgnoreCase(bean.getPrimaryKey())) {
					listed.setId(Integer.valueOf(bean.getPrimaryKey()));
				}
				listed.setCommodityId(bean.getCommodityId());
				listed.setContractDate(bean.getContractDataBean().getContractDate());
				listed.setCounterParty(bean.getCounterParty());
				listed.setExchange(bean.getExchange());
				listed.setInvestType(bean.getContractDataBean().getTypeOfInvestment());
				listed.setMaturityDate(bean.getMaturity());
				listed.setStartDate(bean.getStartDate());
				listed.setAck(bean.getAgreementNumber());
				//listed.setCallPutt(bean.);
				if(null != bean.getOptionPremium() && !bean.getOptionPremium().isEmpty()) {
					listed.setOption((Float.valueOf(bean.getOptionPremium())));
				}
				if(null != bean.getStrikePrice() && !bean.getStrikePrice().isEmpty()) {
					listed.setStrikePrice(((Float.valueOf(bean.getStrikePrice()))));
				}
										
				listedRepository.save(listed);
				isInsert=true;				
				System.out.println("Listed options save is ::"+isInsert);
				}
		} catch (Exception e) {
			System.out.println(" Exception occurred while saving Listed Options :: " + e);
			e.printStackTrace();
		}
		
		return isInsert;
	}

	@Override
	public Iterable<Listed> findAll() {
		Iterable<Listed> iterable = listedRepository.findAll();
		return iterable;
	}
	
	@Override
	public Listed getlistedOptionsById(Integer Id) {
		Listed l = listedRepository.findOne(Id);
		return l;
	}

}
