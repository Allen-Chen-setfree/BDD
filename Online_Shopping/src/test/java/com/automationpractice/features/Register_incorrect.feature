

@NegativeTest @UnitTest
Feature: register an account
 
Background:
I'm a new customer who don't have an account
I want to use my email address to register an account

Scenario Outline: use email address to sign in
           Given I am on the "SignIn" page
           When I input incorrect email address "<Email>" to create an account
           And I click the button "Create an account"
           Then I should see the error info "Invalid email address."

Examples:
|Email|
|test123.com|
