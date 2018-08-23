package com.commodity.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.commodity.action.ForwardsAction;
import com.commodity.action.FuturesAction;
import com.commodity.action.ListedAction;
import com.commodity.action.SwapsAction;
import com.commodity.bean.CommodityBean;
import com.commodity.bean.ContractDataBean;
import com.commodity.domain.model.Forwards;
import com.commodity.domain.model.Futures;
import com.commodity.domain.model.Listed;
import com.commodity.services.ForwardsService;
import com.commodity.services.FuturesServices;
import com.commodity.services.ListedServices;
import com.commodity.services.SwapsService;
import com.commodity.util.CommodityUtil;

@Controller
public class CommodityController {

	@Autowired
	private FuturesAction futuresAction;

	@Autowired
	private ListedAction listedAction;

	@Autowired
	private ForwardsAction forwardsAction;

	@Autowired
	private SwapsAction swapsAction;

	@Autowired
	private FuturesServices futureServices;

	@Autowired
	private ListedServices listedServices;

	@Autowired
	private ForwardsService forwardsService;

	@Autowired
	private SwapsService swapsService;
	
	@Autowired
	private CommodityUtil commodityUtil;

	@RequestMapping(value = "/commoditydetails/{param}", method = RequestMethod.GET)
	public ModelAndView getCommodityDetailsView(@PathVariable("param") String param, HttpServletRequest request) {
		System.out.println("commodity details1");
		System.out.println("param :: " + param);

		ModelAndView modelAndView = new ModelAndView();

		if ("futures".equalsIgnoreCase(param)) {

			Map<String, String> commodityMap = futuresAction.getFuturesCId();
			System.out.println("futures CID's :: " + commodityMap);

			Map<String, String> exchangeMap = new HashMap<String, String>();
			exchangeMap.put("bse", "BSE");
			exchangeMap.put("nse", "NSE");

			Map<String, String> counterPartyMap = futuresAction.getFuturesCounterParty();
			System.out.println("futures Counter party ID's :: " + counterPartyMap);
			// counterPartyMap.put("abc", "ABC");
			// counterPartyMap.put("xyz", "XYZ");

			Map<String, String> futurePriceMap = new HashMap<String, String>();
			futurePriceMap.put("200", "$200");
			futurePriceMap.put("300", "$300");
			futurePriceMap.put("400", "$400");

			Map<String, String> investmentTypeMap = new HashMap<String, String>();
			investmentTypeMap.put("Mutual Funds", "Mutual Funds");
			investmentTypeMap.put("Life Insurance", "Life Insurance");

			modelAndView.addObject("paramIdentifier", "futures");
			modelAndView.addObject("agreementNumber", commodityUtil.uniquekeyGenerator("futures"));
			modelAndView.addObject("exchangeMap", exchangeMap);
			modelAndView.addObject("counterPartyMap", counterPartyMap);
			modelAndView.addObject("investmentTypeMap", investmentTypeMap);
			modelAndView.addObject("futurePriceMap", futurePriceMap);
			modelAndView.addObject("commodityIdMap", commodityMap);

		} else if ("listedOptions".equalsIgnoreCase(param)) {
			Map<String, String> commodityMap = listedAction.getListedCId();
			System.out.println("listed CID's :: " + commodityMap);

			Map<String, String> exchangeMap = new HashMap<String, String>();
			exchangeMap.put("bse", "BSE");
			exchangeMap.put("nse", "NSE");

			Map<String, String> counterPartyMap = listedAction.getListedCounterParty();
			System.out.println("listed Counter party ID's :: " + counterPartyMap);

			Map<String, String> investmentTypeMap = new HashMap<String, String>();
			investmentTypeMap.put("MF", "MF");
			investmentTypeMap.put("LI", "LI");

			Map<String, String> optionPremiumMap = new HashMap<String, String>();
			optionPremiumMap.put("Option Premium", "Option Premium");
			optionPremiumMap.put("Call Premium", "Call Premium");

			Map<String, String> strikePriceMap = new HashMap<String, String>();
			strikePriceMap.put("500", "$500");
			strikePriceMap.put("600", "$600");

			modelAndView.addObject("paramIdentifier", "listedOptions");
			modelAndView.addObject("agreementNumber", commodityUtil.uniquekeyGenerator("listedOptions"));
			modelAndView.addObject("exchangeMap", exchangeMap);
			modelAndView.addObject("strikePriceMap", strikePriceMap);
			modelAndView.addObject("optionPremiumMap", optionPremiumMap);
			modelAndView.addObject("counterPartyMap", counterPartyMap);
			modelAndView.addObject("investmentTypeMap", investmentTypeMap);
			modelAndView.addObject("commodityIdMap", commodityMap);

		} else if ("forwards".equalsIgnoreCase(param)) {
			Map<String, String> commodityMap = forwardsAction.getForwardsCId();
			System.out.println("forwards CID's :: " + commodityMap);

			Map<String, String> exchangeMap = new HashMap<String, String>();
			exchangeMap.put("bse", "BSE");
			exchangeMap.put("nse", "NSE");

			Map<String, String> counterPartyMap = forwardsAction.getForwardsCounterParty();
			System.out.println("forwards Counter Party :: " + counterPartyMap);

			Map<String, String> investmentTypeMap = new HashMap<String, String>();
			investmentTypeMap.put("MF", "MF");
			investmentTypeMap.put("LF", "LF");

			// 1.1 added forward price & spot price
			Map<String, String> forwardPriceMap = new HashMap<String, String>();
			forwardPriceMap.put("200", "$200");
			forwardPriceMap.put("300", "$300");
			forwardPriceMap.put("400", "$400");

			Map<String, String> spotPriceMap = new HashMap<String, String>();
			spotPriceMap.put("800", "$800");
			spotPriceMap.put("450", "$450");
			spotPriceMap.put("400", "$400");

			modelAndView.addObject("paramIdentifier", "forwards");
			modelAndView.addObject("agreementNumber", commodityUtil.uniquekeyGenerator("forwards"));
			modelAndView.addObject("exchangeMap", exchangeMap);
			modelAndView.addObject("counterPartyMap", counterPartyMap);
			modelAndView.addObject("investmentTypeMap", investmentTypeMap);
			modelAndView.addObject("commodityIdMap", commodityMap);
			modelAndView.addObject("forwardPriceMap", forwardPriceMap);
			modelAndView.addObject("spotPriceMap", spotPriceMap);

		} else if ("swaps".equalsIgnoreCase(param)) {
			Map<String, String> commodityMap = swapsAction.getSwapsCId();

			Map<String, String> exchangeMap = new HashMap<String, String>();
			exchangeMap.put("bse", "BSE");
			exchangeMap.put("nse", "NSE");

			Map<String, String> counterPartyMap = swapsAction.getSwapsCounterParty();

			Map<String, String> tradeTypeMap = new HashMap<String, String>();
			tradeTypeMap.put("MF", "MF");
			tradeTypeMap.put("LI", "LI");

			// 1.1 added commodity fixed price & commodity floating price
			Map<String, String> commodityfixedPriceMap = new HashMap<String, String>();
			commodityfixedPriceMap.put("200", "$200");
			commodityfixedPriceMap.put("300", "$300");
			commodityfixedPriceMap.put("400", "$400");

			Map<String, String> commodityfloatingPriceMap = new HashMap<String, String>();
			commodityfloatingPriceMap.put("800", "$800");
			commodityfloatingPriceMap.put("450", "$450");
			commodityfloatingPriceMap.put("400", "$400");

			modelAndView.addObject("paramIdentifier", "swaps");
			modelAndView.addObject("agreementNumber", commodityUtil.uniquekeyGenerator("swaps"));
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

	// for submission of Futures
	@RequestMapping(value = "/commoditydetails/futures/submit", method = RequestMethod.POST)
	public ModelAndView submitFutureFormData(@ModelAttribute("commodityBean") CommodityBean commodityBean) {
		System.out.println("Submit Futures commodityBean :: " + commodityBean);

		ModelAndView modelAndView = new ModelAndView();

		boolean isInsert = futureServices.saveAll(commodityBean);
		System.out.println("Futures is insert :: " + isInsert);

		modelAndView.addObject("commodityBean", new CommodityBean());
		modelAndView.setViewName("commodityDetails");
		return modelAndView;
	}

	// for submission of Listed Options
	@RequestMapping(value = "/commoditydetails/listed/submit", method = RequestMethod.POST)
	public ModelAndView submitListedFormData(@ModelAttribute("commodityBean") CommodityBean commodityBean) {
		System.out.println("Submit Listed commodityBean :: " + commodityBean);

		ModelAndView modelAndView = new ModelAndView();

		boolean isInsert = listedServices.saveAll(commodityBean);
		System.out.println("Listed Options is insert :: " + isInsert);

		modelAndView.addObject("commodityBean", new CommodityBean());
		modelAndView.addObject("paramIdentifier", "listedOptions");
		modelAndView.setViewName("commodityDetails");
		return modelAndView;
	}

	// for submission of Forwards
	@RequestMapping(value = "/commoditydetails/forwards/submit", method = RequestMethod.POST)
	public ModelAndView submitForwardsFormData(@ModelAttribute("commodityBean") CommodityBean commodityBean) {
		System.out.println("Submit Forwards commodityBean :: " + commodityBean);

		ModelAndView modelAndView = new ModelAndView();

		boolean isInsert = forwardsService.saveAll(commodityBean);
		System.out.println("Forwards is insert :: " + isInsert);

		modelAndView.addObject("commodityBean", new CommodityBean());
		modelAndView.setViewName("commodityDetails");
		return modelAndView;
	}

	// for submission of Swaps
	@RequestMapping(value = "/commoditydetails/swaps/submit", method = RequestMethod.POST)
	public ModelAndView submitSwapsFormData(@ModelAttribute("commodityBean") CommodityBean commodityBean) {
		System.out.println("Submit Forwards commodityBean :: " + commodityBean);

		ModelAndView modelAndView = new ModelAndView();

		boolean isInsert = swapsService.saveAll(commodityBean);
		System.out.println("Forwards is insert :: " + isInsert);

		modelAndView.addObject("commodityBean", new CommodityBean());
		modelAndView.setViewName("commodityDetails");
		return modelAndView;
	}

	@RequestMapping(value = "/commoditydetails/getHomePage", method = RequestMethod.GET)
	public String getHomePage() {
		return "home";
	}

	///////////////////////////// Create & Edit of Listed/////////////////////////////

	@RequestMapping(value = "/commoditydetails/getlisted/home", method = RequestMethod.GET)
	public ModelAndView getListedHomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home_listed");
		return modelAndView;
	}

	@RequestMapping(value = "/commoditydetails/getlisted/{param}", method = RequestMethod.GET)
	public ModelAndView getEditListedPage(@PathVariable("param") String param) {
		ModelAndView modelAndView = new ModelAndView();
		if ("editlisted".equalsIgnoreCase(param)) {
			modelAndView.addObject("paramIdentifier", "editlisted");
		}

		modelAndView.setViewName("edit_parameters");
		return modelAndView;
	}

	/*@RequestMapping(value = "/commoditydetails/getlisted/editparameter/{param}/{key}", method = RequestMethod.GET)
	public ModelAndView getEditListedParametersPage(@PathVariable("param") String param,
			@PathVariable("key") String key) {
		ModelAndView modelAndView = new ModelAndView();
		if ("editlisted".equalsIgnoreCase(param)) {
			modelAndView.addObject("paramIdentifier", "editlisted");
		}

		modelAndView.setViewName("edit_parameters");
		return modelAndView;
	}*/

	///////////////////////////// Create & Edit of Futures/////////////////////////////

	@RequestMapping(value = "/commoditydetails/getfutures/home", method = RequestMethod.GET)
	public ModelAndView getFuturesHomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home_futures");
		return modelAndView;
	}

