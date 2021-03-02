Feature: Get the bigger number

  Scenario Outline: We provide 2 numbers and receieves the bigger one
    Given Two numbers <arg0> and <arg1>
    When run the method
    Then We should receive the number <arg01>
    Examples:
      | arg0 | arg1 | arg01 |
      | 1    | 3    | 3     |
      | 2    | 10    | 10     |

  Scenario: We provide 2 identical inputs and receives one of those
    Given Two numbers are 1 and 1
    When the user run the method
    Then We should receive the number 1 because they are identical

  Scenario: We provide zero numbers so we should get a default value
    Given no input
    When the user run the method again
    Then We should receive the default value zero
