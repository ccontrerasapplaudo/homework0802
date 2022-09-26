@validateFormData
Feature: Test to validate form data comparing the input data with the data on the pop up window
  Scenario: Test to validate form data comparing the input data with the data on the pop up window
    Given the input data obtained from the form
    And the input data obtained from the pop up window
    Then both information is verify if correct
    And pop up window and browser are closed