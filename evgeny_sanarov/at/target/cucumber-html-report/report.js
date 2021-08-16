$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("searchProduct.feature");
formatter.feature({
  "line": 2,
  "name": "Search product",
  "description": "",
  "id": "search-product",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@searchProduct"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Running a Full Text Quick Search",
  "description": "",
  "id": "search-product;running-a-full-text-quick-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I opened Ebay Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search the product \"iPhone\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the term query \"iPhone\" should be the first in the Search Result grid",
  "keyword": "Then "
});
formatter.match({
  "location": "EbayStepDefs.iOpenedEbayPage1()"
});
formatter.result({
  "duration": 8784676200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iPhone",
      "offset": 22
    }
  ],
  "location": "EbayStepDefs.iSearchTheProduct1(String)"
});
formatter.result({
  "duration": 3546669799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iPhone",
      "offset": 16
    }
  ],
  "location": "EbayStepDefs.theTermQueryShouldBeTheFirstInheSearchResultGrid1(String)"
});
formatter.result({
  "duration": 654458500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Running a Full Text Quick Search",
  "description": "",
  "id": "search-product;running-a-full-text-quick-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I opened Ebay Page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I search the product \"\u003crequest\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the term query \"\u003crequest\u003e\" should be the first in the Search Result grid",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "search-product;running-a-full-text-quick-search;",
  "rows": [
    {
      "cells": [
        "request"
      ],
      "line": 15,
      "id": "search-product;running-a-full-text-quick-search;;1"
    },
    {
      "cells": [
        "Logitech"
      ],
      "line": 16,
      "id": "search-product;running-a-full-text-quick-search;;2"
    },
    {
      "cells": [
        "Sony PlayStation"
      ],
      "line": 17,
      "id": "search-product;running-a-full-text-quick-search;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Running a Full Text Quick Search",
  "description": "",
  "id": "search-product;running-a-full-text-quick-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@searchProduct"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I opened Ebay Page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I search the product \"Logitech\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the term query \"Logitech\" should be the first in the Search Result grid",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "EbayStepDefs.iOpenedEbayPage1()"
});
formatter.result({
  "duration": 1195298100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logitech",
      "offset": 22
    }
  ],
  "location": "EbayStepDefs.iSearchTheProduct1(String)"
});
formatter.result({
  "duration": 2702272900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logitech",
      "offset": 16
    }
  ],
  "location": "EbayStepDefs.theTermQueryShouldBeTheFirstInheSearchResultGrid1(String)"
});
formatter.result({
  "duration": 566091500,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Running a Full Text Quick Search",
  "description": "",
  "id": "search-product;running-a-full-text-quick-search;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@searchProduct"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I opened Ebay Page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I search the product \"Sony PlayStation\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the term query \"Sony PlayStation\" should be the first in the Search Result grid",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "EbayStepDefs.iOpenedEbayPage1()"
});
formatter.result({
  "duration": 1321459899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sony PlayStation",
      "offset": 22
    }
  ],
  "location": "EbayStepDefs.iSearchTheProduct1(String)"
});
formatter.result({
  "duration": 2813182200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sony PlayStation",
      "offset": 16
    }
  ],
  "location": "EbayStepDefs.theTermQueryShouldBeTheFirstInheSearchResultGrid1(String)"
});
formatter.result({
  "duration": 517084600,
  "status": "passed"
});
});