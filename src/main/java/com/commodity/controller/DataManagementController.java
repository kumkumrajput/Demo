package com.commodity.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.commodity.bean.CommodityBean;
import com.commodity.bean.DmCommodityIdBean;
import com.commodity.bean.DmMasterDataBean;
import com.commodity.services.DmCommodityIdServices;
import com.commodity.services.DmMasterDataServices;

@Controller
public class DataManagementController {
	
	@Autowired
	private DmCommodityIdServices services;
	
	@Autowired
	private DmMasterDataServices servicesMaster;
	
	
/////////////////////////////////Display & Save of Commodity ID ////////////////////////////
	
	@RequestMapping(value="/commoditydetails/data/{param}", method = RequestMethod.GET)
	public ModelAndView getDataManagementView(@ModelAttribute("DmCommodityIdBean") DmCommodityIdBean dataManagementBean, @PathVariable("param") String param, HttpServletRequest request) {
		System.out.println("data details");
		System.out.println("param :: " + param);
		
		Map<String, String> typeMap = new HashMap<String, String>();
		typeMap.put("futures", "Futures");
		typeMap.put("listed", "Listed Options");
		typeMap.put("forwards", "Forwards");
		typeMap.put("swaps", "Swaps");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("typeMap", typeMap);
		modelAndView.setViewName("dataMgmtCommodityId");
		
		return modelAndView;
		
	}
	
	@RequestMapping(value = "/commoditydetails/data/savecommodity", method = RequestMethod.POST)
	public ModelAndView saveDMDetails(@ModelAttribute("DmCommodityIdBean") DmCommodityIdBean dataManagementBean, HttpServletRequest request) {
		System.out.println("dataManagementBean :: " + dataManagementBean);
		
		boolean isInsert = services.saveAll(dataManagementBean);
		System.out.println("DM CommodityID is insert :: " + isInsert);
		
		Map<String, String> typeMap = new HashMap<String, String>();
		typeMap.put("futures", "Futures");
		typeMap.put("listed", "Listed Options");
		typeMap.put("forwards", "Forwards");
		typeMap.put("swaps", "Swaps");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("typeMap", typeMap);
		modelAndView.addObject("DmCommodityIdBean", new DmCommodityIdBean());
		modelAndView.setViewName("dataMgmtCommodityId");

		return modelAndView;
	
	}
	
	/////////////////////////////////Display & Save of CounterParty Master Data ////////////////////////////
	
	@RequestMapping(value="/commoditydetails/data/counterparty/{param}", method = RequestMethod.GET)
	public ModelAndView getDataManagementMasterView(@ModelAttribute("DmMasterDataBean") DmMasterDataBean dmMasterDataBean, @PathVariable("param") String param, HttpServletRequest request) {
		System.out.println("data details");
		System.out.println("param :: " + param);
		
		List<String> authCheckboxes = new ArrayList<>();
		authCheckboxes.add("Futures");
		authCheckboxes.add("Listed Options");
		authCheckboxes.add("Forwards");
		authCheckboxes.add("Swaps");
		authCheckboxes.add("OTC Options");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("authCheckboxes", authCheckboxes);
		modelAndView.setViewName("dataMgmtMasterData");
		
		return modelAndView;
		
	}
	
	@RequestMapping(value = "/commoditydetails/data/saveMaster", method = RequestMethod.POST)
	public ModelAndView saveDmMasterDetails(@ModelAttribute("DmMasterDataBean") DmMasterDataBean dmMasterDataBean, HttpServletRequest request) {
		System.out.println("dmMasterDataBean :: " + dmMasterDataBean);
		boolean isInsert = servicesMaster.saveAll(dmMasterDataBean);
		System.out.println("is insert :: " + isInsert);
		List<String> authCheckboxes = new ArrayList<>();
		authCheckboxes.add("Futures");
		authCheckboxes.add("Listed Options");
		authCheckboxes.add("Forwards");
		authCheckboxes.add("Swaps");
		authCheckboxes.add("OTC Options");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("authCheckboxes", authCheckboxes);
		modelAndView.addObject("DmMasterDataBean", new DmMasterDataBean());
		modelAndView.setViewName("dataMgmtMasterData");
		
		
		return modelAndView;
	
	}
	
}
