Feature: Multi-city Flight Booking 

Scenario: 
	Booking Multi-City flight for an adult with exact travel date in Basic Economy Class without trip extras
	
	Given User is in Delta WebPage 
	And User clicks Multi-City Option 
	
	When User inputs the departing airport, arriving airport of the muliple cities according to user's travel plan along with the date of journey 
	And User selects the number of passenger as one, Basic Economy as his class and Clicks the Find Flights button and selects the required multiple flights 
	And User enters the personal info and skips to the payment without adding trip extras 
	
	Then User verifies whether the text Payment is displayed or not 
	
Scenario: 
	Booking Multi-City flight for an adult with exact travel date in Basic Economy Class with trip extras
	
	Given User is in Delta WebPage 
	And User clicks Multi-City Option 
	
	When User inputs the departing airport, arriving airport of the muliple cities according to user's travel plan along with the date of journey 
	And User selects the number of passenger as one, Basic Economy as his class and Clicks the Find Flights button and selects the required multiple flights 
	And User enters the personal info and navigates to Trip Extras to include addons and proceeds to the payment page 
	
	Then User verifies whether the text Payment is displayed or not 
	
Scenario: 
	Booking Multi-City flight for multiple passengers with exact travel date in Basic Economy Class without trip extras
	
	Given User is in Delta WebPage 
	And User clicks Multi-City Option 
	
	When User inputs the departing airport, arriving airport of the muliple cities according to user's travel plan along with the date of journey 
	And User selects the number of passengers, Basic Economy as the class and Clicks the Find Flights button and selects the required multiple flights 
	And User enters the personal info of the passengers and skips to the payment without adding trip extras 
	
	Then User verifies whether the text Payment is displayed or not 
	
Scenario: 
	Booking Multi-City flight for multiple passengers with exact travel date in Basic Economy Class with trip extras
	
	Given User is in Delta WebPage 
	And User clicks Multi-City Option 
	
	When User inputs the departing airport, arriving airport of the muliple cities according to user's travel plan along with the date of journey 
	And User selects the number of passengers, Basic Economy as the class and Clicks the Find Flights button and selects the required multiple flights 
	And User enters the personal info of the passengers and navigates to Trip Extras to include addons and proceeds to the payment page 
	
	Then User verifies whether the text Payment is displayed or not 
	
Scenario: 
	Booking Multi-City flight for a kid having age less than 15 years with exact travel date in Basic Economy Class with trip extras
	
	Given User is in Delta WebPage 
	And User clicks Multi-City Option 
	
	When User inputs the departing airport, arriving airport of the muliple cities according to user's travel plan along with the date of journey 
	And User selects the number of passenger, Basic Economy as the class and Clicks the Find Flights button and selects the required multiple flights 
	And User enters the personal info of the passengers. 
	
	Then User verifies whether the warning message is displayed or not 
	