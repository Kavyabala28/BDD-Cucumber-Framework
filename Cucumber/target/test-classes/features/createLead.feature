#A Feature File is an entry point to the Cucumber tests. 
#This is a file where you will describe your tests in Descriptive language (Like English)
#Feature, Scenario, Given, When, And and Then are keywords defined by Gherkin

Feature: LeafTab create Lead

Scenario: Create Lead

Given Launch browser
And Load the url
And Enter username
And Enter password
When Click Login
And Click crmsfa
And Click create Lead
Given Enter firstname 
And Enter lastname 
And Enter companyname
And Enter phone no 
When Click submit
Given Close Browser
