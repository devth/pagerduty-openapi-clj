(ns pager-duty-api.api.priorities
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn priorities-get-with-http-info
  "List priorities
  List existing priorities, in order (most to least severe)."
  []
  (call-api "/priorities" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
             :auth-names    ["api_key"]}))

(defn priorities-get
  "List priorities
  List existing priorities, in order (most to least severe)."
  []
  (:data (priorities-get-with-http-info)))

