Feature: Search by keyword

  @green
  @RunAll
  Scenario: Searching for 'green'
    Given Sergey is researching things on the internet
    When he looks up "green"
    Then he should see information about "green"

  @red
  @RunAll
  Scenario: Searching for 'red'
    Given Sergey is researching things on the internet
    When he looks up "red"
    Then he should see information about "red"