	@RequestMapping(value = "/commoditydetails/editparameters/{param}", method = RequestMethod.GET)
	public ModelAndView getEditFuturesPage(@PathVariable("param") String param) {
		ModelAndView modelAndView = new ModelAndView();
		if ("editfutures".equalsIgnoreCase(param)) {
			modelAndView.addObject("paramIdentifier", "editfutures");
		}else if ("editforwards".equalsIgnoreCase(param)) {
			modelAndView.addObject("paramIdentifier", "editforwards");
		}else if ("editswaps".equalsIgnoreCase(param)) {
			modelAndView.addObject("paramIdentifier", "editswaps");
		}else if ("editlisted".equalsIgnoreCase(param)) {
			modelAndView.addObject("paramIdentifier", "editlisted");
		}
		
		modelAndView.setViewName("edit_parameters");
		return modelAndView;
	}

	@RequestMapping(value = "/commoditydetails/getfutures/editparameter/{param}/{id}/{agreementNo}", method = RequestMethod.GET)
	public ModelAndView getEditParametersPage(@PathVariable("param") String param,
			@PathVariable("id") String id, @PathVariable("agreementNo") String agreementNo) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("param :: " + param);
		System.out.println("id :: " + id);
		System.out.println("agreement no :: " + agreementNo);
		
