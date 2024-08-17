Feature: Test for Google application

  Scenario: Test for google title
    Given open the google application
    When capture current title
    Then title should match
