package com.commodity.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.commodity.bean.CommodityBean;

@Controller
public class CommodityController {
	
	@RequestMapping(value="/commoditydetails/{param}", method = RequestMethod.GET)
	public ModelAndView getCommodityDetailsView(@PathVariable("param") String param, HttpServletRequest request) {
		System.out.println("commodity details1");
		System.out.println("param :: " + param);
		
		ModelAndView modelAndView = new ModelAndView();
		
		if("futures".equalsIgnoreCase(param)) {
			Map<String, String> commodityMap = new HashMap<String, String>();
			commodityMap.put("C001", "C001");
			commodityMap.put("C002", "C002");
			commodityMap.put("C003", "C003");
			
			Map<String, String> exchangeMap = new HashMap<String, String>();
			exchangeMap.put("bse", "BSE");
			exchangeMap.put("nse", "NSE");
			
			Map<String, String> counterPartyMap = new HashMap<String, String>();
			counterPartyMap.put("abc", "ABC");
			counterPartyMap.put("xyz", "XYZ");
			
			Map<String, String> futurePriceMap = new HashMap<String, String>();
			futurePriceMap.put("200", "$200");
			futurePriceMap.put("300", "$300");
			futurePriceMap.put("400", "$400");
			
			Map<String, String> investmentTypeMap = new HashMap<String, String>();
			investmentTypeMap.put("Mutual Funds", "Mutual Funds");
			investmentTypeMap.put("Life Insurance", "Life Insurance");
			
			modelAndView.addObject("paramIdentifier", "futures");
			modelAndView.addObject("exchangeMap", exchangeMap);
			modelAndView.addObject("counterPartyMap", counterPartyMap);
			modelAndView.addObject("investmentTypeMap", investmentTypeMap);
			modelAndView.addObject("futurePriceMap", futurePriceMap);
			modelAndView.addObject("commodityIdMap", commodityMap);
			
		}else if("listedOptions".equalsIgnoreCase(param)) {
			Map<String, String> commodityMap = new HashMap<String, String>();
			commodityMap.put("L001", "L001");
			commodityMap.put("L002", "L002");
			commodityMap.put("L003", "L003");
			
			Map<String, String> exchangeMap = new HashMap<String, String>();
			exchangeMap.put("bse", "BSE");
			exchangeMap.put("nse", "NSE");
			
			Map<String, String> counterPartyMap = new HashMap<String, String>();
			counterPartyMap.put("abc", "ABC");
			counterPartyMap.put("xyz", "XYZ");
								
			Map<String, String> investmentTypeMap = new HashMap<String, String>();
			investmentTypeMap.put("Mutual Funds", "Mutual Funds");
			investmentTypeMap.put("Life Insurance", "Life Insurance");
			
			Map<String, String> optionPremiumMap = new HashMap<String, String>();
			optionPremiumMap.put("Option Premium", "Option Premium");
			optionPremiumMap.put("Call Premium", "Call Premium");
			
			Map<String, String> strikePriceMap = new HashMap<String, String>();
			strikePriceMap.put("500", "$500");
			strikePriceMap.put("600", "$600");
			
			modelAndView.addObject("paramIdentifier", "listedOptions");
			modelAndView.addObject("exchangeMap", exchangeMap);
			modelAndView.addObject("strikePriceMap", strikePriceMap);
			modelAndView.addObject("optionPremiumMap", optionPremiumMap);
			modelAndView.addObject("counterPartyMap", counterPartyMap);
			modelAndView.addObject("investmentTypeMap", investmentTypeMap);
			modelAndView.addObject("commodityIdMap", commodityMap);
			
		}else if("forwards".equalsIgnoreCase(param)) {
			Map<String, String> commodityMap = new HashMap<String, String>();
			commodityMap.put("C001", "C001");
			commodityMap.put("C002", "C002");
			commodityMap.put("C003", "C003");
			
			Map<String, String> exchangeMap = new HashMap<String, String>();
			exchangeMap.put("bse", "BSE");
			exchangeMap.put("nse", "NSE");
			
			Map<String, String> counterPartyMap = new HashMap<String, String>();
			counterPartyMap.put("abc", "ABC");
			counterPartyMap.put("xyz", "XYZ");
									
			Map<String, String> investmentTypeMap = new HashMap<String, String>();
			investmentTypeMap.put("Mutual Funds", "Mutual Funds");
			investmentTypeMap.put("Life Insurance", "Life Insurance");
			
			//1.1 added forward price & spot price
			Map<String, String> forwardPriceMap = new HashMap<String, String>();
			forwardPriceMap.put("200", "$200");
			forwardPriceMap.put("300", "$300");
			forwardPriceMap.put("400", "$400");
			
			Map<String, String> spotPriceMap = new HashMap<String, String>();
			spotPriceMap.put("800", "$800");
			spotPriceMap.put("450", "$450");
			spotPriceMap.put("400", "$400");
			
			
			modelAndView.addObject("paramIdentifier", "forwards");
			modelAndView.addObject("exchangeMap", exchangeMap);
			modelAndView.addObject("counterPartyMap", counterPartyMap);
			modelAndView.addObject("investmentTypeMap", investmentTypeMap);
			modelAndView.addObject("commodityIdMap", commodityMap);
			modelAndView.addObject("forwardPriceMap", forwardPriceMap);
			modelAndView.addObject("spotPriceMap", spotPriceMap);
			
			
		}else if("swaps".equalsIgnoreCase(param)) {
			Map<String, String> commodityMap = new HashMap<String, String>();
			commodityMap.put("C001", "C001");
			commodityMap.put("C002", "C002");
			commodityMap.put("C003", "C003");
			
			Map<String, String> exchangeMap = new HashMap<String, String>();
			exchangeMap.put("bse", "BSE");
			exchangeMap.put("nse", "NSE");
			
			Map<String, String> counterPartyMap = new HashMap<String, String>();
			counterPartyMap.put("abc", "ABC");
			counterPartyMap.put("xyz", "XYZ");
			
					
			Map<String, String> tradeTypeMap = new HashMap<String, String>();
			tradeTypeMap.put("Mutual Funds", "Mutual Funds");
			tradeTypeMap.put("Life Insurance", "Life Insurance");
			
			//1.1 added commodity fixed price & commodity floating price
			Map<String, String> commodityfixedPriceMap = new HashMap<String, String>();
			commodityfixedPriceMap.put("200", "$200");
			commodityfixedPriceMap.put("300", "$300");
			commodityfixedPriceMap.put("400", "$400");
			
			Map<String, String> commodityfloatingPriceMap = new HashMap<String, String>();
			commodityfloatingPriceMap.put("800", "$800");
			commodityfloatingPriceMap.put("450", "$450");
			commodityfloatingPriceMap.put("400", "$400");
			
			modelAndView.addObject("paramIdentifier", "swaps");
			modelAndView.addObject("exchangeMap", exchangeMap);
			modelAndView.addObject("counterPartyMap", counterPartyMap);
			modelAndView.addObject("tradeTypeMap", tradeTypeMap);
			modelAndView.addObject("commodityIdMap", commodityMap);
			modelAndView.addObject("commodityfixedPriceMap", commodityfixedPriceMap);
			modelAndView.addObject("commodityfloatingPriceMap", commodityfloatingPriceMap);
			
		}		
		
		modelAndView.addObject("commodityBean", new CommodityBean());
		modelAndView.setViewName("commodityDetails");
		return modelAndView;
	}
	
	@RequestMapping(value="/commoditydetails/submit", method = RequestMethod.GET)
	public ModelAndView submitFormData(@ModelAttribute("commodityBean") CommodityBean commodityBean) {
		System.out.println("Submit commodityBean :: " + commodityBean);
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("commodityBean", new CommodityBean());
		modelAndView.setViewName("commodityDetails");
		return modelAndView;
	}
	
	@RequestMapping(value="/commoditydetails/getHomePage", method = RequestMethod.GET)
	public String getHomePage() {
		return "home";
	}

}
