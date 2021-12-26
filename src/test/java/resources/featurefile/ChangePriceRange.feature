Feature: Change Price

  User should be able to change price when moving slider

  Background: I am on homepage

    Scenario: Verify user should be able to change price when dragging slider
      When  I mouse hover on 'Women' tab
      And   I click on 'Summer Dresses'
      And   I move price range slider
      Then  I can see products from expected price range