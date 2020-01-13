Feature: Insert account

As a user
I want to insert accounts
To distribuit my money in a more organized way

@ToDo
Scenario: Should insert an account with success

	Given that I am accessing the application
	When I inform the user "<your user>"
	And the password "<your password>"
	And select enter
	Then I view the main page
	When I select Accounts
	And select Add
	And inform an account "Test Account"
	And select Save
	Then the account is inserted with success
	
Scenario: Should not insert an account without name

	Given that I am accessing the application
	When I inform the user "<your user>"
	And the password "<your password>"
	And select enter
	Then I view the main page
	When I select Accounts
	And select Add
	And select Save
	Then I am notified that the account name is mandatory
	
Scenario: Should not insert an account with existing name

	Given that I am accessing the application
	When I inform the user "<your user>"
	And the password "<your password>"
	And select enter
	Then I view the main page
	When I select Accounts
	And select Add
	And inform an account "Test Account"
	And select Save
	Then I am notified that an account with the same name already exists
	
	
	
