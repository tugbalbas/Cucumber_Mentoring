Feature: Open Cart Feature

  Scenario: Register and Wishlist

    Given Navigate to Open Cart Website
    And Click to My Account
    And Click to Continue
    And File all spaces
    When Click to Privacy and Continue buttons
    Then Verify Your Account Has Been Created message
    And Click to YOUR STORE
    And Add iPhone to wishlist
    When Click to Wishlist
    Then Verify the Unit Price text