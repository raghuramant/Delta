package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.object.repository.DeltaHomePage;
import com.resources.ApplicationFunctionality;
import com.resources.Utilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightSearchOneWayStepDefinition extends Utilities {

	@Given("^User clicks One-Way Option$")
	public void user_clicks_One_Way_Option() throws Throwable {
		DeltaHomePage homePage = new DeltaHomePage();
		homePage.getOneWayBtn();
	}

	@When("^User inputs the departing airport, arriving airport and the date of journey$")
	public void user_inputs_the_departing_airport_arriving_airport_and_the_date_of_journey() throws Throwable {
		DeltaHomePage homePage = new DeltaHomePage();
		clear(homePage.getOriginCityTxtBx());
		sendText(homePage.getOriginCityTxtBx(), "ATL");
		sendText(homePage.getDestinationCityTxtBx(), "DAL");
		homePage.getDepartDateTxtBx().sendKeys("05/23/2018", Keys.ESCAPE);
		//selectByVisibleText(homePage.getPassengersDrpDwn(), "3");
		click(homePage.getDropdwnIcon_PaxCount());
		String locatorPaxCount = "//ul[@id='paxCount-menu']//li[text()='$']";
		locatorPaxCount = locatorPaxCount.replace("$","4");
		System.out.println(homePage.getPaxCountMenu());
		System.out.println(homePage.getDropdwnIcon_PaxCount());
		click(driver.findElement(By.xpath(locatorPaxCount)));
		
		
	}

	@When("^User Clicks the Find Flights button and selects the required flight in Basic Economy Class$")
	public void user_Clicks_the_Find_Flights_button_and_selects_the_required_flight_in_Basic_Economy_Class()
			throws Throwable {
		DeltaHomePage homePage = new DeltaHomePage();
		Thread.sleep(3000);
		homePage.getFindFlightsBtn();

	}

	@When("^User enters the personal info and skips to the payment without adding trip extras$")
	public void user_enters_the_personal_info_and_skips_to_the_payment_without_adding_trip_extras() throws Throwable {

	}

	@Then("^User verifies whether the text Payment is displayed or not$")
	public void user_verifies_whether_the_text_Payment_is_displayed_or_not() throws Throwable {

	}

	@When("^User enters the personal info and navigates to Trip Extras to include addons and proceeds to the payment page$")
	public void user_enters_the_personal_info_and_navigates_to_Trip_Extras_to_include_addons_and_proceeds_to_the_payment_page()
			throws Throwable {

	}

	@When("^User Clicks the Find Flights button and selects the lowest fare flight in Basic Economy Class$")
	public void user_Clicks_the_Find_Flights_button_and_selects_the_lowest_fare_flight_in_Basic_Economy_Class()
			throws Throwable {

	}

	@When("^User enters the personal info, navigates to Trip Extras to include addons and proceeds to the payment page$")
	public void user_enters_the_personal_info_navigates_to_Trip_Extras_to_include_addons_and_proceeds_to_the_payment_page()
			throws Throwable {

	}

	@When("^User enters the personal info$")
	public void user_enters_the_personal_info() throws Throwable {

	}

	@Then("^User verifies whether the warning message is displayed or not$")
	public void user_verifies_whether_the_warning_message_is_displayed_or_not() throws Throwable {

	}

	@When("^User enters the personal info of the passengers and skips to the payment without adding trip extras$")
	public void user_enters_the_personal_info_of_the_passengers_and_skips_to_the_payment_without_adding_trip_extras()
			throws Throwable {

	}

	@When("^User enters the personal info of the passengers, navigates to Trip Extras to include addons and proceeds to the payment page$")
	public void user_enters_the_personal_info_of_the_passengers_navigates_to_Trip_Extras_to_include_addons_and_proceeds_to_the_payment_page()
			throws Throwable {

	}

	@When("^User enters the personal info of the passengers  and skips to the payment without adding trip extras$")
	public void user_enters_the_personal_info_of_the_passengers_and_skips_to_the_payment_without_adding_trip_extras()
			throws Throwable {

	}

	@When("^User enters the personal info of the passengers , navigates to Trip Extras to include addons and proceeds to the payment page$")
	public void user_enters_the_personal_info_of_the_passengers_navigates_to_Trip_Extras_to_include_addons_and_proceeds_to_the_payment_page()
			throws Throwable {

	}

}
