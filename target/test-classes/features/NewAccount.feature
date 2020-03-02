Feature: NewAccount

Background:
Given User on landing page
When User click on sign in button

@AccountTest
Scenario Outline: Create new account 
Then user enters "<emailId>"
Then Click on Create an account button
Then Enter "<firstName>" "<lastName>" "<passWord>" "<Address>" "<CityName>" "<postcode>""<Mobile>"
Then Select State "New York"
Then Click on Register
Then Verify user logged in and landed on my account page
Then Click on Signout


Examples:

|firstName|lastName|passWord|Address|emailId|postcode|Mobile|CityName|
|Mike|Wills|abcd1234|1 Broadway|mike@gmail.com|58962|07922228058455|New York|

@LoginTest
Scenario: Existing customer login
Then Enter existing customer email id "mike1@gmail.com" and password "abcd1234"
Then Click on sign in button in already registered box
Then Verify user logged in and landed on my account page
Then Click on Signout


@ExpensiveDressTest
Scenario: Find the most expensive dress and add to cart
Then user click on dresses menu
Then user select listview
Then user select Highest Price from the dropdown
Then Find most expensive dress and add it to the cart


@ShoppingCartTest
Scenario: Logged in customer logout and login again to verify item in cart
Then Enter existing customer email id "mike1@gmail.com" and password "abcd1234"
Then Click on sign in button in already registered box
Then Verify user logged in and landed on my account page
Then user click on dresses menu
Then user select listview
Then user select Highest Price from the dropdown
Then Find most expensive dress and add it to the cart
Then Verify the item is still in the cart
Then Click on Signout
When User click on sign in button
Then Enter existing customer email id "mike1@gmail.com" and password "abcd1234"
Then Click on sign in button in already registered box
Then Verify the item is still in the cart
