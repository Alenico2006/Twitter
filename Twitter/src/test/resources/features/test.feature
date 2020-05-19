#@sprint1
#Feature: Test Twitter smoke scenario
#
#Background: Login success with a register user
#    #Given Open the browser and start application
#    Given an username "andrea200606@gmail.com" and password "Volley123*"
#    Then user should be able to login successfully
#
#@Post
#Scenario: Test posting only text
#	Given Open Tweet to post
#	When I enter only text on my Tweet
#	Then I should be able to Tweet my post
#
#@charlimitpost
#Scenario: Test posting text with characters limit
#	Given Open Tweet to post
#	When I enter text on my Tweet with characters limit
#	Then I should not be able to Tweet my post
#
#@comment	
#Scenario: Test to comment a tweet
#	Given Open the post you want to comment
#	When I select the comment icon 
#	And I tweet my reply on the post
#	Then I should be able to Tweet my comment
