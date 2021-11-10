$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Reg.feature");
formatter.feature({
  "line": 1,
  "name": "Cucumber-Selinieum-TestNG",
  "description": "",
  "id": "cucumber-selinieum-testng",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Registrarion",
  "description": "",
  "id": "cucumber-selinieum-testng;user-registrarion",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Navigate to Browser",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "Contact Information",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Mailing Information",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Information",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Login Information",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Preferences",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefn.navigate_to_browser()"
});
formatter.result({
  "duration": 6204580999,
  "status": "passed"
});
formatter.match({
  "location": "stepdefn.contact_information()"
});
formatter.result({
  "duration": 294508000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefn.mailing_information()"
});
formatter.result({
  "duration": 398420499,
  "status": "passed"
});
formatter.match({
  "location": "stepdefn.user_information()"
});
formatter.result({
  "duration": 1732692900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefn.login_information()"
});
formatter.result({
  "duration": 2911220901,
  "status": "passed"
});
formatter.match({
  "location": "stepdefn.preferences()"
});
formatter.result({
  "duration": 2434040400,
  "status": "passed"
});
});