(ns pager-duty-api.api.api-reference
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn api-reference-get-with-http-info
  "REST API Reference
  REST API Reference."
  []
  (call-api "/api_reference" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["api_key"]}))

(defn api-reference-get
  "REST API Reference
  REST API Reference."
  []
  (:data (api-reference-get-with-http-info)))

