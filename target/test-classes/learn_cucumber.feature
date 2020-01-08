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
	Then the counter value will be 18