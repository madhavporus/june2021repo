Feature: Google search

  Scenario Outline: 
    Given User launches a browser
    And navigates to the "https://www.google.com/"
    When user search for "<Search Word>"
    Then User must see the search result page with "<Page Title>"

    Examples: 
      | Search Word | Page Title              |
      | kalam       | X-kalam - Google Search   |
      | Ronaldo     | Ronaldo - Google Search |
