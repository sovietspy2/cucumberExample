Feature: Get capitalized string

  Scenario: We provide a lowercase text and receives an uppercase version
    Given the text is "text"
    When the user run the method
    Then The method return "TEXT"

  Scenario: We provide a null value and the problem is handled
    Given takes null input
    When the user run the method again
    Then We should receive the default value which is empty string
