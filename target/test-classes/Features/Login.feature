Feature: Application Login
Scenario: Home page default login
Given User is on Net Banking landing page
When User login into application using "JIN" and password "1234"
Then Home page is papulated
And Cards displayed "True"


Scenario: Home page default login
Given User is on Net Banking landing page
When User login into application using "Jhon" and password "456789"
Then Home page is papulated
And Cards displayed "False"