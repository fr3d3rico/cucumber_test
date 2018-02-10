Feature: Feature to test function
	Scenario: Try 2 kinds of logons
		Given Access home page
			When Try logon on page with "usernameOK" and "passwordOK"
				Then Logon was successful
			When Try logon with wrong user "username" and password "password"
				Then Logon was denied