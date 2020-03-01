$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NewAccount.feature");
formatter.feature({
  "line": 1,
  "name": "NewAccount",
  "description": "",
  "id": "newaccount",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 28,
  "name": "Find the most expensive dress and add to cart",
  "description": "",
  "id": "newaccount;find-the-most-expensive-dress-and-add-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@ExpensiveDressTest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "Find most expensive dress and add it to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_on_landing_page()"
});
formatter.result({
  "duration": 13346142300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.find_most_expensive_dress_and_add_it_to_the_cart()"
});
formatter.result({
  "duration": 2948468700,
  "status": "passed"
});
});