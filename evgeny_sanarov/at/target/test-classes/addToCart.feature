@addToCart
Feature: Add to cart

  Scenario: Running a Add To Cart Feature
    Given the term query "iPhone 8" is first in the Search Result grid
    When I add the product "iPhone 8" in the cart
    Then product "iPhone 8" should be in the cart