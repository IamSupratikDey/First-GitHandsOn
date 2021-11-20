Feature: Automate a Gifting Website

Scenario: Landing on the Correct WebSite
   Given The Browser URl
   When User click on the URL
   Then The Website Should open
   
Scenario: To add item in Shopping Cart
   Given User on desired website
  When  User Navigate to Shopping Category and clicks on the Travel Gifts 
   And   Choose Mask frogg Eye Mask 
   And   User do add to cart continue Shopping 
  Then  Item will be  added to shopping cart
   
Scenario: To verify search box is functionality
   Given  User on desired website
   When   User Type "Birthday Gift for men"
   And    Select Birthday gift for men form the dropdown 
   Then   New page with gift for men will open which will contain -Birthday gifts for men text  
   
Scenario: Feature Validation 
   Given  User on desired website
   When   User click on the box Whats New
   Then   New Page will open containing the text What's New
   
Scenario: Wishlist Validation
   Given User is on Whats New Page
   When  Select Friends Bobblehead click on Add to wishlist  
   Then  Wishlist will open with that Item
   
Scenario: Cart feature validation
   Given Some items is in cart
   When  User Go to cart  
   And   click Remove item form the cart
   Then  The items should be removed and  verify the page contains cart is empty
   
Scenario: Gift Card validation
   Given Gift Card should be present in the website
   When  User Navigate to gift card 
   And   click on that  
   Then  new page will open veify the new page contains the text Rs.
   
Scenario: sign in page validation1
    Given  User should be on sign in page 
    When   Click on sign in 
    And    Provide wrong credential 
    Then   The page should contain Incorrect email or password
    