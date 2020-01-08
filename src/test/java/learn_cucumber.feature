Feature: Learn Cucumber
	As a student
	I want to learn how to use Cucumber
	So I can automate acceptance scenarios

Scenario: Should execute specification

  Given that I created the file correctly
  When I execute this 
  Then the specification should finish succesfully
  
Scenario: Should increment counter

	Given that counter value is 15
	When I increment with 5
	When I decrement with 5
	When I divide by 5
	When I multiplicate by 2
	Then the counter incremented value will be 18
	Then the counter decremented value will be 10
	Then the counter divided by value will be 3
	Then the counter multiplicated by value will be 90
	
Scenario: Should calculate delivery due date

	Given that the delivery due date is in 05/04/2018
	When the package delay 2 days
	Then the delivery will be done in 07/04/2018
	
Scenario: Should calculate delivery due date in China

	Given that the delivery due date is in 05/04/2018
	When the package delay 2 months
	Then the delivery will be done in 05/06/2018
	
	


	

	
	


 