$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ColorChangeFeature.feature");
formatter.feature({
  "line": 2,
  "name": "Color change feature validation",
  "description": "",
  "id": "color-change-feature-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Feature"
    }
  ]
});
formatter.before({
  "duration": 4059892400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the Techfios test page",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps.User_is_on_the_Techfios_test_page()"
});
formatter.result({
  "duration": 2691321300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Sky Blue Background and White Background Setting",
  "description": "",
  "id": "color-change-feature-validation;sky-blue-background-and-white-background-setting",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I click on the set blue background button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click on the set white background button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.I_click_on_the_set_blue_background_button()"
});
formatter.result({
  "duration": 182514300,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 104926400,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.I_click_on_the_set_white_background_button()"
});
formatter.result({
  "duration": 159147600,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 85168200,
  "status": "passed"
});
});