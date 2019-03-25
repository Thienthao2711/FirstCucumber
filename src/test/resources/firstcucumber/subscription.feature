Feature: As a user I want to subscribe with my Email sothat I can get the news which provided by system

Scenario: Subscribe with existed Email then see the popup message
Given The user open the page with subscription function
When the user provide the email already subscribed before such as "khanh.tx@live.com"
Then The user should see the notification "E-mail khanh.tx@live.com đã được sử dụng, bạn hãy chọn một E-mail khác"