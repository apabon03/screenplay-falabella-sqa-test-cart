Feature: Add product to cart

  Scenario: Add product to cart success
    Given the user open page Falabella and search any product
    When the system select one random product and user add three to cart
    Then the user can read the quantity of products and the title he chose