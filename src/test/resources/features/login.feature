Feature: Login
  
  
  @smoke
  Scenario: Login
    Given I open browser and navigate to Attlasian web page.
    When  I enter  valid email and password
    And click the login button
    Then I successfully login.
    
	
  
