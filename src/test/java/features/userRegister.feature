Feature: Validate User Registration
  Scenario: Verify user registration successfully
    Given a valid auth register payload
    When I execute POST request to /register endpoint
    Then the response status should be 200 OK
    And the response payload should contain JSON
    And the response body should have the id field