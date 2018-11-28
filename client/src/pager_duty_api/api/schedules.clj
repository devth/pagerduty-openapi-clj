(ns pager-duty-api.api.schedules
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn schedules-get-with-http-info
  "List schedules
  List the on-call schedules."
  ([] (schedules-get-with-http-info nil))
  ([{:keys [query ]}]
   (call-api "/schedules" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"query" query }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn schedules-get
  "List schedules
  List the on-call schedules."
  ([] (schedules-get nil))
  ([optional-params]
   (:data (schedules-get-with-http-info optional-params))))

(defn schedules-id-delete-with-http-info
  "Delete a schedule
  Delete an on-call schedule."
  [id ]
  (check-required-params id)
  (call-api "/schedules/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn schedules-id-delete
  "Delete a schedule
  Delete an on-call schedule."
  [id ]
  (:data (schedules-id-delete-with-http-info id)))

(defn schedules-id-get-with-http-info
  "Get a schedule
  Show detailed information about a schedule, including entries for each layer and sub-schedule."
  ([id ] (schedules-id-get-with-http-info id nil))
  ([id {:keys [time-zone since until ]}]
   (check-required-params id)
   (call-api "/schedules/{id}" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"time_zone" time-zone "since" since "until" until }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn schedules-id-get
  "Get a schedule
  Show detailed information about a schedule, including entries for each layer and sub-schedule."
  ([id ] (schedules-id-get id nil))
  ([id optional-params]
   (:data (schedules-id-get-with-http-info id optional-params))))

(defn schedules-id-overrides-get-with-http-info
  "List overrides
  List overrides for a given time range."
  ([id since until ] (schedules-id-overrides-get-with-http-info id since until nil))
  ([id since until {:keys [editable overflow ]}]
   (check-required-params id since until)
   (call-api "/schedules/{id}/overrides" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"since" since "until" until "editable" editable "overflow" overflow }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn schedules-id-overrides-get
  "List overrides
  List overrides for a given time range."
  ([id since until ] (schedules-id-overrides-get id since until nil))
  ([id since until optional-params]
   (:data (schedules-id-overrides-get-with-http-info id since until optional-params))))

(defn schedules-id-overrides-override-id-delete-with-http-info
  "Delete an override
  Remove an override. You cannot remove a past override. If the override start time is before the current time, but the end time is after the current time, the override will be truncated to the current time. If the override is truncated, the status code will be 200 OK, as opposed to a 204 No Content for a successful delete."
  [id override-id ]
  (check-required-params id override-id)
  (call-api "/schedules/{id}/overrides/{override_id}" :delete
            {:path-params   {"id" id "override_id" override-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn schedules-id-overrides-override-id-delete
  "Delete an override
  Remove an override. You cannot remove a past override. If the override start time is before the current time, but the end time is after the current time, the override will be truncated to the current time. If the override is truncated, the status code will be 200 OK, as opposed to a 204 No Content for a successful delete."
  [id override-id ]
  (:data (schedules-id-overrides-override-id-delete-with-http-info id override-id)))

(defn schedules-id-overrides-post-with-http-info
  "Create an override
  Create an override for a specific user covering the specified time range. If you create an override on top of an existing one, the last created override will have priority."
  ([id ] (schedules-id-overrides-post-with-http-info id nil))
  ([id {:keys [inline-object-22 ]}]
   (check-required-params id)
   (call-api "/schedules/{id}/overrides" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-22
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn schedules-id-overrides-post
  "Create an override
  Create an override for a specific user covering the specified time range. If you create an override on top of an existing one, the last created override will have priority."
  ([id ] (schedules-id-overrides-post id nil))
  ([id optional-params]
   (:data (schedules-id-overrides-post-with-http-info id optional-params))))

(defn schedules-id-put-with-http-info
  "Update a schedule
  Update an existing on-call schedule."
  ([id ] (schedules-id-put-with-http-info id nil))
  ([id {:keys [overflow inline-object-21 ]}]
   (check-required-params id)
   (call-api "/schedules/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"overflow" overflow }
              :form-params   {}
              :body-param    inline-object-21
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn schedules-id-put
  "Update a schedule
  Update an existing on-call schedule."
  ([id ] (schedules-id-put id nil))
  ([id optional-params]
   (:data (schedules-id-put-with-http-info id optional-params))))

(defn schedules-id-users-get-with-http-info
  "List users on call
  List all of the users on call in a given schedule for a given time range."
  ([id ] (schedules-id-users-get-with-http-info id nil))
  ([id {:keys [since until ]}]
   (check-required-params id)
   (call-api "/schedules/{id}/users" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"since" since "until" until }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn schedules-id-users-get
  "List users on call
  List all of the users on call in a given schedule for a given time range."
  ([id ] (schedules-id-users-get id nil))
  ([id optional-params]
   (:data (schedules-id-users-get-with-http-info id optional-params))))

(defn schedules-post-with-http-info
  "Create a schedule
  Create a new on-call schedule."
  ([] (schedules-post-with-http-info nil))
  ([{:keys [overflow inline-object-19 ]}]
   (call-api "/schedules" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"overflow" overflow }
              :form-params   {}
              :body-param    inline-object-19
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn schedules-post
  "Create a schedule
  Create a new on-call schedule."
  ([] (schedules-post nil))
  ([optional-params]
   (:data (schedules-post-with-http-info optional-params))))

(defn schedules-preview-post-with-http-info
  "Preview a schedule
  Preview what an on-call schedule would look like without saving it."
  ([] (schedules-preview-post-with-http-info nil))
  ([{:keys [since until overflow inline-object-20 ]}]
   (call-api "/schedules/preview" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"since" since "until" until "overflow" overflow }
              :form-params   {}
              :body-param    inline-object-20
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn schedules-preview-post
  "Preview a schedule
  Preview what an on-call schedule would look like without saving it."
  ([] (schedules-preview-post nil))
  ([optional-params]
   (:data (schedules-preview-post-with-http-info optional-params))))

