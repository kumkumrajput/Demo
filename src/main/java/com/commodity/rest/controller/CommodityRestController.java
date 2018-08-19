package com.commodity.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.commodity.domain.model.Forwards;
import com.commodity.domain.model.Futures;
import com.commodity.domain.model.Listed;
import com.commodity.domain.model.Swaps;
import com.commodity.rest.dto.Data;
import com.commodity.rest.dto.Response;
import com.commodity.services.ForwardsService;
import com.commodity.services.FuturesServices;
import com.commodity.services.ListedServices;
import com.commodity.services.SwapsService;

@RestController
@RequestMapping("/api")
public class CommodityRestController {
	
	@Autowired
	private FuturesServices futureServices;
	
	@Autowired
	private ListedServices listedServices;
	
	@Autowired 
	private ForwardsService forwardsService;
	
	@Autowired
	private SwapsService swapsService;
	
	@RequestMapping(value = "/futures/getdata", method = RequestMethod.GET)
	public ResponseEntity<Object> getFuturesData(){
		
		Response response = new Response();
		Data data = new Data();
		Iterable<Futures> iterable = null;
		List<Futures> futuresList = new ArrayList<>();
		try {
			iterable = futureServices.findAll();
			if(null != iterable) {
				for(Futures f : iterable) {
					futuresList.add(f);
				}
			}
			data.setFutures(futuresList);
			response.setStatus(HttpStatus.OK.toString());
			response.setData(data);
		}catch(Exception e) {
			System.out.println("error while getting futures data using Rest :: " + e);
			response.setStatus("Error");
			response.setMessage(e.getMessage());
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/listed/getdata", method = RequestMethod.GET)
	public ResponseEntity<Object> getListedData(){
		
		Response response = new Response();
		Data data = new Data();
		Iterable<Listed> iterable = null;
		List<Listed> listedList = new ArrayList<>();
		try {
			iterable = listedServices.findAll();
			if(null != iterable) {
				for(Listed f : iterable) {
					listedList.add(f);
				}
			}
			data.setListedOptions(listedList);
			response.setStatus(HttpStatus.OK.toString());
			response.setData(data);
		}catch(Exception e) {
			System.out.println("error while getting Listed data using Rest :: " + e);
			response.setStatus("Error");
			response.setMessage(e.getMessage());
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	
	@RequestMapping(value = "/forwards/getdata", method = RequestMethod.GET)
	public ResponseEntity<Object> getForwardsData(){
		
		Response response = new Response();
		Data data = new Data();
		Iterable<Forwards> iterable = null;
		List<Forwards> forwardsList = new ArrayList<>();
		try {
			iterable = forwardsService.findAll();
			if(null != iterable) {
				for(Forwards f : iterable) {
					forwardsList.add(f);
				}
			}
			data.setForwards(forwardsList);
			response.setStatus(HttpStatus.OK.toString());
			response.setData(data);
		}catch(Exception e) {
			System.out.println("error while getting Forwards data using Rest :: " + e);
			response.setStatus("Error");
			response.setMessage(e.getMessage());
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/swaps/getdata", method = RequestMethod.GET)
	public ResponseEntity<Object> getSwapsData(){
		
		Response response = new Response();
		Data data = new Data();
		Iterable<Swaps> iterable = null;
		List<Swaps> swapsList = new ArrayList<>();
		try {
			iterable = swapsService.findAll();
			if(null != iterable) {
				for(Swaps f : iterable) {
					swapsList.add(f);
				}
			}
			data.setSwaps(swapsList);
			response.setStatus(HttpStatus.OK.toString());
			response.setData(data);
		}catch(Exception e) {
			System.out.println("error while getting Swaps data using Rest :: " + e);
			response.setStatus("Error");
			response.setMessage(e.getMessage());
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
