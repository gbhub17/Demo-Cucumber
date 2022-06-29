Feature: Redbus home page scenarios

  @Priority0
  Scenario: Check page title
    Given I have landed on redbus page
    Then I check page title is correct
      | Title        |
      | redBus India |

  @Priority1
  Scenario Outline: Search for bus
    Given I have landed on redbus page
    When I enter source as '<Source>'
    And I enter destination as '<Destination>'
    And I enter journey date as'<Journey date>'
    Then I click on search button

    Examples: 
      | Source   | Destination | Journey date |
      | Siliguri | Kolkata     | "29"         |
      | Kolkata  | Siliguri    | "30"         |
