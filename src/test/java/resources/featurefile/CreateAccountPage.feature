Feature: Create Account

  Background: I am on Homepage

#  @Regression
  Scenario: Verify that user should create account successfully
    When  I click on Sign In link
    And   I enter 'Email Address' in email address field to create account
    And   I click on 'Create an account' button
    And   I enter all mandatory personal information 'Title', 'First name', 'Last name', 'Email', 'Password'
    And   I enter all mandatory Address details 'First name', 'Last name', 'Email', 'Password', 'Address', 'City', 'State', 'Postal code', 'country', 'mobile'
    And   I click on 'Register' button
    Then  My account was created successfully


#    And   I enter all mandatory Address details
#    """
#    First name, Last name, Email, Password, Address, City, State, Postal code, country, mobile
#    """



