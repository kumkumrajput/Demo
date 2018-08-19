package com.commodity.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commodity.bean.CommodityBean;
import com.commodity.domain.model.Swaps;
import com.commodity.domain.repository.SwapsRepository;
import com.commodity.services.SwapsService;

@Service
public class SwapsServiceImpl implements SwapsService {
	
	@Autowired
	private SwapsRepository swapsRepository;

	@Override
	public boolean saveAll(CommodityBean bean) {
		// TODO Auto-generated method stub
		boolean isInsert = false;
		Swaps swaps= new Swaps();
		try {
			if(null!=bean) {
				swaps.setCommodityId(bean.getCommodityId());
				swaps.setExchange(bean.getExchange());
				swaps.setCounterParty(bean.getCounterParty());
				swaps.setStartDate(bean.getStartDate());
				swaps.setEndDate(bean.getEndDate());
				
				swaps.setContractDate(bean.getContractDataBean().getContractDate());
				swaps.setTradeType(bean.getContractDataBean().getTypeOfTrade());
				
				if((null != bean.getBuyingSideBean().getCommodityFixedPrice()) && (!bean.getBuyingSideBean().getCommodityFixedPrice().isEmpty())) {
					swaps.setCommFixed((Float.valueOf(bean.getBuyingSideBean().getCommodityFixedPrice())));
				}
				swaps.seteDateBuy(bean.getBuyingSideBean().getEffectiveDate());
				
				if((null != bean.getSellingSideDataBean().getCommodityFloatingPrice()) && (!bean.getSellingSideDataBean().getCommodityFloatingPrice().isEmpty())) {
					swaps.setCommFloat((Float.valueOf(bean.getBuyingSideBean().getCommodityFixedPrice())));
				}				
				swaps.seteDateSell(bean.getSellingSideDataBean().getEffectiveDate());
				
				swapsRepository.save(swaps);
				isInsert=true;
				
			}
		} catch (Exception e) {
			System.out.println(" Exception occurred while saving Swapss :: " + e);
			e.printStackTrace();
		}
		return isInsert;
	}

	@Override
	public Iterable<Swaps> findAll() {
		Iterable<Swaps> iterable = swapsRepository.findAll();
		return iterable;
	}

}
