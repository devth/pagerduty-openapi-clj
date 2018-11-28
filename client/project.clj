(defproject pager-duty-api "2.0"
  :description "The PagerDuty API provides programmatic access to entities within a PagerDuty account. It is designed around [RESTful principles](https://en.wikipedia.org/wiki/Representational_state_transfer) with a path structure based on resources and their relationships.

All requests and responses are serialized in [JSON](https://en.wikipedia.org/wiki/JSON), including error responses.

Schema are designed to be reusable across requests and across endpoints.

More sophisticated API clients should treat PagerDuty resources as unique objects keyed by the `id` field that can be used in any API request involving resources of that type.

Every resource contains a `type` field that identifies the schema it uses.

## Rate limiting

Each account and authentication mechanism is limited to the number of API requests it can make every minute. API requests that exceed the API rate limit will return an [HTTP status code](error_codes.html#http_responses) of 429. Different requests may affect your rate limit differently, so clients should always be prepared to be rate limited and respond appropriately.

## Read-Only API Keys

API requests made with read-only keys attempting to access endpoints with methods other than `GET` will return an [HTTP status code](error_codes.html#http_responses) of 403.

## Error Codes

Most APIs will return an error code from an unsuccessful call. They are described [here](error_codes.html)."
  :url "https://github.com/devth/pagerduty-openapi-clj"
  :license {:name "EPL 1.0"
            :url "https://opensource.org/licenses/EPL-1.0"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [clj-http "3.6.0"]
                 [cheshire "5.5.0"]])
