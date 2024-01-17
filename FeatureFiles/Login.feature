Feature: User Login
  
  Scenario: Successful Login
   Given the user is on the nopComerce login Page
   When the user enters valid credentials(username: "test@gmail.com", password:"test@123")
   And the user clicks on login button
   Then the user should be redirected to the my account page
   And the user should see a welcome message
