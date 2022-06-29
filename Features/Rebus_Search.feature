Feature: Redbus search page scenarios

  @Priority2
  Scenario: Check page title
    Given I navigate to bus search page
    Then I check page title is correct
      | Title              |
      | Search Bus Tickets |

  @Priority3
  Scenario Outline: Search page number of buses verify
    Given I navigate to bus search page
    Then I verify if number of buses greater than '<Given number>'

    Examples: 
      | Given number |
      |           10 |
      |           20 |
