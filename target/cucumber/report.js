$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NewAccount.feature");
formatter.feature({
  "line": 1,
  "name": "NewAccount",
  "description": "",
  "id": "newaccount",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Create new account",
  "description": "",
  "id": "newaccount;create-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@AccountTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user enters \"\u003cemailId\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on Create an account button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Enter \"\u003cfirstName\u003e\" \"\u003clastName\u003e\" \"\u003cpassWord\u003e\" \"\u003cAddress\u003e\" \"\u003cCityName\u003e\" \"\u003cpostcode\u003e\"\"\u003cMobile\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Select State \"New York\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click on Register",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Verify user logged in and landed on my account page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Click on Signout",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "newaccount;create-new-account;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "passWord",
        "Address",
        "emailId",
        "postcode",
        "Mobile",
        "CityName"
      ],
      "line": 20,
      "id": "newaccount;create-new-account;;1"
    },
    {
      "cells": [
        "Mike",
        "Wills",
        "abcd1234",
        "1 Broadway",
        "mike@gmail.com",
        "58962",
        "07922228058455",
        "New York"
      ],
      "line": 21,
      "id": "newaccount;create-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_on_landing_page()"
});
formatter.result({
  "duration": 12135522200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_on_sign_in_button()"
});
formatter.result({
  "duration": 868387601,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Create new account",
  "description": "",
  "id": "newaccount;create-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@AccountTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user enters \"mike@gmail.com\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on Create an account button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Enter \"Mike\" \"Wills\" \"abcd1234\" \"1 Broadway\" \"New York\" \"58962\"\"07922228058455\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    5,
    6,
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Select State \"New York\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click on Register",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Verify user logged in and landed on my account page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Click on Signout",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "mike@gmail.com",
      "offset": 13
    }
  ],
  "location": "StepDefinitions.user_enters(String)"
});
formatter.result({
  "duration": 702503099,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.click_on_create_an_account_button()"
});
formatter.result({
  "duration": 145270700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mike",
      "offset": 7
    },
    {
      "val": "Wills",
      "offset": 14
    },
    {
      "val": "abcd1234",
      "offset": 22
    },
    {
      "val": "1 Broadway",
      "offset": 33
    },
    {
      "val": "New York",
      "offset": 46
    },
    {
      "val": "58962",
      "offset": 57
    },
    {
      "val": "07922228058455",
      "offset": 64
    }
  ],
  "location": "StepDefinitions.enter(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2211588000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.select_state_something(String)"
});
formatter.result({
  "duration": 148989400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.click_on_register()"
});
formatter.result({
  "duration": 1230708599,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.verify_user_logged_in_and_landed_on_my_account_page()"
});
formatter.result({
  "duration": 63465400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.click_on_signout()"
});
formatter.result({
  "duration": 1466555500,
  "status": "passed"
});
formatter.after({
  "duration": 388285600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_on_landing_page()"
});
formatter.result({
  "duration": 9344762500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_on_sign_in_button()"
});
formatter.result({
  "duration": 1143102500,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Existing customer login",
  "description": "",
  "id": "newaccount;existing-customer-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Enter existing customer email id \"mike1@gmail.com\" and password \"abcd1234\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Click on sign in button in already registered box",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Verify user logged in and landed on my account page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Click on Signout",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "mike1@gmail.com",
      "offset": 34
    },
    {
      "val": "abcd1234",
      "offset": 65
    }
  ],
  "location": "StepDefinitions.enter_existing_customer_email_id_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 914879800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.click_on_sign_in_button_in_already_registered_box()"
});
formatter.result({
  "duration": 1468138200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.verify_user_logged_in_and_landed_on_my_account_page()"
});
formatter.result({
  "duration": 54973799,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.click_on_signout()"
});
formatter.result({
  "duration": 1429891201,
  "status": "passed"
});
formatter.after({
  "duration": 95350800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_on_landing_page()"
});
formatter.result({
  "duration": 8431328299,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_on_sign_in_button()"
});
formatter.result({
  "duration": 875893600,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Find the most expensive dress and add to cart",
  "description": "",
  "id": "newaccount;find-the-most-expensive-dress-and-add-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@ExpensiveDressTest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "user click on dresses menu",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user select listview",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "user select Highest Price from the dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Find most expensive dress and add it to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_click_on_dresses_menu()"
});
formatter.result({
  "duration": 3764840400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_select_listview()"
});
formatter.result({
  "duration": 135496800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_select_highest_price_from_the_dropdown()"
});
formatter.result({
  "duration": 115052000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.find_most_expensive_dress_and_add_it_to_the_cart()"
});
formatter.result({
  "duration": 720413100,
  "status": "passed"
});
formatter.after({
  "duration": 84802501,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_on_landing_page()"
});
formatter.result({
  "duration": 8319860200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_on_sign_in_button()"
});
formatter.result({
  "duration": 897546200,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Logged in customer logout and login again to verify item in cart",
  "description": "",
  "id": "newaccount;logged-in-customer-logout-and-login-again-to-verify-item-in-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@ShoppingCartTest"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "Enter existing customer email id \"mike1@gmail.com\" and password \"abcd1234\"",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Click on sign in button in already registered box",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Verify user logged in and landed on my account page",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "user click on dresses menu",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "user select listview",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "user select Highest Price from the dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "Find most expensive dress and add it to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "Verify the item is still in the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "Click on Signout",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "User click on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "Enter existing customer email id \"mike1@gmail.com\" and password \"abcd1234\"",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "Click on sign in button in already registered box",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "Verify the item is still in the cart",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "mike1@gmail.com",
      "offset": 34
    },
    {
      "val": "abcd1234",
      "offset": 65
    }
  ],
  "location": "StepDefinitions.enter_existing_customer_email_id_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 957510000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.click_on_sign_in_button_in_already_registered_box()"
});
formatter.result({
  "duration": 1153005700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.verify_user_logged_in_and_landed_on_my_account_page()"
});
formatter.result({
  "duration": 62635100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_on_dresses_menu()"
});
formatter.result({
  "duration": 3053597199,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_select_listview()"
});
formatter.result({
  "duration": 146207900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_select_highest_price_from_the_dropdown()"
});
formatter.result({
  "duration": 134162399,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.find_most_expensive_dress_and_add_it_to_the_cart()"
});
formatter.result({
  "duration": 770278300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.verify_the_item_is_still_in_the_cart()"
});
formatter.result({
  "duration": 1181134399,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.click_on_signout()"
});
formatter.result({
  "duration": 1039881801,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_on_sign_in_button()"
});
formatter.result({
  "duration": 1188038000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mike1@gmail.com",
      "offset": 34
    },
    {
      "val": "abcd1234",
      "offset": 65
    }
  ],
  "location": "StepDefinitions.enter_existing_customer_email_id_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 205054600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.click_on_sign_in_button_in_already_registered_box()"
});
formatter.result({
  "duration": 1108016901,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.verify_the_item_is_still_in_the_cart()"
});
formatter.result({
  "duration": 10920117800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[@class\u003d\u0027heading-counter\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.122)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027RIXON7\u0027, ip: \u0027192.168.0.77\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.122, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\rixon\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:62135}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: a9282f174c291e81777d7f8f0ee6ab9d\n*** Element info: {Using\u003dxpath, value\u003d//span[@class\u003d\u0027heading-counter\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pageObjects.CartSummaryPg.getCartSmryHdrTxt(CartSummaryPg.java:21)\r\n\tat stepDefinations.StepDefinitions.verify_the_item_is_still_in_the_cart(StepDefinitions.java:157)\r\n\tat ✽.Then Verify the item is still in the cart(NewAccount.feature:53)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 167866700,
  "status": "passed"
});
});