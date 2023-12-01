#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Login Funcationlity

In order to perform successfull login 
As a user 
I have to enter correct email and password

Background: 
Given user navigates to the LC QA website 
	When user validates that LC Web home page lucnched

Scenario: Login to the Lease Crunch QA env As Firm Admin

	
	Then user enters Firm Admin email
	And user click on Next button
	
	Scenario: Login to the Lease Crunch QA env As Firm user

	
	Then user enters Firm user email
	And user click on Next button
