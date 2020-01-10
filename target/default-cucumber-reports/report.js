$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Authorized users should not be able to login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@login2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefinition.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"abc\" and \"def\" and clicks Sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "loginStepDefinition.user_enters_and_and_clicks_Sign_in_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.user_should_not_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepDefinition.error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});