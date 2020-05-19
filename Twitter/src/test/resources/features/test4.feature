@sprint1
Feature: Test Twitter smoke scenario


@Post
Scenario: Test posting only text
	Given Open Tweet to post
	When I enter only text on my Tweet
	Then I should be able to Tweet my post

