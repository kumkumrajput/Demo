package com.commodity.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.commodity.domain.model.DmCommodityId;
import com.commodity.domain.model.DmMasterData;
import com.commodity.domain.model.Futures;
import com.commodity.services.DmCommodityIdServices;
import com.commodity.services.DmMasterDataServices;
import com.commodity.services.FuturesServices;

@Component
public class FuturesAction {

	@Autowired
	private DmCommodityIdServices services;

	@Autowired
	private DmMasterDataServices servicesMaster;
	
	@Autowired
	private FuturesServices futureServices;

	public Map<String, String> getFuturesCId() {

		Map<String, String> futureCIdMap = new HashMap<>();
		
		Iterable<DmCommodityId> dmCIdItr = services.findAll();
		System.out.println("dmCIdItr :: " + dmCIdItr);
		if (null != dmCIdItr) {
			for (DmCommodityId dmCIdObj : dmCIdItr) {
				if(null!=dmCIdObj.getType() && !dmCIdObj.getType().isEmpty() && "futures".equalsIgnoreCase(dmCIdObj.getType())) {
					futureCIdMap.put(dmCIdObj.getCommodityId(), dmCIdObj.getCommodityId());
					}
				}
		}
		
		Iterable<Futures> FIdItr = futureServices.findAll();
		System.out.println("FIdItr :: " + FIdItr);
		if (null != FIdItr) {
			for (Futures FIdObj : FIdItr) {
				futureCIdMap.put(FIdObj.getCommodityId(), FIdObj.getCommodityId());
			}
		}
		
		return futureCIdMap;
	}

	public Map<String, String> getFuturesCounterParty() {

		Map<String, String> futureCounterMap = new HashMap<>();
		
		Iterable<DmMasterData> dmCounterItr = servicesMaster.findAll();
		System.out.println("dmCounterItr :: " + dmCounterItr);
		if (null != dmCounterItr) {
			for (DmMasterData dmCounterObj : dmCounterItr) {
				if(null!=dmCounterObj.getAuth() && !dmCounterObj.getAuth().isEmpty() && "futures".equalsIgnoreCase(dmCounterObj.getAuth())) {
				futureCounterMap.put(dmCounterObj.getCounterpartyId(), dmCounterObj.getCounterpartyId());
				}
			}
		}
		
		Iterable<Futures> CounterItr = futureServices.findAll();
		System.out.println("CounterItr :: " + CounterItr);
		if (null != CounterItr) {
			for (Futures CounterObj : CounterItr) {
				futureCounterMap.put(CounterObj.getCounterParty(), CounterObj.getCounterParty());
			}
		}
		
		return futureCounterMap;
	}
	
	public Futures getFuturesById(Integer id) {
		Futures f = futureServices.getFuturesById(id);
		return f;
	}
}
