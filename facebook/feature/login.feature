#Author : KalaiselviSwaminathan

@SmokeScenario
Feature: Feature to test Login Functionality
@SmokeTest
 
    Scenario :Check login is successful with valid Credentials
    
     Given launch Facebook Application Url
    When enter Valid User Name
    And enter Valid Password 
    Then user Click Login Button And Navigate to Home Page
    
    
    
    
    
    