@sprint1
Feature: Test Twitter smoke scenario

@comment	
Scenario: Test to comment a tweet
	Given Open the post you want to comment
	When I select the comment icon 
	And I tweet my reply on the post
	Then I should be able to Tweet my comment
