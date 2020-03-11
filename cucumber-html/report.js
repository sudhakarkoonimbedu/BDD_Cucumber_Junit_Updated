$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/TaggedHooks.feature");
formatter.feature({
  "line": 1,
  "name": "Tagged Hooks",
  "description": "",
  "id": "tagged-hooks",
  "keyword": "Feature"
});
formatter.before({
  "duration": 270958,
  "status": "passed"
});
formatter.before({
  "duration": 108022,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "tagged-hooks;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@first"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "This is first step",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "This is second step",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "This is third step",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggedHooksDefinition.first_step()"
});
formatter.result({
  "duration": 304937902,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksDefinition.second_step()"
});
formatter.result({
  "duration": 101987,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksDefinition.third_step()"
});
formatter.result({
  "duration": 103495,
  "status": "passed"
});
formatter.after({
  "duration": 111944,
  "status": "passed"
});
formatter.after({
  "duration": 107116,
  "status": "passed"
});
});