Feature: MusalaSoft QA Automation Task

  @TC1
  Scenario Outline: Test Case 1 || Verify that an inline error message appears when entering invalid email address format
    Given User navigate to musala soft website
    And User scroll down and click on Contact Us Button
    And User Enter valid Name
    And User Enter Valid Subject
    And User Enter Valid Message
    And User Enter Invalid Email "<InvalidEmailFormat>"
    When User Click on Send Button
    Then An Inline error message appears under email address field
    Examples:
    # The values for these invalid email formats is retrieved form a JSON File that holds the invalid email addresses test data
      | InvalidEmailFormat    |
      | NoHostEmail           |
      | OnlyLettersEmail      |
      | OnlyNumbersEmail      |
      | OnlySpecialCharsEmail |
      | InvalidFormatEmail    |

  @TC2
  Scenario: Test Case 2
    Given User navigate to musala soft website
    When User Clicks on the Company tab
    Then User should be redirected to company tab correct URL
    And User should find Leadership section is displayed
    When User click on the facebook link in the page footer
    Then User should be redirected to the company correct facebook URL

  @TC3
  Scenario Outline: Test Case 3
    Given User navigate to musala soft website
    And User Navigate to the Careers menu
    And User Click on (check our open positions) button
    Then Users should be redirected to (Join Us) page with the correct URL
    When User Select "<Location>" from the select location dropdown
    And User choose open position by name "<Position>"
    Then User should find General Description & Requirements & Responsibilities & What we offer Sections Displayed
    And User should find Apply button displayed
    When User Click on Apply button
    And user Enter valid Name
    And User Enter invalid Email Address
    And User click on send button
    Then An Inline error message displayed under email field
    Examples:
      | Location | Position               |
      | Anywhere | AUTOMATION QA ENGINEER |

  @TC4
  Scenario Outline: Test Case 4
    Given User navigate to musala soft website
    And User Navigate to the Careers menu
    And User Click on (check our open positions) button
    Then Users should be redirected to (Join Us) page with the correct URL
    When User Select "<Location>" from the select location dropdown
    And Get the Open positions in "<City>"
    Examples:
      | Location | City   |
      | Sofia    | Sofia  |
      | Skopje   | Skopje |





