Feature: LeafTab create Lead

Background:
Launch browser
Close Browser

Scenario Outline: Creating Lead with different values

Given Load the url
And Enter username 'demosalesmanager'
And Enter password 'crmsfa'
When Click Login
And Click crmsfa
And Click create Lead
Given Enter firstname <fname>
And Enter lastname <lname>
And Enter companyname <cname>
And Enter phone no <phoneNum>
When Click submit

Examples: #used to pass multiple values into same method
|fname|lname|cname|phoneNum|
|Rio|Raj|Infosys|9876543210|
|Dawshon|Rose|Flipkart|9876678773|
|Jack|Smith|EY|1235689903|
