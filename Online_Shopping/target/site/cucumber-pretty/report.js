$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Add_Item_To_Cart.feature");
formatter.feature({
  "line": 3,
  "name": "add item into shopping cart",
  "description": "",
  "id": "add-item-into-shopping-cart",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@UnitTest,"
    },
    {
      "line": 2,
      "name": "@FuctionTest"
    }
  ]
});
formatter.before({
  "duration": 25496096638,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "add \"Printed Chiffon Dress\" to cart",
  "description": "",
  "id": "add-item-into-shopping-cart;add-\"printed-chiffon-dress\"-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on the \"Summer_Dresses\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I add \"Printed Chiffon Dress\" into cart",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see the info window \"Product successfully added to your shopping cart\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "\"1\" such item is added to card",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Summer_Dresses",
      "offset": 13
    }
  ],
  "location": "Steps.i_am_on_the_page(String)"
});
formatter.result({
  "duration": 8206288810,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Chiffon Dress",
      "offset": 7
    }
  ],
  "location": "Steps.i_add(String)"
});
formatter.result({
  "duration": 1761671081,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Product successfully added to your shopping cart",
      "offset": 30
    }
  ],
  "location": "Steps.i_should_see_the_info_window(String)"
});
formatter.result({
  "duration": 2187549234,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 1
    }
  ],
  "location": "Steps.one_such_item_is_added_to_card(int)"
});
formatter.result({
  "duration": 25505743,
  "status": "passed"
});
formatter.after({
  "duration": 5399306381,
  "status": "passed"
});
});