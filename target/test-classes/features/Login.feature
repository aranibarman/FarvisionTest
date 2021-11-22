Feature: Application Login

Scenario: Application Login with valid non admin credentials
Given Open any Browser
And Navigate to Login page
When User enters username as "fintran102" and password as "123" into the fields
And User clicks on Login button
Then Verify user is able to successfully login