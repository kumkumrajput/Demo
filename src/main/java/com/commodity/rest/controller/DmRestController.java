package com.commodity.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.commodity.domain.model.DmCommodityId;
import com.commodity.domain.model.DmMasterData;
import com.commodity.rest.dto.Data;
import com.commodity.rest.dto.Response;
import com.commodity.services.DmCommodityIdServices;
import com.commodity.services.DmMasterDataServices;

@RestController
@RequestMapping("/api/data")
public class DmRestController {

	@Autowired
	DmCommodityIdServices dmCommodityIdServices;
	
	@Autowired
	DmMasterDataServices DmMasterDataServices;
	
	@RequestMapping(value = "/comm/getdata", method = RequestMethod.GET)
	public ResponseEntity<Object> getDmCommIdData(){
		
		Response response = new Response();
		Data data = new Data();
		Iterable<DmCommodityId> iterable = null;
		List<DmCommodityId> dmCommIdList = new ArrayList<>();
		try {
			iterable = dmCommodityIdServices.findAll();
			if(null != iterable) {
				for(DmCommodityId f : iterable) {
					dmCommIdList.add(f);
				}
			}
			data.setDmCommodityId(dmCommIdList);
			response.setStatus(HttpStatus.OK.toString());
			response.setData(data);
		}catch(Exception e) {
			System.out.println("error while getting DM Commodity ID data using Rest :: " + e);
			response.setStatus("Error");
			response.setMessage(e.getMessage());
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/master/getdata", method = RequestMethod.GET)
	public ResponseEntity<Object> getDmMasterData(){
		
		Response response = new Response();
		Data data = new Data();
		Iterable<DmMasterData> iterable = null;
		List<DmMasterData> dmMasterList = new ArrayList<>();
		try {
			iterable = DmMasterDataServices.findAll();
			if(null != iterable) {
				for(DmMasterData f : iterable) {
					dmMasterList.add(f);
				}
			}
			data.setDmMasterData(dmMasterList);
			response.setStatus(HttpStatus.OK.toString());
			response.setData(data);
		}catch(Exception e) {
			System.out.println("error while getting DM Master data using Rest :: " + e);
			response.setStatus("Error");
			response.setMessage(e.getMessage());
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
}
