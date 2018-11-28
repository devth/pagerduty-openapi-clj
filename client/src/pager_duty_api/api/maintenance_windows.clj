(ns pager-duty-api.api.maintenance-windows
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn maintenance-windows-get-with-http-info
  "List maintenance windows
  List existing maintenance windows, optionally filtered by service and/or team, or whether they are from the past, present or future."
  ([] (maintenance-windows-get-with-http-info nil))
  ([{:keys [team-ids service-ids include filter query ]}]
   (call-api "/maintenance_windows" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"team_ids[]" (with-collection-format team-ids :multi) "service_ids[]" (with-collection-format service-ids :multi) "include[]" (with-collection-format include :multi) "filter" filter "query" query }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn maintenance-windows-get
  "List maintenance windows
  List existing maintenance windows, optionally filtered by service and/or team, or whether they are from the past, present or future."
  ([] (maintenance-windows-get nil))
  ([optional-params]
   (:data (maintenance-windows-get-with-http-info optional-params))))

(defn maintenance-windows-id-delete-with-http-info
  "Delete or end a maintenance window
  Delete an existing maintenance window if it's in the future, or end it if it's currently on-going. If the maintenance window has already ended it cannot be deleted."
  [id ]
  (check-required-params id)
  (call-api "/maintenance_windows/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn maintenance-windows-id-delete
  "Delete or end a maintenance window
  Delete an existing maintenance window if it's in the future, or end it if it's currently on-going. If the maintenance window has already ended it cannot be deleted."
  [id ]
  (:data (maintenance-windows-id-delete-with-http-info id)))

(defn maintenance-windows-id-get-with-http-info
  "Get a maintenance window
  Get an existing maintenance window."
  ([id ] (maintenance-windows-id-get-with-http-info id nil))
  ([id {:keys [include ]}]
   (check-required-params id)
   (call-api "/maintenance_windows/{id}" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn maintenance-windows-id-get
  "Get a maintenance window
  Get an existing maintenance window."
  ([id ] (maintenance-windows-id-get id nil))
  ([id optional-params]
   (:data (maintenance-windows-id-get-with-http-info id optional-params))))

(defn maintenance-windows-id-put-with-http-info
  "Update a maintenance window
  Update an existing maintenance window."
  ([id ] (maintenance-windows-id-put-with-http-info id nil))
  ([id {:keys [inline-object-18 ]}]
   (check-required-params id)
   (call-api "/maintenance_windows/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-18
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn maintenance-windows-id-put
  "Update a maintenance window
  Update an existing maintenance window."
  ([id ] (maintenance-windows-id-put id nil))
  ([id optional-params]
   (:data (maintenance-windows-id-put-with-http-info id optional-params))))

(defn maintenance-windows-post-with-http-info
  "Create a maintenance window
  Create a new maintenance window for the specified services. No new incidents will be created for a service that is in maintenance."
  ([from ] (maintenance-windows-post-with-http-info from nil))
  ([from {:keys [inline-object-17 ]}]
   (check-required-params from)
   (call-api "/maintenance_windows" :post
             {:path-params   {}
              :header-params {"From" from }
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-17
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn maintenance-windows-post
  "Create a maintenance window
  Create a new maintenance window for the specified services. No new incidents will be created for a service that is in maintenance."
  ([from ] (maintenance-windows-post from nil))
  ([from optional-params]
   (:data (maintenance-windows-post-with-http-info from optional-params))))

