package com.commodity.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.commodity.domain.model.DmCommodityId;
import com.commodity.domain.model.DmMasterData;
import com.commodity.domain.model.Forwards;
import com.commodity.services.DmCommodityIdServices;
import com.commodity.services.DmMasterDataServices;
import com.commodity.services.ForwardsService;

@Component
public class ForwardsAction {

	@Autowired
	private DmCommodityIdServices services;

	@Autowired
	private DmMasterDataServices servicesMaster;

	@Autowired
	private ForwardsService forwardsService;

	public Map<String, String> getForwardsCId() {

		Map<String, String> forwardsCIdMap = new HashMap<>();

		Iterable<DmCommodityId> dmCIdItr = services.findAll();
		System.out.println("dmCIdItr :: " + dmCIdItr);
		if (null != dmCIdItr) {
			for (DmCommodityId dmCIdObj : dmCIdItr) {
				if (null != dmCIdObj.getType() && !dmCIdObj.getType().isEmpty()
						&& "forwards".equalsIgnoreCase(dmCIdObj.getType())) {
					forwardsCIdMap.put(dmCIdObj.getCommodityId(), dmCIdObj.getCommodityId());
				}
			}
		}

		Iterable<Forwards> FIdItr = forwardsService.findAll();
		System.out.println("FIdItr :: " + FIdItr);
		if (null != FIdItr) {
			for (Forwards FIdObj : FIdItr) {
				forwardsCIdMap.put(FIdObj.getCommodityId(), FIdObj.getCommodityId());
			}
		}

		return forwardsCIdMap;
	}

	public Map<String, String> getForwardsCounterParty() {

		Map<String, String> forwardsCounterMap = new HashMap<>();

		Iterable<DmMasterData> dmCounterItr = servicesMaster.findAll();
		System.out.println("dmCounterItr :: " + dmCounterItr);
		if (null != dmCounterItr) {
			for (DmMasterData dmCounterObj : dmCounterItr) {
				if (null != dmCounterObj.getAuth() && !dmCounterObj.getAuth().isEmpty()
						&& "forwards".equalsIgnoreCase(dmCounterObj.getAuth())) {
					forwardsCounterMap.put(dmCounterObj.getCounterpartyId(), dmCounterObj.getCounterpartyId());
				}
			}
		}

		Iterable<Forwards> CounterItr = forwardsService.findAll();
		System.out.println("CounterItr :: " + CounterItr);
		if (null != CounterItr) {
			for (Forwards CounterObj : CounterItr) {
				forwardsCounterMap.put(CounterObj.getCounterParty(), CounterObj.getCounterParty());
			}
		}

		return forwardsCounterMap;
	}

}
