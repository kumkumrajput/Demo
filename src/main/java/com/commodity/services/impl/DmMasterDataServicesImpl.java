package com.commodity.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commodity.bean.DmMasterDataBean;
import com.commodity.domain.model.DmMasterData;
import com.commodity.domain.repository.DmMasterDataRepository;
import com.commodity.services.DmMasterDataServices;

@Service
public class DmMasterDataServicesImpl implements DmMasterDataServices {
	
	@Autowired
	private DmMasterDataRepository dmMasterDataRepository;

	@Override
	public boolean displayAll() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveAll(DmMasterDataBean bean) {
		// TODO Auto-generated method stub
		boolean isInsert = false;
		DmMasterData dmMasterData = null;
		
		try {
			if(null != bean) { 
				if(null != bean.getAuth() && !bean.getAuth().isEmpty()) {
					int size  = bean.getAuth().size();
					for(int i = 0; i < size; i++) {
						dmMasterData = new DmMasterData();
						dmMasterData.setCounterpartyId(bean.getCounterPartyId());
						dmMasterData.setName(bean.getName());
						dmMasterData.setAddress(bean.getAddress());
						dmMasterData.setBankName(bean.getBankName());
						if(null != bean.getBankAcc() && !bean.getBankAcc().isEmpty()) {
							dmMasterData.setBankAcc(Integer.valueOf(bean.getBankAcc()));
						}
		 				dmMasterData.setContact(bean.getContactPerson());
						dmMasterData.setAuth(bean.getAuth().get(i));
						dmMasterDataRepository.save(dmMasterData);
					}
					isInsert = true;
				}
			}
		}catch(Exception e) {
			System.out.println(" Exception occurred while saving data management masterdata :: " + e);
			e.printStackTrace();
			
		}
		
		
		return isInsert;
	}

	@Override
	public Iterable<DmMasterData> findAll() {
		Iterable<DmMasterData> iterable = dmMasterDataRepository.findAll();
		return iterable;
	}

}
