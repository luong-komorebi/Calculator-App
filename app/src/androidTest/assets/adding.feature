Feature: Use the calculator

	Background:
		Given I see an empty calculator

	Scenario: button is pressed
		When I press the 1 button
		Then I see the number 1 written

	Scenario: adding two numbers
	    When I press the 1 button
	    And I press the + button
	    And I press the 2 button
	    And I press the = button
	    And I see the number 3 written
	    Then I press the clear button