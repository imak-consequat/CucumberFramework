Feature: Login functionality of Leaftaps application

Background:
Given Open the Chrome Browser

Scenario Outline: Login with Positive Credentials

Given Load Leaftaps Application with the URL<Url>
Given Enter valid Username as <UserName>
Given Enter valid Password as <Password>
When Clicked on Login button 
Then Home Page Successfully

Examples:
|Url|UserName|Password|
|'http://leaftaps.com/opentaps/control/main'|'demosalesmanager'|'crmsfa'|
|'http://leaftaps.com/opentaps/control/main'|'demoCSR'|'crmsfa'|


Scenario: Login with Negative Credentials

Given Load Leaftaps Application with the URL'http://leaftaps.com/opentaps/control/main'
Given Enter valid Username as 'demo123'
Given Enter valid Password as 'crmsfa'
When Clicked on Login button 
But Error message to be displayed