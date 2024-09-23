Feature: LeafTab edit Lead

Background:
Launch the browser
Close the Browser

Scenario Outline: Editing Lead

Given Load the Url
And Enter Username 'demosalesmanager'
And Enter Password 'crmsfa'
When Click login
And Click crmsfa link
And Click Leads tab
And Click Find Leads
And Click Phone Tab
Given Enter phoneNumber <phoneNum>
When Click Find Leads button
And Click Lead Id
And Click Edit button
Given Enter CompanyName <cname>
When Click Update button

Examples:  #used to pass multiple values into same method
|phoneNum|cname|
|98|Delloite|
|99|CloudLand|
|9|CitiBank|