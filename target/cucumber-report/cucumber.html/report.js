$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/OurStore.feature");
formatter.feature({
  "line": 1,
  "name": "Our Stores",
  "description": "\r\nUser should browse our strore page successfully",
  "id": "our-stores",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11887464900,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on Homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "Verify User should able to browse Store Page successfully",
  "description": "",
  "id": "our-stores;verify-user-should-able-to-browse-store-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I click on \u0027Our Stores\u0027 link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I accept Pop Up message",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I scroll Through Map to West Palm Beach",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I take Screenshot of the page",
  "keyword": "And "
});
formatter.match({
  "location": "OurStores.iClickOnOurStoresLink()"
});
formatter.result({
  "duration": 7019493600,
  "status": "passed"
});
formatter.match({
  "location": "OurStores.iAcceptPopUpMessage()"
});
formatter.result({
  "duration": 41418099,
  "status": "passed"
});
formatter.match({
  "location": "OurStores.iScrollThroughMapToWestPalmBeach()"
});
formatter.result({
  "duration": 1955709200,
  "status": "passed"
});
formatter.match({
  "location": "OurStores.iTakeScreenshotOfThePage()"
});
formatter.result({
  "duration": 1350748600,
  "status": "passed"
});
formatter.after({
  "duration": 603765201,
  "status": "passed"
});
});