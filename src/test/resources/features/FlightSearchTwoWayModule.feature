Feature: Round-Trip Flight Booking 

Scenario: 
	Booking Round-Trip flight for an adult with exact travel date in Basic Economy Class without trip extras
	
	Given User is in Delta WebPage
		
	When User inputs the departing airport, arriving airport and the date of onward and return journey 
	And User Clicks the Find Flights button and selects the required onward and return flight in Basic Economy Class 
	And User enters the personal info and skips to the payment without adding trip extras 
	
	Then User verifies whether the text Payment is displayed or not 
	
Scenario: 
	Booking Round-Trip flight for an adult with exact travel date in Basic Economy Class with trip extras
	
	Given User is in Delta WebPage 
	
	When User inputs the departing airport, arriving airport and the date of onward and return journey 
	And User Clicks the Find Flights button and selects the required onward and return flight in Basic Economy Class 
	And User enters the personal info and navigates to Trip Extras to include addons and proceeds to the payment page 
	
	Then User verifies whether the text Payment is displayed or not 
	
	
Scenario: 
	Booking Round-Trip flight for an adult with flexible travel date in Basic Economy Class without trip extras
	
	Given User is in Delta WebPage 
	
	When User inputs the departing airport, arriving airport and the date of onward and return journey 
	And User Clicks the Find Flights button and selects the lowest fare flight in Basic Economy Class 
	And User enters the personal info and skips to the payment without adding trip extras 
	
	Then User verifies whether the text Payment is displayed or not 
	
Scenario: 
	Booking Round-Trip flight for an adult with flexible travel date in Basic Economy Class with trip extras
	
	Given User is in Delta WebPage 
	
	When User inputs the departing airport, arriving airport and the date of onward and return journey 
	And User Clicks the Find Flights button and selects the lowest fare flight in Basic Economy Class 
	And User enters the personal info, navigates to Trip Extras to include addons and proceeds to the payment page 
	
	Then User verifies whether the text Payment is displayed or not
	
	Scenario: 
	Booking Round-Trip flight for a kid having age less than 15 years with exact travel date in Basic Economy Class without Trip Extras
	
	Given User is in Delta WebPage 
	
	When User inputs the departing airport, arriving airport and the date of onward and return journey 
	And User Clicks the Find Flights button and selects the lowest fare flight in Basic Economy Class 
	And User enters the personal info
	
	Then User verifies whether the warning message is displayed or not
	
	Scenario: 
	Booking Round-Trip flight for multiple passengers with exact travel date in Basic Economy Class without trip extras
	
	Given User is in Delta WebPage 
	
	When User inputs the departing airport, arriving airport and the date of onward and return journey 
	And User Clicks the Find Flights button and selects the required onward and return flight in Basic Economy Class 
	And User enters the personal info of the passengers and skips to the payment without adding trip extras 
	
	Then User verifies whether the text Payment is displayed or not 
	
	Scenario: 
	Booking Round-Trip flight for multiple passengers with exact travel date in Basic Economy Class with trip extras
	
	Given User is in Delta WebPage 
	
	When User inputs the departing airport, arriving airport and the date of onward and return journey 
	And User Clicks the Find Flights button and selects the required onward and return flight in Basic Economy Class 
	And User enters the personal info of the passengers, navigates to Trip Extras to include addons and proceeds to the payment page 
	
	Then User verifies whether the text Payment is displayed or not 
	
	
Scenario: 
	Booking Round-Trip flight for multiple passengers with flexible travel date in Basic Economy Class without trip extras
	
	Given User is in Delta WebPage 
	
	When User inputs the departing airport, arriving airport and the date of onward and return journey 
	And User Clicks the Find Flights button and selects the lowest fare flight in Basic Economy Class 
	And User enters the personal info of the passengers  and skips to the payment without adding trip extras 
	
	Then User verifies whether the text Payment is displayed or not 
	
Scenario: 
	Booking Round-Trip flight for multiple passengers with flexible travel date in Basic Economy Class with trip extras
	
	Given User is in Delta WebPage 
	
	When User inputs the departing airport, arriving airport and the date of onward and return journey 
	And User Clicks the Find Flights button and selects the lowest fare flight in Basic Economy Class 
	And User enters the personal info of the passengers , navigates to Trip Extras to include addons and proceeds to the payment page 
	
	Then User verifies whether the text Payment is displayed or not
	
	
	
	
	
	
	
	
	
	
	
	
	
	