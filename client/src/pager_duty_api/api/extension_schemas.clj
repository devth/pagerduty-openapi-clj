(ns pager-duty-api.api.extension-schemas
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn extension-schemas-get-with-http-info
  "List extension schemas
  List all extension schemas."
  []
  (call-api "/extension_schemas" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
             :auth-names    ["api_key"]}))

(defn extension-schemas-get
  "List extension schemas
  List all extension schemas."
  []
  (:data (extension-schemas-get-with-http-info)))

(defn extension-schemas-id-get-with-http-info
  "Get an extension vendor
  Get details about one specific extension vendor."
  [id ]
  (check-required-params id)
  (call-api "/extension_schemas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
             :auth-names    ["api_key"]}))

(defn extension-schemas-id-get
  "Get an extension vendor
  Get details about one specific extension vendor."
  [id ]
  (:data (extension-schemas-id-get-with-http-info id)))

