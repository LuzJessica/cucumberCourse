@unitTests
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

@This	
Scenario: Should calculate delivery due date

	Given that the delivery due date is in 05/04/2018
	When the package delay 2 days
	Then the delivery will be done in 07/04/2018
	
Scenario: Should calculate delivery due date in China

	Given that the delivery due date is in 05/04/2018
	When the package delay 2 months
	Then the delivery will be done in 05/06/2018
	
Scenario: Should create generic steps for this steps

	Given that the ticket is AF345
	Given that the ticket value is R$ 230,45
	Given that the passenger name is "Fulano da Silva"
	Given that the passenger telephone is 9999-9999
	When create the steps
	Then the test will work
	
Scenario: Shuould reuse the "Given" steps from previous scenario

	Given that the ticket is AB167
	Given that the special ticket is AB167
	Given that the ticket value is R$ 1120,23
	Given that the passenger name is "Cicrano de Olivera"
	Given that the passenger telephone is 9888-8888
	
@ignored	
Scenario: Should deny all "Given" steps from previously scenarios

	Given that the ticket is CD123
	Given that the ticket is AG1235
	Given that the ticker value is R$ 1.134,56
	Given that the passenger name is "Beltrano Souza Matos de Alcântara Azevedo"
	Given that the passenger telephone is 1234-5678
	Given that the passenger telephone is 999-2223


	

	
	


 