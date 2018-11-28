(ns pager-duty-api.api.services
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn services-get-with-http-info
  "List services
  List existing services."
  ([] (services-get-with-http-info nil))
  ([{:keys [team-ids time-zone sort-by query include ]}]
   (call-api "/services" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"team_ids[]" (with-collection-format team-ids :multi) "time_zone" time-zone "sort_by" sort-by "query" query "include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn services-get
  "List services
  List existing services."
  ([] (services-get nil))
  ([optional-params]
   (:data (services-get-with-http-info optional-params))))

(defn services-id-delete-with-http-info
  "Delete a service
  Delete an existing service. Once the service is deleted, it will not be accessible from the web UI and new incidents won't be able to be created for this service."
  [id ]
  (check-required-params id)
  (call-api "/services/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn services-id-delete
  "Delete a service
  Delete an existing service. Once the service is deleted, it will not be accessible from the web UI and new incidents won't be able to be created for this service."
  [id ]
  (:data (services-id-delete-with-http-info id)))

(defn services-id-get-with-http-info
  "Get a service
  Get details about an existing service."
  ([id ] (services-id-get-with-http-info id nil))
  ([id {:keys [include ]}]
   (check-required-params id)
   (call-api "/services/{id}" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn services-id-get
  "Get a service
  Get details about an existing service."
  ([id ] (services-id-get id nil))
  ([id optional-params]
   (:data (services-id-get-with-http-info id optional-params))))

(defn services-id-integrations-integration-id-get-with-http-info
  "View an integration
  Get details about an integration belonging to a service."
  ([id integration-id ] (services-id-integrations-integration-id-get-with-http-info id integration-id nil))
  ([id integration-id {:keys [include ]}]
   (check-required-params id integration-id)
   (call-api "/services/{id}/integrations/{integration_id}" :get
             {:path-params   {"id" id "integration_id" integration-id }
              :header-params {}
              :query-params  {"include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn services-id-integrations-integration-id-get
  "View an integration
  Get details about an integration belonging to a service."
  ([id integration-id ] (services-id-integrations-integration-id-get id integration-id nil))
  ([id integration-id optional-params]
   (:data (services-id-integrations-integration-id-get-with-http-info id integration-id optional-params))))

(defn services-id-integrations-integration-id-put-with-http-info
  "Update an existing integration
  Update an integration belonging to a service."
  ([id integration-id ] (services-id-integrations-integration-id-put-with-http-info id integration-id nil))
  ([id integration-id {:keys [inline-object-26 ]}]
   (check-required-params id integration-id)
   (call-api "/services/{id}/integrations/{integration_id}" :put
             {:path-params   {"id" id "integration_id" integration-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-26
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn services-id-integrations-integration-id-put
  "Update an existing integration
  Update an integration belonging to a service."
  ([id integration-id ] (services-id-integrations-integration-id-put id integration-id nil))
  ([id integration-id optional-params]
   (:data (services-id-integrations-integration-id-put-with-http-info id integration-id optional-params))))

(defn services-id-integrations-post-with-http-info
  "Create a new integration
  Create a new integration belonging to a service."
  ([id ] (services-id-integrations-post-with-http-info id nil))
  ([id {:keys [inline-object-25 ]}]
   (check-required-params id)
   (call-api "/services/{id}/integrations" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-25
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn services-id-integrations-post
  "Create a new integration
  Create a new integration belonging to a service."
  ([id ] (services-id-integrations-post id nil))
  ([id optional-params]
   (:data (services-id-integrations-post-with-http-info id optional-params))))

(defn services-id-put-with-http-info
  "Update a service
  Update an existing service."
  ([id ] (services-id-put-with-http-info id nil))
  ([id {:keys [inline-object-24 ]}]
   (check-required-params id)
   (call-api "/services/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-24
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn services-id-put
  "Update a service
  Update an existing service."
  ([id ] (services-id-put id nil))
  ([id optional-params]
   (:data (services-id-put-with-http-info id optional-params))))

(defn services-post-with-http-info
  "Create a service
  Create a new service."
  ([] (services-post-with-http-info nil))
  ([{:keys [inline-object-23 ]}]
   (call-api "/services" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-23
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn services-post
  "Create a service
  Create a new service."
  ([] (services-post nil))
  ([optional-params]
   (:data (services-post-with-http-info optional-params))))

