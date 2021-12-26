Feature: Shopping cart delete

  User should able to delete product from shopping cart

  Background: I am on homepage

  Scenario Outline: Verify user should remove product from cart successfully
    When  I click on 'Women' tab
    And   I select product "<PRODUCT>"
    And   I select quantity "<QUANTITY>", size "<SIZE>" and colour "<COLOUR>"
    And   I click on 'Add To Cart' button
    And   I can see product has been 'Product successfully added to your shopping cart'
    And   I click on 'Proceed To Checkout' button
    And   I click on 'Delete' icon to delete the product from shopping cart
    Then  Product has been removed from shopping cart successfully
    Examples:
      | PRODUCT                                | QUANTITY | SIZE | COLOUR |
      | Blouse                                 | 2        | M    | White   |
#      | Printed Dress                          | 3        | L    | Orange |
#      | Printed Chiffon Dress                  | 4        | S    | Green  |
#      | Printed Summer Dress with Price $28.98 | 2        | M    | Blue   |
#      | Faded Short Sleeve T-shirts            | 2        | M    | Blue   |
