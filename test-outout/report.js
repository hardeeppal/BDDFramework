$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/hardeepkainth/Desktop/FreeCRMBDDFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM, Login Feature",
  "description": "",
  "id": "free-crm,-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm,-login-feature;free-crm-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of oddoo Website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#    Then user clicks on login button"
    }
  ],
  "line": 8,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "free-crm,-login-feature;free-crm-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "free-crm,-login-feature;free-crm-login-test-scenario;;1"
    },
    {
      "cells": [
        "kainthhardeep276@gmail.com",
        "Automation123"
      ],
      "line": 12,
      "id": "free-crm,-login-feature;free-crm-login-test-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm,-login-feature;free-crm-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of oddoo Website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters \"kainthhardeep276@gmail.com\" and \"Automation123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#    Then user clicks on login button"
    }
  ],
  "line": 8,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});