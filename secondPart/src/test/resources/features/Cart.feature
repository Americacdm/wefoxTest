Feature: Cart
	This functionality saves your products
	
	Scenario: Save an specific article in the cart
	Given I enter to lego page
	And I search an specific article
	And I verify that appears in the suggested result TextSuggestion element
	When I click on the suggested result
	And I check that you are redirect to the item page
	Then I add in my cart