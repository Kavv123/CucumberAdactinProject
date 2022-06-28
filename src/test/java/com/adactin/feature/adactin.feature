Feature: Hotel Booking In Adactin Application

@smokeTest
Scenario Outline: User Login In The Web Application
Given user Launch The Application
When user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Password Field
Then user Click The Login Button And It Navigate To Search Hotel Page

Examples:

|Username|Password|
|ABC|987|
|XYZ|567|
|Kavitha12|HV6G96|

@sanityTest
Scenario: User Search Hotel In The Web Application
When user Select The Required Location In Location Option
And user Select The Required Hotels In Hotels Option
And user Select The Required Room Type In Room Type Option
And user Select The Required Number Of Rooms In Number Of Rooms Option
And user Clear The Default Date And Enter The Valid Check In Date In Check In Date Field
And user Clear The Default Date And Enter The Valid Check Out Date In Check Out Date Field
And user Select The Required Adults Per Room In Adults Per Room Option
And user Select The Required Children Per Room In Children Per Room Option
Then user Click The Search Button And It Navigate To The Select Hotel Page

@sanityTest
Scenario: User Select Hotel In The Web Application
When user Select The Particular Hotel By Clicking The Required Radio Button
Then user Click The Continue Button And It Navigate To Book A Hotel Page

Scenario: User Book A Hotel In The Web Application
When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Billing Address In Billing Address Field
And user Enter The Credit Card Number In Credit Card Number Field
And user Select The Valid Credit Card Type In Credit Card Type Option
And user Select The Valid Expiry Date In Select Month Option 
And user Select The Valid Expiry Date In Select Year Option
And user Enter The Correct CVV Number In CVV Number Field
Then user Clicks The Book Now Button And It Navigate To The Booking Confirmation Page

@regresstionTest
Scenario: User Log Out In The Web Application
Then user Click The Log Out Button And It Navigate To Another Page And It Display Message As "You have Successfully logged Out."