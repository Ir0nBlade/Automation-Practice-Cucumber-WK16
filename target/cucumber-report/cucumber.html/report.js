$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/ShoppingCartDelete.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping cart delete",
  "description": "\r\nUser should able to delete product from shopping cart",
  "id": "shopping-cart-delete",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Verify user should remove product from cart successfully",
  "description": "",
  "id": "shopping-cart-delete;verify-user-should-remove-product-from-cart-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I click on \u0027Women\u0027 tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I select product \"\u003cPRODUCT\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select quantity \"\u003cQUANTITY\u003e\", size \"\u003cSIZE\u003e\" and colour \"\u003cCOLOUR\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on \u0027Add To Cart\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I can see product has been \u0027Product successfully added to your shopping cart\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on \u0027Proceed To Checkout\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on \u0027Delete\u0027 icon to delete the product from shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Product has been removed from shopping cart successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "shopping-cart-delete;verify-user-should-remove-product-from-cart-successfully;",
  "rows": [
    {
      "cells": [
        "PRODUCT",
        "QUANTITY",
        "SIZE",
        "COLOUR"
      ],
      "line": 17,
      "id": "shopping-cart-delete;verify-user-should-remove-product-from-cart-successfully;;1"
    },
    {
      "cells": [
        "Blouse",
        "2",
        "M",
        "White"
      ],
      "line": 18,
      "id": "shopping-cart-delete;verify-user-should-remove-product-from-cart-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7410681200,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 18,
  "name": "Verify user should remove product from cart successfully",
  "description": "",
  "id": "shopping-cart-delete;verify-user-should-remove-product-from-cart-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I click on \u0027Women\u0027 tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I select product \"Blouse\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select quantity \"2\", size \"M\" and colour \"White\"",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on \u0027Add To Cart\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I can see product has been \u0027Product successfully added to your shopping cart\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on \u0027Proceed To Checkout\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on \u0027Delete\u0027 icon to delete the product from shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Product has been removed from shopping cart successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingCartDelete.iClickOnWomenTab()"
});
formatter.result({
  "duration": 2414356400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 18
    }
  ],
  "location": "ShoppingCartDelete.iSelectProduct(String)"
});
formatter.result({
  "duration": 1679353500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 19
    },
    {
      "val": "M",
      "offset": 29
    },
    {
      "val": "White",
      "offset": 44
    }
  ],
  "location": "ShoppingCartDelete.iSelectQuantitySizeAndColour(String,String,String)"
});
formatter.result({
  "duration": 172579600,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartDelete.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 54725700,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartDelete.iCanSeeProductHasBeenProductSuccessfullyAddedToYourShoppingCart()"
});
formatter.result({
  "duration": 24773800,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartDelete.iClickOnProceedToCheckoutButton()"
});
formatter.result({
  "duration": 1937184700,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartDelete.iClickOnDeleteIconToDeleteTheProductFromShoppingCart()"
});
formatter.result({
  "duration": 43079400,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartDelete.productHasBeenRemovedFromShoppingCartSuccessfully()"
});
formatter.result({
  "duration": 23206500,
  "status": "passed"
});
formatter.after({
  "duration": 69200,
  "status": "passed"
});
});