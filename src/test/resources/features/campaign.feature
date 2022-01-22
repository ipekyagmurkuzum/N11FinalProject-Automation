Feature: Writing campaign URLs to a csv file

  @campaign
  Scenario: Get campaigns URLs and write them on a csv file

    Given actor is on the campaigns page on N11
    When actor gets every campaign's urls within every category and writes them to a new cvs file
    And closes the file
    Then file should be read and row number should be checked
