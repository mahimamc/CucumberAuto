Feature: Create Account of Facebook
As a user you need to open the facebook homepage and do the validation

Scenario: Validate first name field
Given user needs to be on facebook login page
When User enters user first name
Then User checks user first name is available
Then close the browser


Scenario: Validate Create user multiple field

Given user needs to be on facebook login page
When user clicks the create new user button
When User enters user first name
Then User checks user first name is available
And user enter user surname
But the user mobile field should be blank
Then close the browser