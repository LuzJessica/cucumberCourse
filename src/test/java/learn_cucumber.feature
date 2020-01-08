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
	

	
	


 