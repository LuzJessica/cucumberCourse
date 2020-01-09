Feature: Rental Store

	As a user
	I want to insert movies rent
	To manage prices and return dates
	
@ToDo	
	Scenario: Should rent a movie with success
	
		Given a movie with 2 units in stock
		And that the rent price is R$ 3
		When rent
		Then the rent price will be R$ 3
		And the return date will be on next day
		And the stock of movie will be 1 unit

@ToDo
Scenario: Should not rent movies without stock
	
		Given a movie with 0 units in stock
		When rent
		Then wont be able because does not have stock
		And the stock of movie will be 0 unit
		
@ToDo		
Scenario: Should give special conditions for extended category
	
		Given a movie with 2 units in stock
		And that the rent price is R$ 4
		And the rent type is extended 
		When rent
		Then the rent price will be R$ 8
		And the return date will be in 3 days
		And the received pontuation will be 2 points