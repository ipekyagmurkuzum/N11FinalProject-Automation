Feature: Writing campaign URLs to a csv file

  @campaign
  Scenario: Get campaigns URL and write it on a csv file
    Given actor is on the campaigns page on N11
    When actor gets every campaign's url under every category
    And actor writes url data with category name to a csv file
