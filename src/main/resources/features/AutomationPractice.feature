Feature: User creates an account

  Scenario: Order T-Shirt (and Verify in Order History)
   When user opens the automationpractice website and clicks the Sign in button

  Scenario: Update Personal Information (First Name) in My Account
  When user opens the automationpractice website and clicks the Sign in button
  Then the Authentication page is displayed
  And user inserts "eliza@test.com" and "Password123" and clicks the Sign in button
  And user clicks the My Personal Information button
  And user clicks the Update button
  And user updates the First Name field to "bob" and clicks Save
  And First name is updated in the My Addresses page


 #  And user clicks the Sign in button
 # And close
