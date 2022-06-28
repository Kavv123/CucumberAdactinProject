$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User Login In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;1"
    },
    {
      "cells": [
        "ABC",
        "987"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;2"
    },
    {
      "cells": [
        "XYZ",
        "567"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;3"
    },
    {
      "cells": [
        "Kavitha12",
        "HV6G96"
      ],
      "line": 15,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "User Login In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"ABC\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"987\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 9004435000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ABC",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 147375800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "987",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 95174300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 2563938700,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User Login In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"XYZ\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"567\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 599550300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "XYZ",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 80718700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "567",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 80578100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 789307800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User Login In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Kavitha12\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"HV6G96\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 647395500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kavitha12",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 85144700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HV6G96",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 92996300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1619844200,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User Search Hotel In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-search-hotel-in-the-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user Select The Required Location In Location Option",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user Select The Required Hotels In Hotels Option",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Required Room Type In Room Type Option",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Required Number Of Rooms In Number Of Rooms Option",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Clear The Default Date And Enter The Valid Check In Date In Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Clear The Default Date And Enter The Valid Check Out Date In Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select The Required Adults Per Room In Adults Per Room Option",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Select The Required Children Per Room In Children Per Room Option",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Click The Search Button And It Navigate To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Required_Location_In_Location_Option()"
});
formatter.result({
  "duration": 170798400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Required_Hotels_In_Hotels_Option()"
});
formatter.result({
  "duration": 171890100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Required_Room_Type_In_Room_Type_Option()"
});
formatter.result({
  "duration": 168289200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Required_Number_Of_Rooms_In_Number_Of_Rooms_Option()"
});
formatter.result({
  "duration": 179760000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clear_The_Default_Date_And_Enter_The_Valid_Check_In_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "duration": 162954700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clear_The_Default_Date_And_Enter_The_Valid_Check_Out_Date_In_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 179942600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Required_Adults_Per_Room_In_Adults_Per_Room_Option()"
});
formatter.result({
  "duration": 153726100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Required_Children_Per_Room_In_Children_Per_Room_Option()"
});
formatter.result({
  "duration": 135357200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Search_Button_And_It_Navigate_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1327152400,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "User Select Hotel In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-hotel-in-the-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "user Select The Particular Hotel By Clicking The Required Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user Click The Continue Button And It Navigate To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Particular_Hotel_By_Clicking_The_Required_Radio_Button()"
});
formatter.result({
  "duration": 76347100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Continue_Button_And_It_Navigate_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 1280754400,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "User Book A Hotel In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-book-a-hotel-in-the-web-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "user Enter The First Name In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Last Name In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter The Billing Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter The Credit Card Number In Credit Card Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Select The Valid Credit Card Type In Credit Card Type Option",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Select The Valid Expiry Date In Select Month Option",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Select The Valid Expiry Date In Select Year Option",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Enter The Correct CVV Number In CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Clicks The Book Now Button And It Navigate To The Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 169973100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 80837900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Billing_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 233307500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_Number_In_Credit_Card_Number_Field()"
});
formatter.result({
  "duration": 100944400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Valid_Credit_Card_Type_In_Credit_Card_Type_Option()"
});
formatter.result({
  "duration": 131362500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Valid_Expiry_Date_In_Select_Month_Option()"
});
formatter.result({
  "duration": 132851700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Valid_Expiry_Date_In_Select_Year_Option()"
});
formatter.result({
  "duration": 199009500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Correct_CVV_Number_In_CVV_Number_Field()"
});
formatter.result({
  "duration": 76163900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_The_Book_Now_Button_And_It_Navigate_To_The_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 62742000,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "User Log Out In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-log-out-in-the-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@regresstionTest"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "user Click The Log Out Button And It Navigate To Another Page And It Display Message As \"You have Successfully logged Out.\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "You have Successfully logged Out.",
      "offset": 89
    }
  ],
  "location": "Step_Definition.user_Click_The_Log_Out_Button_And_It_Navigate_To_Another_Page_And_It_Display_Message_As(String)"
});
formatter.result({
  "duration": 951996800,
  "status": "passed"
});
});