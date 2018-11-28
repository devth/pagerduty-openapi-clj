(ns pager-duty-api.api.on-calls
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn oncalls-get-with-http-info
  "List all of the on-calls
  List the on-call entries during a given time range."
  ([] (oncalls-get-with-http-info nil))
  ([{:keys [time-zone include user-ids escalation-policy-ids schedule-ids since until earliest ]}]
   (call-api "/oncalls" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"time_zone" time-zone "include[]" (with-collection-format include :multi) "user_ids[]" (with-collection-format user-ids :multi) "escalation_policy_ids[]" (with-collection-format escalation-policy-ids :multi) "schedule_ids[]" (with-collection-format schedule-ids :multi) "since" since "until" until "earliest" earliest }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn oncalls-get
  "List all of the on-calls
  List the on-call entries during a given time range."
  ([] (oncalls-get nil))
  ([optional-params]
   (:data (oncalls-get-with-http-info optional-params))))

