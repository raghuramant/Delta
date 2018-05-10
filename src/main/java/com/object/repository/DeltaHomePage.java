package com.object.repository;

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
	
	@FindBy(id="paxCount")
	private WebElement passengersDrpDwn;
	
	@FindBy(id="ck-banner-close")
	private WebElement cookieBannerClose;

	

	public WebElement getRoundTripBtn() {
		return roundTripBtn;
	}

	public void setRoundTripBtn(WebElement roundTripBtn) {
		this.roundTripBtn = roundTripBtn;
	}

	public WebElement getOneWayBtn() {
		return oneWayBtn;
	}

	public void setOneWayBtn(WebElement oneWayBtn) {
		this.oneWayBtn = oneWayBtn;
	}

	public WebElement getMultiCityBtn() {
		return multiCityBtn;
	}

	public void setMultiCityBtn(WebElement multiCityBtn) {
		this.multiCityBtn = multiCityBtn;
	}

	public WebElement getOriginCityTxtBx() {
		return originCityTxtBx;
	}

	public void setOriginCityTxtBx(WebElement originCityTxtBx) {
		this.originCityTxtBx = originCityTxtBx;
	}

	public WebElement getDestinationCityTxtBx() {
		return destinationCityTxtBx;
	}

	public void setDestinationCityTxtBx(WebElement destinationCityTxtBx) {
		this.destinationCityTxtBx = destinationCityTxtBx;
	}

	public WebElement getDepartDateTxtBx() {
		return departDateTxtBx;
	}

	public void setDepartDateTxtBx(WebElement departDateTxtBx) {
		this.departDateTxtBx = departDateTxtBx;
	}

	public WebElement getReturnDateTxtBx() {
		return returnDateTxtBx;
	}

	public void setReturnDateTxtBx(WebElement returnDateTxtBx) {
		this.returnDateTxtBx = returnDateTxtBx;
	}

	public WebElement getExactDatesBtn() {
		return exactDatesBtn;
	}

	public void setExactDatesBtn(WebElement exactDatesBtn) {
		this.exactDatesBtn = exactDatesBtn;
	}

	public WebElement getFlexibleDaysBtn() {
		return flexibleDaysBtn;
	}

	public void setFlexibleDaysBtn(WebElement flexibleDaysBtn) {
		this.flexibleDaysBtn = flexibleDaysBtn;
	}

	public WebElement getFindFlightsBtn() {
		return findFlightsBtn;
	}

	public void setFindFlightsBtn(WebElement findFlightsBtn) {
		this.findFlightsBtn = findFlightsBtn;
	}
	
	public WebElement getPassengersDrpDwn() {
		return passengersDrpDwn;
	}

	public void setPassengersDrpDwn(WebElement passengersDrpDwn) {
		this.passengersDrpDwn = passengersDrpDwn;
	}

	public WebElement getCookieBannerClose() {
		return cookieBannerClose;
	}

	public void setCookieBannerClose(WebElement cookieBannerClose) {
		this.cookieBannerClose = cookieBannerClose;
	}
	
}
