(ns pager-duty-api.api.teams
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn teams-get-with-http-info
  "List teams
  List teams of your PagerDuty account, optionally filtered by a search query."
  ([] (teams-get-with-http-info nil))
  ([{:keys [query ]}]
   (call-api "/teams" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"query" query }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn teams-get
  "List teams
  List teams of your PagerDuty account, optionally filtered by a search query."
  ([] (teams-get nil))
  ([optional-params]
   (:data (teams-get-with-http-info optional-params))))

(defn teams-id-delete-with-http-info
  "Delete a team
  Remove an existing team."
  [id ]
  (check-required-params id)
  (call-api "/teams/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn teams-id-delete
  "Delete a team
  Remove an existing team."
  [id ]
  (:data (teams-id-delete-with-http-info id)))

(defn teams-id-escalation-policies-escalation-policy-id-delete-with-http-info
  "Remove an escalation policy from a team
  Remove an escalation policy from a team."
  [id escalation-policy-id ]
  (check-required-params id escalation-policy-id)
  (call-api "/teams/{id}/escalation_policies/{escalation_policy_id}" :delete
            {:path-params   {"id" id "escalation_policy_id" escalation-policy-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn teams-id-escalation-policies-escalation-policy-id-delete
  "Remove an escalation policy from a team
  Remove an escalation policy from a team."
  [id escalation-policy-id ]
  (:data (teams-id-escalation-policies-escalation-policy-id-delete-with-http-info id escalation-policy-id)))

(defn teams-id-escalation-policies-escalation-policy-id-put-with-http-info
  "Add an escalation policy to a team
  Add an escalation policy to a team."
  [id escalation-policy-id ]
  (check-required-params id escalation-policy-id)
  (call-api "/teams/{id}/escalation_policies/{escalation_policy_id}" :put
            {:path-params   {"id" id "escalation_policy_id" escalation-policy-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn teams-id-escalation-policies-escalation-policy-id-put
  "Add an escalation policy to a team
  Add an escalation policy to a team."
  [id escalation-policy-id ]
  (:data (teams-id-escalation-policies-escalation-policy-id-put-with-http-info id escalation-policy-id)))

(defn teams-id-get-with-http-info
  "Get a team
  Get details about an existing team."
  [id ]
  (check-required-params id)
  (call-api "/teams/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
             :auth-names    ["api_key"]}))

(defn teams-id-get
  "Get a team
  Get details about an existing team."
  [id ]
  (:data (teams-id-get-with-http-info id)))

(defn teams-id-put-with-http-info
  "Update a team
  Update an existing team."
  ([id ] (teams-id-put-with-http-info id nil))
  ([id {:keys [inline-object-28 ]}]
   (check-required-params id)
   (call-api "/teams/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-28
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn teams-id-put
  "Update a team
  Update an existing team."
  ([id ] (teams-id-put id nil))
  ([id optional-params]
   (:data (teams-id-put-with-http-info id optional-params))))

(defn teams-id-users-user-id-delete-with-http-info
  "Remove a user from a team
  Remove a user from a team."
  [id user-id ]
  (check-required-params id user-id)
  (call-api "/teams/{id}/users/{user_id}" :delete
            {:path-params   {"id" id "user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn teams-id-users-user-id-delete
  "Remove a user from a team
  Remove a user from a team."
  [id user-id ]
  (:data (teams-id-users-user-id-delete-with-http-info id user-id)))

(defn teams-id-users-user-id-put-with-http-info
  "Add a user to a team
  Add a user to a team. Attempting to add a user with the `read_only_user` role will return a 400 error."
  [id user-id ]
  (check-required-params id user-id)
  (call-api "/teams/{id}/users/{user_id}" :put
            {:path-params   {"id" id "user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn teams-id-users-user-id-put
  "Add a user to a team
  Add a user to a team. Attempting to add a user with the `read_only_user` role will return a 400 error."
  [id user-id ]
  (:data (teams-id-users-user-id-put-with-http-info id user-id)))

(defn teams-post-with-http-info
  "Create a team
  Create a new team."
  ([] (teams-post-with-http-info nil))
  ([{:keys [inline-object-27 ]}]
   (call-api "/teams" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-27
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn teams-post
  "Create a team
  Create a new team."
  ([] (teams-post nil))
  ([optional-params]
   (:data (teams-post-with-http-info optional-params))))

