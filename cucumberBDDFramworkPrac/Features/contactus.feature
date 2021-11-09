Feature: HealthCare Page Functionality


Scenario: Verify Tide Free and Gentle powde is Listed in Five product list
Given Browser Url
When User hover on the Shop Products
And User choose powder form the drop down
Then Five Product list page opened 


Scenario: Search the product named Antibacterial and click on search Icon
Given The Website page
When User enter the product "Antibacterial"
And User clicks on the search icon
Then New Product page shoild open

