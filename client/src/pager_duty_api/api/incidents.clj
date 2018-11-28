(ns pager-duty-api.api.incidents
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn incidents-get-with-http-info
  "List incidents
  List existing incidents."
  ([] (incidents-get-with-http-info nil))
  ([{:keys [since until date-range statuses incident-key service-ids team-ids user-ids urgencies time-zone sort-by include ]}]
   (call-api "/incidents" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"since" since "until" until "date_range" date-range "statuses[]" (with-collection-format statuses :multi) "incident_key" incident-key "service_ids[]" (with-collection-format service-ids :multi) "team_ids[]" (with-collection-format team-ids :multi) "user_ids[]" (with-collection-format user-ids :multi) "urgencies[]" (with-collection-format urgencies :multi) "time_zone" time-zone "sort_by" (with-collection-format sort-by :csv) "include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn incidents-get
  "List incidents
  List existing incidents."
  ([] (incidents-get nil))
  ([optional-params]
   (:data (incidents-get-with-http-info optional-params))))

(defn incidents-id-alerts-alert-id-get-with-http-info
  "Get an alert
  Show detailed information about an alert. Accepts an alert id."
  [id alert-id ]
  (check-required-params id alert-id)
  (call-api "/incidents/{id}/alerts/{alert_id}/" :get
            {:path-params   {"id" id "alert_id" alert-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
             :auth-names    ["api_key"]}))

(defn incidents-id-alerts-alert-id-get
  "Get an alert
  Show detailed information about an alert. Accepts an alert id."
  [id alert-id ]
  (:data (incidents-id-alerts-alert-id-get-with-http-info id alert-id)))

(defn incidents-id-alerts-alert-id-put-with-http-info
  "Update an alert
  Resolve an alert or associate an alert with a new parent incident."
  ([id alert-id from ] (incidents-id-alerts-alert-id-put-with-http-info id alert-id from nil))
  ([id alert-id from {:keys [inline-object-12 ]}]
   (check-required-params id alert-id from)
   (call-api "/incidents/{id}/alerts/{alert_id}/" :put
             {:path-params   {"id" id "alert_id" alert-id }
              :header-params {"From" from }
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-12
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2"]
              :auth-names    ["api_key"]})))

(defn incidents-id-alerts-alert-id-put
  "Update an alert
  Resolve an alert or associate an alert with a new parent incident."
  ([id alert-id from ] (incidents-id-alerts-alert-id-put id alert-id from nil))
  ([id alert-id from optional-params]
   (:data (incidents-id-alerts-alert-id-put-with-http-info id alert-id from optional-params))))

(defn incidents-id-alerts-get-with-http-info
  "List alerts for an incident
  List alerts for the specified incident."
  ([id ] (incidents-id-alerts-get-with-http-info id nil))
  ([id {:keys [statuses alert-key sort-by include ]}]
   (check-required-params id)
   (call-api "/incidents/{id}/alerts" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"statuses[]" (with-collection-format statuses :multi) "alert_key" alert-key "sort_by" (with-collection-format sort-by :csv) "include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn incidents-id-alerts-get
  "List alerts for an incident
  List alerts for the specified incident."
  ([id ] (incidents-id-alerts-get id nil))
  ([id optional-params]
   (:data (incidents-id-alerts-get-with-http-info id optional-params))))

(defn incidents-id-alerts-put-with-http-info
  "Manage alerts
  Resolve multiple alerts or associate them with different incidents."
  ([id from ] (incidents-id-alerts-put-with-http-info id from nil))
  ([id from {:keys [inline-object-11 ]}]
   (check-required-params id from)
   (call-api "/incidents/{id}/alerts" :put
             {:path-params   {"id" id }
              :header-params {"From" from }
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-11
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn incidents-id-alerts-put
  "Manage alerts
  Resolve multiple alerts or associate them with different incidents."
  ([id from ] (incidents-id-alerts-put id from nil))
  ([id from optional-params]
   (:data (incidents-id-alerts-put-with-http-info id from optional-params))))

(defn incidents-id-get-with-http-info
  "Get an incident
  Show detailed information about an incident. Accepts either an incident id, or an incident number."
  [id ]
  (check-required-params id)
  (call-api "/incidents/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
             :auth-names    ["api_key"]}))

(defn incidents-id-get
  "Get an incident
  Show detailed information about an incident. Accepts either an incident id, or an incident number."
  [id ]
  (:data (incidents-id-get-with-http-info id)))

(defn incidents-id-log-entries-get-with-http-info
  "List log entries for an incident
  List log entries for the specified incident."
  ([id ] (incidents-id-log-entries-get-with-http-info id nil))
  ([id {:keys [time-zone is-overview include ]}]
   (check-required-params id)
   (call-api "/incidents/{id}/log_entries" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"time_zone" time-zone "is_overview" is-overview "include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn incidents-id-log-entries-get
  "List log entries for an incident
  List log entries for the specified incident."
  ([id ] (incidents-id-log-entries-get id nil))
  ([id optional-params]
   (:data (incidents-id-log-entries-get-with-http-info id optional-params))))

(defn incidents-id-merge-put-with-http-info
  "Merge incidents
  Merge a list of source incidents into this incident."
  ([id from ] (incidents-id-merge-put-with-http-info id from nil))
  ([id from {:keys [inline-object-9 ]}]
   (check-required-params id from)
   (call-api "/incidents/{id}/merge" :put
             {:path-params   {"id" id }
              :header-params {"From" from }
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-9
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn incidents-id-merge-put
  "Merge incidents
  Merge a list of source incidents into this incident."
  ([id from ] (incidents-id-merge-put id from nil))
  ([id from optional-params]
   (:data (incidents-id-merge-put-with-http-info id from optional-params))))

(defn incidents-id-notes-get-with-http-info
  "List notes for an incident
  List existing notes for the specified incident."
  [id ]
  (check-required-params id)
  (call-api "/incidents/{id}/notes" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
             :auth-names    ["api_key"]}))

(defn incidents-id-notes-get
  "List notes for an incident
  List existing notes for the specified incident."
  [id ]
  (:data (incidents-id-notes-get-with-http-info id)))

(defn incidents-id-notes-post-with-http-info
  "Create a note on an incident
  Create a new note for the specified incident."
  ([id from ] (incidents-id-notes-post-with-http-info id from nil))
  ([id from {:keys [inline-object-13 ]}]
   (check-required-params id from)
   (call-api "/incidents/{id}/notes" :post
             {:path-params   {"id" id }
              :header-params {"From" from }
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-13
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn incidents-id-notes-post
  "Create a note on an incident
  Create a new note for the specified incident."
  ([id from ] (incidents-id-notes-post id from nil))
  ([id from optional-params]
   (:data (incidents-id-notes-post-with-http-info id from optional-params))))

(defn incidents-id-put-with-http-info
  "Update an incident
  Acknowledge, resolve, escalate or reassign an incident."
  ([id from ] (incidents-id-put-with-http-info id from nil))
  ([id from {:keys [inline-object-10 ]}]
   (check-required-params id from)
   (call-api "/incidents/{id}" :put
             {:path-params   {"id" id }
              :header-params {"From" from }
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-10
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn incidents-id-put
  "Update an incident
  Acknowledge, resolve, escalate or reassign an incident."
  ([id from ] (incidents-id-put id from nil))
  ([id from optional-params]
   (:data (incidents-id-put-with-http-info id from optional-params))))

(defn incidents-id-responder-requests-post-with-http-info
  "Create a responder request for an incident
  Send a new responder request for the specified incident."
  ([id from ] (incidents-id-responder-requests-post-with-http-info id from nil))
  ([id from {:keys [inline-object-15 ]}]
   (check-required-params id from)
   (call-api "/incidents/{id}/responder_requests" :post
             {:path-params   {"id" id }
              :header-params {"From" from }
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-15
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn incidents-id-responder-requests-post
  "Create a responder request for an incident
  Send a new responder request for the specified incident."
  ([id from ] (incidents-id-responder-requests-post id from nil))
  ([id from optional-params]
   (:data (incidents-id-responder-requests-post-with-http-info id from optional-params))))

(defn incidents-id-snooze-post-with-http-info
  "Snooze an incident
  Snooze an incident."
  ([id from ] (incidents-id-snooze-post-with-http-info id from nil))
  ([id from {:keys [inline-object-16 ]}]
   (check-required-params id from)
   (call-api "/incidents/{id}/snooze" :post
             {:path-params   {"id" id }
              :header-params {"From" from }
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-16
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn incidents-id-snooze-post
  "Snooze an incident
  Snooze an incident."
  ([id from ] (incidents-id-snooze-post id from nil))
  ([id from optional-params]
   (:data (incidents-id-snooze-post-with-http-info id from optional-params))))

(defn incidents-id-status-updates-post-with-http-info
  "Create a status update on an incident
  Create a new status update for the specified incident."
  ([id from ] (incidents-id-status-updates-post-with-http-info id from nil))
  ([id from {:keys [inline-object-14 ]}]
   (check-required-params id from)
   (call-api "/incidents/{id}/status_updates" :post
             {:path-params   {"id" id }
              :header-params {"From" from }
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-14
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn incidents-id-status-updates-post
  "Create a status update on an incident
  Create a new status update for the specified incident."
  ([id from ] (incidents-id-status-updates-post id from nil))
  ([id from optional-params]
   (:data (incidents-id-status-updates-post-with-http-info id from optional-params))))

(defn incidents-post-with-http-info
  "Create an Incident
  Create an incident synchronously without a corresponding event from a monitoring service."
  ([from ] (incidents-post-with-http-info from nil))
  ([from {:keys [inline-object-7 ]}]
   (check-required-params from)
   (call-api "/incidents" :post
             {:path-params   {}
              :header-params {"From" from }
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-7
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn incidents-post
  "Create an Incident
  Create an incident synchronously without a corresponding event from a monitoring service."
  ([from ] (incidents-post from nil))
  ([from optional-params]
   (:data (incidents-post-with-http-info from optional-params))))

(defn incidents-put-with-http-info
  "Manage incidents
  Acknowledge, resolve, escalate or reassign one or more incidents."
  ([from ] (incidents-put-with-http-info from nil))
  ([from {:keys [inline-object-6 ]}]
   (check-required-params from)
   (call-api "/incidents" :put
             {:path-params   {}
              :header-params {"From" from }
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-6
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn incidents-put
  "Manage incidents
  Acknowledge, resolve, escalate or reassign one or more incidents."
  ([from ] (incidents-put from nil))
  ([from optional-params]
   (:data (incidents-put-with-http-info from optional-params))))

