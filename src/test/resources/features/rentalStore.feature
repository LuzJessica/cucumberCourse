Feature: Rental Store

	As a user
	I want to insert movies rent
	To manage prices and return dates

@ToDo	
Scenario Outline:

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
	

@ToDo
Scenario: Should not rent movies without stock
	
		Given a movie with 0 units in stock
		When rent
		Then wont be able because does not have stock
		And the stock of movie will be 0 unit
				


	 	