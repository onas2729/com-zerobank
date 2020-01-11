$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountSummary.feature");
formatter.feature({
  "name": "Account Summary",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@account_summary"
    }
  ]
});
formatter.scenario({
  "name": "Account summary page should have Cash Accounts, Investment  Accounts, Credit Accounts, Loan Accounts.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@account_summary"
    },
    {
      "name": "@account_types"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountSummaryStepDefinition.the_user_is_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should see following account types",
  "rows": [
    {
      "cells": [
        "Cash Accounts"
      ]
    },
    {
      "cells": [
        "Investment  Accounts"
      ]
    },
    {
      "cells": [
        "Credit Accounts"
      ]
    },
    {
      "cells": [
        "Loan Accounts"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});