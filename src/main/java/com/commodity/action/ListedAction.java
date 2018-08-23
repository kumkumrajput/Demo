package com.commodity.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.commodity.domain.model.DmCommodityId;
import com.commodity.domain.model.DmMasterData;
import com.commodity.domain.model.Futures;
import com.commodity.domain.model.Listed;
import com.commodity.services.DmCommodityIdServices;
import com.commodity.services.DmMasterDataServices;
import com.commodity.services.ListedServices;

@Component
public class ListedAction {
	
	@Autowired
	private DmCommodityIdServices services;

	@Autowired
	private DmMasterDataServices servicesMaster;
	
	@Autowired
	private ListedServices listedServices;
	
	
	//Gets commodity Ids in the dropdown in Listed App
	public Map<String, String> getListedCId(){
		
		Map<String,String> listedCIdMap= new HashMap<>();
		
		//getting commodity Ids from the Data management's Commodity Id App
		Iterable<DmCommodityId> dmCIdItr=services.findAll();
		System.out.println("dmCIdItr :: " + dmCIdItr);
		if (null != dmCIdItr) {
			for (DmCommodityId dmCIdObj : dmCIdItr) {
				if(null!=dmCIdObj.getType() && !dmCIdObj.getType().isEmpty() && "listed options".equalsIgnoreCase(dmCIdObj.getType())) {
					listedCIdMap.put(dmCIdObj.getCommodityId(), dmCIdObj.getCommodityId());
					}
				}
		}
		
		//getting commodity Ids from the Listed App
		Iterable<Listed> lIdItr = listedServices.findAll();
		System.out.println("lIdItr :: " + lIdItr);
		if (null != lIdItr) {
			for (Listed lIdObj : lIdItr) {
				listedCIdMap.put(lIdObj.getCommodityId(), lIdObj.getCommodityId());
			}
		}
		
		return listedCIdMap;
		
	}
	
	public Map<String, String> getListedCounterParty() {

		Map<String, String> listedCounterMap = new HashMap<>();
		
		Iterable<DmMasterData> dmCounterItr = servicesMaster.findAll();
		System.out.println("dmCounterItr :: " + dmCounterItr);
		if (null != dmCounterItr) {
			for (DmMasterData dmCounterObj : dmCounterItr) {
				if(null!=dmCounterObj.getAuth() && !dmCounterObj.getAuth().isEmpty() && "listed options".equalsIgnoreCase(dmCounterObj.getAuth())) {
					listedCounterMap.put(dmCounterObj.getCounterpartyId(), dmCounterObj.getCounterpartyId());
				}
			}
		}
		
		Iterable<Listed> ListedCounterItr = listedServices.findAll();
		System.out.println("ListedCounterItr :: " + ListedCounterItr);
		if (null != ListedCounterItr) {
			for (Listed ListedCounterObj : ListedCounterItr) {
				listedCounterMap.put(ListedCounterObj.getCounterParty(), ListedCounterObj.getCounterParty());
			}
		}
		
		return listedCounterMap;
	}
	
	public Listed getListedById(Integer id) {
		Listed l = listedServices.getlistedOptionsById(id);
		return l;
	}
	

}
