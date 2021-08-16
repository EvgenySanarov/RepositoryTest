@searchProduct
Feature: Search product
  Scenario: Running a Full Text Quick Search

    Given I opened Ebay Page
    When I search the product "iPhone"
    Then the term query "iPhone" should be the first in the Search Result grid

  Scenario Outline: Running a Full Text Quick Search
    Given I opened Ebay Page
    When I search the product "<request>"
    Then the term query "<request>" should be the first in the Search Result grid

    Examples:
      | request |
      | Logitech |
      | Sony PlayStation |