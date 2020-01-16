@functionalTests
Feature: Insert account

As a user
I want to insert accounts
To distribuit my money in a more organized way

Background: 

	Given that I am accessing the application
	When I inform the user jessica.luz@matera.com
	And the password 102011jcs
	And select enter
	Then I view the main page
	When I select Accounts
	And select Add

@ToDo	
Scenario Outline: Should validate account insertion rules

When inform an account <accountName>
And select Save
Then I receive the message "<returnMessage>"

Examples: 

     |    accountName     |            returnMessage           |
     |    Account Test    |    Conta adicionada com sucesso!   |
     |                    |        Informe o nome da conta     |
    

	
	
	
