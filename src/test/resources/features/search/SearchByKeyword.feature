Feature: Search for different items

  Scenario: I want to search by keyword.
    Given: I want to buy iphone.
    When: I search for items containing iphone.
    Then: I should only see items related to iphone.
