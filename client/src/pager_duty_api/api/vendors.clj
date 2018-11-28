(ns pager-duty-api.api.vendors
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn vendors-get-with-http-info
  "List vendors
  List all vendors."
  []
  (call-api "/vendors" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
             :auth-names    ["api_key"]}))

(defn vendors-get
  "List vendors
  List all vendors."
  []
  (:data (vendors-get-with-http-info)))

(defn vendors-id-get-with-http-info
  "Get a vendor
  Get details about one specific vendor."
  [id ]
  (check-required-params id)
  (call-api "/vendors/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
             :auth-names    ["api_key"]}))

(defn vendors-id-get
  "Get a vendor
  Get details about one specific vendor."
  [id ]
  (:data (vendors-id-get-with-http-info id)))