		CommodityBean commodityBean = new CommodityBean();
		ContractDataBean contractDataBean = new ContractDataBean();
		if ("editfutures".equalsIgnoreCase(param)) {
			Futures f=futuresAction.getFuturesById(Integer.valueOf(id));
			System.out.println("futuresAction.getFuturesById(id) f is ::"+f);
			if(null != f) {
				commodityBean.setAgreementNumber(agreementNo);
				commodityBean.setPrimaryKey(id);
				commodityBean.setCommodityId(f.getCommodityId());
				commodityBean.setCounterParty(f.getCounterParty());
				commodityBean.setExchange(f.getExchange());
				commodityBean.setStartDate(f.getStartDate());
				commodityBean.setEndDate(f.getEndDate());
				commodityBean.setFuturePrice(String.valueOf(f.getFuturePrice()));
				
				contractDataBean.setTypeOfInvestment(f.getInvestType());
				contractDataBean.setContractDate(f.getContractDate());
				
				commodityBean.setContractDataBean(contractDataBean);
				modelAndView.addObject("EDIT_OBJECT", f);
			}
			Map<String, String> commodityMap = futuresAction.getFuturesCId();
			System.out.println("futures CID's :: " + commodityMap);

			Map<String, String> exchangeMap = new HashMap<String, String>();
			exchangeMap.put("bse", "BSE");
			exchangeMap.put("nse", "NSE");

			Map<String, String> counterPartyMap = futuresAction.getFuturesCounterParty();
			System.out.println("futures Counter party ID's :: " + counterPartyMap);

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

			modelAndView.addObject("editParam", "edit");
		}else if ("editlisted".equalsIgnoreCase(param)) {
			Listed  listed =listedAction.getListedById(Integer.valueOf(id));
			System.out.println("Listed obj ::"+ listed);
			if(null != listed) {
				commodityBean.setAgreementNumber(agreementNo);
				commodityBean.setPrimaryKey(id);
				commodityBean.setCommodityId(listed.getCommodityId());
				commodityBean.setCounterParty(listed.getCounterParty());
				commodityBean.setExchange(listed.getExchange());
				commodityBean.setStartDate(listed.getStartDate());
				commodityBean.setMaturity(listed.getMaturityDate());
				commodityBean.setStrikePrice(String.valueOf(listed.getStrikePrice()));
				commodityBean.setOptionPremium(String.valueOf(listed.getOption()));
				
				contractDataBean.setTypeOfInvestment(listed.getInvestType());
				contractDataBean.setContractDate(listed.getContractDate());
				
				commodityBean.setContractDataBean(contractDataBean);
				modelAndView.addObject("EDIT_OBJECT", listed);
			}
			
			Map<String, String> commodityMap = listedAction.getListedCId();
			System.out.println("listed CID's :: " + commodityMap);

			Map<String, String> exchangeMap = new HashMap<String, String>();
			exchangeMap.put("bse", "BSE");
			exchangeMap.put("nse", "NSE");

			Map<String, String> counterPartyMap = listedAction.getListedCounterParty();
			System.out.println("listed Counter party ID's :: " + counterPartyMap);

			Map<String, String> investmentTypeMap = new HashMap<String, String>();
			investmentTypeMap.put("MF", "MF");
			investmentTypeMap.put("LI", "LI");

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
			
			modelAndView.addObject("editParam", "edit");
		}else if ("editforwards".equalsIgnoreCase(param)) {
			Forwards  forwards =forwardsAction.getForwardsById(Integer.valueOf(id));
			System.out.println("forwards obj ::"+ forwards);
			if(null != forwards) {
				commodityBean.setPrimaryKey(id);
				commodityBean.setAgreementNumber(agreementNo);
				commodityBean.setCommodityId(forwards.getCommodityId());
				commodityBean.setCounterParty(forwards.getCounterParty());
				commodityBean.setExchange(forwards.getExchange());
				commodityBean.setStartDate(forwards.getStartDate());
				commodityBean.setForwardPrice(String.valueOf(forwards.getForwardPrice()));
				commodityBean.setSpotPrice(String.valueOf(forwards.getSpotPrice()));
				commodityBean.setEndDate(forwards.getEndDate());
				
				contractDataBean.setTypeOfInvestment(forwards.getInvestType());
				contractDataBean.setContractDate(forwards.getContractDate());
				
				commodityBean.setContractDataBean(contractDataBean);
				modelAndView.addObject("EDIT_OBJECT", forwards);
			}
			Map<String, String> commodityMap = forwardsAction.getForwardsCId();
			System.out.println("forwards CID's :: " + commodityMap);

			Map<String, String> exchangeMap = new HashMap<String, String>();
			exchangeMap.put("bse", "BSE");
			exchangeMap.put("nse", "NSE");

			Map<String, String> counterPartyMap = forwardsAction.getForwardsCounterParty();
			System.out.println("forwards Counter Party :: " + counterPartyMap);

			Map<String, String> investmentTypeMap = new HashMap<String, String>();
			investmentTypeMap.put("MF", "MF");
			investmentTypeMap.put("LF", "LF");

			// 1.1 added forward price & spot price
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
			modelAndView.addObject("editParam", "edit");

		}
		modelAndView.addObject("commodityBean", commodityBean);
		modelAndView.setViewName("commodityDetails");
		return modelAndView;
	}

	///////////////////////////// Create & Edit of Forwards/////////////////////////////

	@RequestMapping(value = "/commoditydetails/getforwards/home", method = RequestMethod.GET)
	public ModelAndView getForwardsHomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home_forwards");
		return modelAndView;
	}

	@RequestMapping(value = "/commoditydetails/getforwards/{param}", method = RequestMethod.GET)
	public ModelAndView getEditForwardsPage(@PathVariable("param") String param) {
		ModelAndView modelAndView = new ModelAndView();
		if ("editforwards".equalsIgnoreCase(param)) {
			modelAndView.addObject("paramIdentifier", "editforwards");
		}

		modelAndView.setViewName("edit_parameters");
		return modelAndView;
	}

	/*@RequestMapping(value = "/commoditydetails/getforwards/editparameter/{param}/{key}", method = RequestMethod.GET)
	public ModelAndView getEditForwardsParametersPage(@PathVariable("param") String param,
			@PathVariable("key") String key) {
		ModelAndView modelAndView = new ModelAndView();
		if ("editforwards".equalsIgnoreCase(param)) {
			modelAndView.addObject("paramIdentifier", "editforwards");
		}

		modelAndView.setViewName("edit_parameters");
		return modelAndView;
	}*/

	///////////////////////////// Create & Edit of Swaps/////////////////////////////

	@RequestMapping(value = "/commoditydetails/getswaps/home", method = RequestMethod.GET)
	public ModelAndView getSwapsHomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home_swaps");
		return modelAndView;
	}

	@RequestMapping(value = "/commoditydetails/getswaps/{param}", method = RequestMethod.GET)
	public ModelAndView getEditSwapsPage(@PathVariable("param") String param) {
		ModelAndView modelAndView = new ModelAndView();
		if ("editswaps".equalsIgnoreCase(param)) {
			modelAndView.addObject("paramIdentifier", "editswaps");
		}

		modelAndView.setViewName("edit_parameters");
		return modelAndView;
	}

	/*@RequestMapping(value = "/commoditydetails/getswaps/editparameter/{param}/{key}", method = RequestMethod.GET)
	public ModelAndView getEditSwapsParametersPage(@PathVariable("param") String param,
			@PathVariable("key") String key) {
		ModelAndView modelAndView = new ModelAndView();
		if ("editswaps".equalsIgnoreCase(param)) {
			modelAndView.addObject("paramIdentifier", "editswaps");
		}

		modelAndView.setViewName("edit_parameters");
		return modelAndView;
	}*/

}
