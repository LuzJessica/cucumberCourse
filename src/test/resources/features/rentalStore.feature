@unitTests
Feature: Rental Store

	As a user
	I want to insert movies rent
	To manage prices and return dates


Scenario Outline: Should give conditions conform rent type

	Given a movie with 2 units in stock
		And that the rent price is R$ <price>
		And the rent type is <type> 
		When rent
		Then the rent price will be R$ <rentPrice>
		And the return date will be in <days> days
		And the received pontuation will be <pontuation> points
		
Examples:		
| price |   type   | rentPrice | days | pontuation |
|   4   | extended |     8     |   3  |     2      |
|   3   |  common  |     3     |   1  |     1      |
|   4   |  common  |     4     |   1  |     1      |
|   10  | extended |     20    |   3  |     2      |	
|   5   |  weekly  |     15    |   7  |     3      |
	

Scenario: Should rent a movie with success
	
		Given a movie
		| stock | 2      |
		| price | 3      |
		| rentType | common | 
		When rent
		Then the rent price will be R$ 3
		And the return date will be in 1 day
		And the stock of movie will be 1 unit 
		

Scenario: Should not rent movies without stock
	
		Given a movie with 0 units in stock
		When rent
		Then wont be able because does not have stock
		And the stock of movie will be 0 unit
				


	 	