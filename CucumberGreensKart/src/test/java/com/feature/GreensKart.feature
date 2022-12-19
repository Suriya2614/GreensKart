Feature: User to shop a vegetable in GreensKart 

Scenario:
User to cart the product in the add to cart and proceed to checkout the product 
	Given User to launch the url 
	When User to search vegetables in the search box 
	And User to click the quantity of vegetable 
	And User to click on the add to cart of the vegetable 
	And User to click on add to cart 
	And User to click on proceed to checkout 
	
Scenario: User to Place Order 
	When User to give the promocode values 
	And User to click the apply 
	And User to click the proceed 
	
Scenario: User to Proced the order 
	When User to select country 
	And User to click check button in terms and conditions 
	And User to click Proceed 
	
