package com.commodity.util;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class CommodityUtil {

	public String uniquekeyGenerator(String param) {
		Random r = new Random(System.currentTimeMillis());
		int randomNo = (1 + r.nextInt(2)) * 10000 + r.nextInt(10000);
		long agreementNo = 0L;
		if (null != param && !param.isEmpty()) {
			if ("futures".equalsIgnoreCase(param)) {
				agreementNo = 1000000000L + randomNo;
			} else if ("listedoptions".equalsIgnoreCase(param)) {
				agreementNo = 2000000000L + randomNo;
			} else if ("forwards".equalsIgnoreCase(param)) {
				agreementNo = 3000000000L + randomNo;
			} else if ("swaps".equalsIgnoreCase(param)) {
				agreementNo = 4000000000L + randomNo;
			}
		}
		System.out.println(" Ack no for ::" + param + " :: " + String.valueOf(agreementNo));
		return String.valueOf(agreementNo);
	}
}
