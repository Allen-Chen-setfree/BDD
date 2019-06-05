

@UnitTest
Feature: register an account
 
Background:
I'm a new customer who don't have an account
I want to use my email address to register an account

Scenario Outline: use email address to sign in
           Given I am on the Sign In page: "SignIn"
           When I input correct email address "<Email>" to create an account
           And I click the button "Create an account"
           Then I should navigate to register page

Examples:
|Email|
|test124@123.com|
|123test@124.com|

