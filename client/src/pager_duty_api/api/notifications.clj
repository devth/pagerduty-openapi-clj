(ns pager-duty-api.api.notifications
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn notifications-get-with-http-info
  "List notifications
  List notifications for a given time range, optionally filtered by type (sms_notification, email_notification, phone_notification, or push_notification)."
  ([since until ] (notifications-get-with-http-info since until nil))
  ([since until {:keys [time-zone filter include ]}]
   (check-required-params since until)
   (call-api "/notifications" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"time_zone" time-zone "since" since "until" until "filter" filter "include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn notifications-get
  "List notifications
  List notifications for a given time range, optionally filtered by type (sms_notification, email_notification, phone_notification, or push_notification)."
  ([since until ] (notifications-get since until nil))
  ([since until optional-params]
   (:data (notifications-get-with-http-info since until optional-params))))

