Feature: NewAccount

@AccountTest
Scenario: Create new account 
Given User on landing page
When User click on sign in button
Then Enter email address "mike6@gmail.com"
Then Click on Create an account button
Then Enter First name "mike" and Last name "wills" and Password "abcd1234"
Then Enter Address "1 Broadway" and City "New York"
Then Select State "New York"
Then Enter Postal code "10038" and Mobile phone "00123456789123"
Then Click on Register
Then Verify user logged in and landed on my account page
Then Click on Signout

@LoginTest
Scenario: Existing customer login
Given User on landing page
When User click on sign in button
Then Enter existing customer email id "mike1@gmail.com" and password "abcd1234"
Then Click on sign in button in already registered box
Then Verify user logged in and landed on my account page
Then Click on Signout


@ExpensiveDressTest
Scenario: Find the most expensive dress and add to cart
Given User on landing page
Then Find most expensive dress and add it to the cart


@ShoppingCartTest
Scenario: Logged in customer logout and login again to verify item in cart
Given User on landing page
When User click on sign in button
Then Enter existing customer email id "mike1@gmail.com" and password "abcd1234"
Then Click on sign in button in already registered box
Then Verify user logged in and landed on my account page
Then Find most expensive dress and add it to the cart
