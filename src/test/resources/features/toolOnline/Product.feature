Feature: Product
  In order to encourage buyers to make a purchase
  As a seller
  I want buyers to be able to see details about a product and add the product to the cart

  Scenario: Display product details from the search list
    Given I have searched for 'iphone'
    When I select item 1
    Then I should see product description and price on the details page


  Scenario: Add to cart from the search result
    Given I have searched for 'iphone'
    When I select 'Add to cart' for item 1
    Then I should see it on my checkout page
