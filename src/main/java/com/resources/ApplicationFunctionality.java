package com.resources;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.object.repository.DeltaHomePage;

public class ApplicationFunctionality {

	public static void cookieBannerClose() {
		DeltaHomePage elementRef = new DeltaHomePage();
		try {
			elementRef.getCookieBannerClose().click();
		} catch (Exception e) {

		}
	}

	public static void oneWaySimpleExactDate(String departCity, String arrivalCity, String departDate,
			String passengerCount) {
		DeltaHomePage elementRef = new DeltaHomePage();

		elementRef.getOneWayBtn().click();
		elementRef.getOriginCityTxtBx().clear();
		elementRef.getOriginCityTxtBx().sendKeys(departCity);
		elementRef.getDestinationCityTxtBx().sendKeys(arrivalCity);
		elementRef.getDepartDateTxtBx().sendKeys(departDate, Keys.ESCAPE);
		Select selectObj = new Select(elementRef.getPassengersDrpDwn());
		selectObj.selectByVisibleText(passengerCount);
		elementRef.getFindFlightsBtn().click();

	}

}
