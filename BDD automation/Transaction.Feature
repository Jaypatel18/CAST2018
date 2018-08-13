//this goes in cucumber.features class

Feature: Bank Transactions
As a user, I want to search and view my bank transactions.

Scenario: Seach for transaction by ID
Given that my account id is 12345
And my transaction id is 14143
When I search for the transcation by id
Then transactions are as follows
|date      |description                          |debit    |credit     |
|07-29-2018|Bill Payment to Bank of America Visa |$1000.00 |           |


