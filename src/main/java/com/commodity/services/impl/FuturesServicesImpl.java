package com.commodity.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commodity.bean.CommodityBean;
import com.commodity.domain.model.Futures;
import com.commodity.domain.repository.FuturesRepository;
import com.commodity.services.FuturesServices;

@Service
public class FuturesServicesImpl implements FuturesServices {

	@Autowired
	private FuturesRepository futuresRepository;

	@Override
	public boolean saveAll(CommodityBean bean) {
		// TODO Auto-generated method stub
		boolean isInsert = false;
		Futures futures = new Futures();
		try {

			if (null != bean) {
				futures.setCommodityId(bean.getCommodityId());
				futures.setCounterParty(bean.getCounterParty());
				futures.setContractDate(bean.getContractDataBean().getContractDate());
				// futures setAck();
				futures.setEndDate(bean.getEndDate());
				futures.setExchange(bean.getExchange());

				if (null != bean.getFuturePrice() && !bean.getFuturePrice().isEmpty()) {
					futures.setFuturePrice((Float.valueOf(bean.getFuturePrice())));
				}
				futures.setInvestType(bean.getContractDataBean().getTypeOfInvestment());
				futures.setStartDate(bean.getStartDate());

				futuresRepository.save(futures);
				isInsert = true;

			}

		} catch (Exception e) {
			System.out.println(" Exception occurred while saving Futures :: " + e);
			e.printStackTrace();
		}

		return isInsert;
	}

	@Override
	public Iterable<Futures> findAll() {
		Iterable<Futures> iterable = futuresRepository.findAll();
		return iterable;

	}
}
