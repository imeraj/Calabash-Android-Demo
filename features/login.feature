Feature: Login

Scenario: Login with username and password
    Given I type Username and Password
    Then I press the "login" button
    Then I wait
    And I take a screenshot
    Then I press "Ok"
