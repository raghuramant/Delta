package com.runner;

import com.resources.ApplicationFunctionality;
import com.resources.Utilities;

public class MainScript {

	public static void main(String[] args) throws InterruptedException {
		Utilities.browserOpen();
		Utilities.launchURL("https://www.delta.com");
		ApplicationFunctionality.cookieBannerClose();
		ApplicationFunctionality.oneWaySimpleExactDate("ATL", "DAL", "06/15/2018", "2");
		Thread.sleep(2000);
		Utilities.browserClose();
	}

}
