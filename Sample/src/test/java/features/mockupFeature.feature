Feature: Validating Values

Scenario: Validate values on screen
Given User loads chromedriver
When user opened site https://www.exercise1.com/values
Then right count of values appear on the screen
Then values on the screen are greater than zero
Then total balance is correct based on the values listed on the screen
Then values are formatted as currencies
Then total balance matches the sum of the values