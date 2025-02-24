@happy
Feature: Get Boards
  As a Trello API user
  I want to access all my boards
  So that I want to call a single endpoint that will return all my boards

  Background: a request with authorization and fields query params
    Given a request with authorization
    And the request has query params:
      | fields | id,name |

  Scenario: Check Get Boards
    Given the request has path params:
      | name   | value          |
      | member | mohamedabdulal |
    When the 'GET' request is sent to 'GET_ALL_BOARDS' endpoint
    Then the response status code is 200
    And the response matches 'get_boards.json' schema

  Scenario: Check Get Board
    Given the request has path params:
      | name | value                    |
      | id   | 670bfaf62656fd3e8f5e7549 |
    When the 'GET' request is sent to 'GET_A_BOARD' endpoint
    Then the response status code is 200
    And body value has the following values by paths:
      | path | expected_value  |
      | name | My Trello board |
    And the response matches 'get_board.json' schema