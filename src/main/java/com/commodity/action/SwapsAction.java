package com.commodity.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.commodity.domain.model.DmCommodityId;
import com.commodity.domain.model.DmMasterData;
import com.commodity.domain.model.Swaps;
import com.commodity.services.DmCommodityIdServices;
import com.commodity.services.DmMasterDataServices;
import com.commodity.services.SwapsService;

@Component
public class SwapsAction {
	
	@Autowired
	private DmCommodityIdServices services;

	@Autowired
	private DmMasterDataServices servicesMaster;
	
	@Autowired
	private SwapsService swapsService;
	
	
	//Gets commodity Ids in the dropdown in Listed App
	public Map<String, String> getSwapsCId(){
		
		Map<String,String> swapsCIdMap= new HashMap<>();
		
		//getting commodity Ids from the Data management's Commodity Id App
		Iterable<DmCommodityId> dmCIdItr=services.findAll();
		System.out.println("dmCIdItr :: " + dmCIdItr);
		if (null != dmCIdItr) {
			for (DmCommodityId dmCIdObj : dmCIdItr) {
				if(null!=dmCIdObj.getType() && !dmCIdObj.getType().isEmpty() && "swaps".equalsIgnoreCase(dmCIdObj.getType())) {
					swapsCIdMap.put(dmCIdObj.getCommodityId(), dmCIdObj.getCommodityId());
					}
				}
		}
		
		//getting commodity Ids from the Listed App
		Iterable<Swaps> sIdItr = swapsService.findAll();
		System.out.println("sIdItr :: " + sIdItr);
		if (null != sIdItr) {
			for (Swaps sIdObj : sIdItr) {
				swapsCIdMap.put(sIdObj.getCommodityId(), sIdObj.getCommodityId());
			}
		}
		
		return swapsCIdMap;
		
	}
	
	public Map<String, String> getSwapsCounterParty() {

		Map<String, String> swapsCounterMap = new HashMap<>();
		
		Iterable<DmMasterData> dmCounterItr = servicesMaster.findAll();
		System.out.println("dmCounterItr :: " + dmCounterItr);
		if (null != dmCounterItr) {
			for (DmMasterData dmCounterObj : dmCounterItr) {
				if(null!=dmCounterObj.getAuth() && !dmCounterObj.getAuth().isEmpty() && "swaps".equalsIgnoreCase(dmCounterObj.getAuth())) {
					swapsCounterMap.put(dmCounterObj.getCounterpartyId(), dmCounterObj.getCounterpartyId());
				}
			}
		}
		
		Iterable<Swaps> swapsCounterItr = swapsService.findAll();
		System.out.println("swapsCounterItr :: " + swapsCounterItr);
		if (null != swapsCounterItr) {
			for (Swaps ListedCounterObj : swapsCounterItr) {
				swapsCounterMap.put(ListedCounterObj.getCounterParty(), ListedCounterObj.getCounterParty());
			}
		}
		
		return swapsCounterMap;
	}
	


}
