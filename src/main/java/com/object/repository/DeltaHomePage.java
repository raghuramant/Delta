package com.object.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.Utilities;

public class DeltaHomePage extends Utilities{

	public DeltaHomePage(){
		
	PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(xpath = "//label[@id='roundTripBtn']/span[text()='Round Trip']")
	private WebElement roundTripBtn;
	
	@FindBy(xpath="//label[@id='oneWayBtn']/span")
	private WebElement oneWayBtn;
	
	@FindBy(xpath="//label[@id='air-shopping-multicity-link']/span")
	private WebElement multiCityBtn;
	
	@FindBy(id="originCity")
	private WebElement originCityTxtBx;
	
	@FindBy(id="destinationCity")
	private WebElement destinationCityTxtBx;
	
	@FindBy(id="departureDate")
	private WebElement departDateTxtBx;
	
	@FindBy(id="returnDate")
	private WebElement returnDateTxtBx;
	
	@FindBy(xpath = "//label[@id='exactDaysBtn']/span")
	private WebElement exactDatesBtn;
	
	@FindBy(xpath= "//label[@id='flexDaysBtn']/span")
	private WebElement flexibleDaysBtn;
	
	@FindBy(id="findFlightsSubmit")
	private WebElement findFlightsBtn;
	
	@FindBy(id="paxCount-button")
	private WebElement dropdwnIcon_PaxCount;
	
	@FindBy(id="paxCount-menu")
	private By paxCountMenu;
	
	@FindBy(id="ck-banner-close")
	private WebElement cookieBannerClose;

	

	public WebElement getRoundTripBtn() {
		return roundTripBtn;
	}


	public WebElement getOneWayBtn() {
		return oneWayBtn;
	}


	public WebElement getMultiCityBtn() {
		return multiCityBtn;
	}


	public WebElement getOriginCityTxtBx() {
		return originCityTxtBx;
	}


	public WebElement getDestinationCityTxtBx() {
		return destinationCityTxtBx;
	}


	public WebElement getDepartDateTxtBx() {
		return departDateTxtBx;
	}


	public WebElement getReturnDateTxtBx() {
		return returnDateTxtBx;
	}


	public WebElement getExactDatesBtn() {
		return exactDatesBtn;
	}


	public WebElement getFlexibleDaysBtn() {
		return flexibleDaysBtn;
	}


	public WebElement getFindFlightsBtn() {
		return findFlightsBtn;
	}

	
	public WebElement getCookieBannerClose() {
		return cookieBannerClose;
	}


	public WebElement getDropdwnIcon_PaxCount() {
		return dropdwnIcon_PaxCount;
	}


	public By getPaxCountMenu() {
		return paxCountMenu;
	}

	
}
