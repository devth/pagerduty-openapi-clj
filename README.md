# pagerduty-openapi-clj

This is a generated PagerDuty API client. It uses [PagerDuty's OpenAPI
specification](https://api-reference.pagerduty.com/output.json) and the
[openapi-generator](https://github.com/OpenAPITools/openapi-generator) tool.

## Coordinates

```clojure
[pager-duty-api "2.0"]
```

## Usage

```clojure
(require '[pager-duty-api.core :refer [with-api-context set-api-context]])

;; set a token. Note the required "Token token=" prefix.
(def my-pagerduty-token "xxxyyyzzz")

(set-api-context
  {:auths {"api_key" (str "Token token=" my-pagerduty-token)}})

;; try calling an API
(require '[pager-duty-api.api.teams :as teams])

;; get all teams
(teams/teams-get)
;; get teams matching a query
(teams/teams-get {:query "frontend"})
```

## Dev

### Prerequisites

```bash
brew install openapi-generator
```

## Explore the `openapi-generator` CLI

```bash
openapi-generator help
openapi-generator help generate
openapi-generator config-help -g clojure
```

### Obtain OpenAPI spec

Obtain a fresh copy of the spec and commit this to the repo to keep it in sync
with generated source:

```bash
curl -o openapi.json https://api-reference.pagerduty.com/output.json
```

### Generate the client

```bash
openapi-generator generate -i openapi.json -c gen-config.json -l clojure -o client
```

### Install client locally

```bash
cd client && lein install; cd ..
```

### Deploy to Clojars

```bash
cd client && lein deploy; cd ..
```
