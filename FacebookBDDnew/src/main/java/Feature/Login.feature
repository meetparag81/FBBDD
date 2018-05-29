Feature:  facebook login
Scenario: FacebookLoginTest
Given user is already on loginpage
When Title of login page is facebook
Then  user enters username and password
Then user clicks on login button
Then user is on home page
Then user close the browser
