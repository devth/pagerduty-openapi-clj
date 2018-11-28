(ns pager-duty-api.api.abilities
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn abilities-get-with-http-info
  "List abilities
  List all of your account's abilities, by name."
  []
  (call-api "/abilities" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
             :auth-names    ["api_key"]}))

(defn abilities-get
  "List abilities
  List all of your account's abilities, by name."
  []
  (:data (abilities-get-with-http-info)))

(defn abilities-id-get-with-http-info
  "Test an ability
  Test whether your account has a given ability."
  [id ]
  (check-required-params id)
  (call-api "/abilities/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn abilities-id-get
  "Test an ability
  Test whether your account has a given ability."
  [id ]
  (:data (abilities-id-get-with-http-info id)))

