Feature: Checkboxes functionality
As a User
I want to select differents options from de checkbox
So I can show my decision

  Scenario: Verify default checkbox states
    Given the user is on the checkboxes page
    Then the first checkbox should be unchecked
    And the second checkbox should be checked

  Scenario: Select the first checkbox
    Given the user is on the checkboxes page
    When the user selects the first checkbox
    Then the first checkbox should be checked

  Scenario: Unselect the second checkbox
    Given the user is on the checkboxes page
    When the user unselects the second checkbox
    Then the second checkbox should be unchecked