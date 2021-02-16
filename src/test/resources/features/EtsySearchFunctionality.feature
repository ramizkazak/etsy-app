Feature:  As a User,
  I should able to search item from search box
  without and with parameterization

  Scenario: Etsy Search Functionality
    Given I am on home page
    And I should able to use searchbar
    And I should able to click search button
    Then search result should displayed
@wip
  Scenario: Etsy Search Functionality
    Given I am on home page
    And I enter "Wooden Spoon" in searchbar
    And I should able to click search button
    Then search result should "Wooden spoon | Etsy" displayed

