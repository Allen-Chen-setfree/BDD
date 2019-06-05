
@UnitTest @FuctionTest
Feature: add item into shopping cart

Background:

Scenario: add "Printed Chiffon Dress" to cart
           Given I am on the "Summer_Dresses" page
           When I add "Printed Chiffon Dress" into cart
           Then I should see the info window "Product successfully added to your shopping cart"
           And "1" such item is added to card