Feature: LeafTab create Lead

Background:
Launch browser
Close Browser

Scenario:
Given Load the url
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

