(ns pager-duty-api.api.log-entries
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn log-entries-get-with-http-info
  "List log entries
  List all of the incident log entries across the entire account."
  ([] (log-entries-get-with-http-info nil))
  ([{:keys [time-zone since until is-overview include ]}]
   (call-api "/log_entries" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"time_zone" time-zone "since" since "until" until "is_overview" is-overview "include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn log-entries-get
  "List log entries
  List all of the incident log entries across the entire account."
  ([] (log-entries-get nil))
  ([optional-params]
   (:data (log-entries-get-with-http-info optional-params))))

(defn log-entries-id-get-with-http-info
  "Get a log entry
  Get details for a specific incident log entry. This method provides additional information you can use to get at raw event data."
  ([id ] (log-entries-id-get-with-http-info id nil))
  ([id {:keys [time-zone include ]}]
   (check-required-params id)
   (call-api "/log_entries/{id}" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"time_zone" time-zone "include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn log-entries-id-get
  "Get a log entry
  Get details for a specific incident log entry. This method provides additional information you can use to get at raw event data."
  ([id ] (log-entries-id-get id nil))
  ([id optional-params]
   (:data (log-entries-id-get-with-http-info id optional-params))))

