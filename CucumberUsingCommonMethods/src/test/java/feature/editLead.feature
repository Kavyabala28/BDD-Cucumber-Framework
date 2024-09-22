Feature: LeafTab edit Lead

Background:
Launch the browser
Close the Browser

@Demo
Scenario:
Given Load the Url
And Enter Username 'demosalesmanager'
And Enter Password 'crmsfa'
When Click login
And Click crmsfa link
And Click Leads tab
And Click Find Leads
And Click Phone Tab
Given Enter phoneNumber '98'
When Click Find Leads button
And Click Lead Id
And Click Edit button
Given Enter CompanyName 'Amazon'
When Click Update button

