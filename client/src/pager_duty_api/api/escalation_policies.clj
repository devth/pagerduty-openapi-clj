(ns pager-duty-api.api.escalation-policies
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn escalation-policies-get-with-http-info
  "List escalation policies
  List all of the existing escalation policies."
  ([] (escalation-policies-get-with-http-info nil))
  ([{:keys [query user-ids team-ids include sort-by ]}]
   (call-api "/escalation_policies" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"query" query "user_ids[]" (with-collection-format user-ids :multi) "team_ids[]" (with-collection-format team-ids :multi) "include[]" (with-collection-format include :multi) "sort_by" sort-by }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn escalation-policies-get
  "List escalation policies
  List all of the existing escalation policies."
  ([] (escalation-policies-get nil))
  ([optional-params]
   (:data (escalation-policies-get-with-http-info optional-params))))

(defn escalation-policies-id-delete-with-http-info
  "Delete an escalation policy
  Deletes an existing escalation policy and rules. The escalation policy must not be in use by any services."
  [id ]
  (check-required-params id)
  (call-api "/escalation_policies/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn escalation-policies-id-delete
  "Delete an escalation policy
  Deletes an existing escalation policy and rules. The escalation policy must not be in use by any services."
  [id ]
  (:data (escalation-policies-id-delete-with-http-info id)))

(defn escalation-policies-id-get-with-http-info
  "Get an escalation policy
  Get information about an existing escalation policy and its rules."
  ([id ] (escalation-policies-id-get-with-http-info id nil))
  ([id {:keys [include ]}]
   (check-required-params id)
   (call-api "/escalation_policies/{id}" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn escalation-policies-id-get
  "Get an escalation policy
  Get information about an existing escalation policy and its rules."
  ([id ] (escalation-policies-id-get id nil))
  ([id optional-params]
   (:data (escalation-policies-id-get-with-http-info id optional-params))))

(defn escalation-policies-id-put-with-http-info
  "Update an escalation policy
  Updates an existing escalation policy and rules."
  ([id ] (escalation-policies-id-put-with-http-info id nil))
  ([id {:keys [inline-object-3 ]}]
   (check-required-params id)
   (call-api "/escalation_policies/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-3
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn escalation-policies-id-put
  "Update an escalation policy
  Updates an existing escalation policy and rules."
  ([id ] (escalation-policies-id-put id nil))
  ([id optional-params]
   (:data (escalation-policies-id-put-with-http-info id optional-params))))

(defn escalation-policies-post-with-http-info
  "Create an escalation policy
  Creates a new escalation policy. There must be at least one existing escalation rule added to create a new escalation policy."
  ([] (escalation-policies-post-with-http-info nil))
  ([{:keys [from inline-object-2 ]}]
   (call-api "/escalation_policies" :post
             {:path-params   {}
              :header-params {"From" from }
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-2
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn escalation-policies-post
  "Create an escalation policy
  Creates a new escalation policy. There must be at least one existing escalation rule added to create a new escalation policy."
  ([] (escalation-policies-post nil))
  ([optional-params]
   (:data (escalation-policies-post-with-http-info optional-params))))

