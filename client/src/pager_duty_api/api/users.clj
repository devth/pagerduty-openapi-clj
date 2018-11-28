(ns pager-duty-api.api.users
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn users-get-with-http-info
  "List users
  List users of your PagerDuty account, optionally filtered by a search query."
  ([] (users-get-with-http-info nil))
  ([{:keys [query team-ids include ]}]
   (call-api "/users" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"query" query "team_ids[]" (with-collection-format team-ids :multi) "include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn users-get
  "List users
  List users of your PagerDuty account, optionally filtered by a search query."
  ([] (users-get nil))
  ([optional-params]
   (:data (users-get-with-http-info optional-params))))

(defn users-id-contact-methods-contact-method-id-delete-with-http-info
  "Delete a user's contact method
  Remove a user's contact method."
  [id contact-method-id ]
  (check-required-params id contact-method-id)
  (call-api "/users/{id}/contact_methods/{contact_method_id}" :delete
            {:path-params   {"id" id "contact_method_id" contact-method-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn users-id-contact-methods-contact-method-id-delete
  "Delete a user's contact method
  Remove a user's contact method."
  [id contact-method-id ]
  (:data (users-id-contact-methods-contact-method-id-delete-with-http-info id contact-method-id)))

(defn users-id-contact-methods-contact-method-id-get-with-http-info
  "Get a user's contact method
  Get details about a user's contact method."
  [id contact-method-id ]
  (check-required-params id contact-method-id)
  (call-api "/users/{id}/contact_methods/{contact_method_id}" :get
            {:path-params   {"id" id "contact_method_id" contact-method-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
             :auth-names    ["api_key"]}))

(defn users-id-contact-methods-contact-method-id-get
  "Get a user's contact method
  Get details about a user's contact method."
  [id contact-method-id ]
  (:data (users-id-contact-methods-contact-method-id-get-with-http-info id contact-method-id)))

(defn users-id-contact-methods-contact-method-id-put-with-http-info
  "Update a user's contact method
  Update a user's contact method."
  ([id contact-method-id ] (users-id-contact-methods-contact-method-id-put-with-http-info id contact-method-id nil))
  ([id contact-method-id {:keys [inline-object-32 ]}]
   (check-required-params id contact-method-id)
   (call-api "/users/{id}/contact_methods/{contact_method_id}" :put
             {:path-params   {"id" id "contact_method_id" contact-method-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-32
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn users-id-contact-methods-contact-method-id-put
  "Update a user's contact method
  Update a user's contact method."
  ([id contact-method-id ] (users-id-contact-methods-contact-method-id-put id contact-method-id nil))
  ([id contact-method-id optional-params]
   (:data (users-id-contact-methods-contact-method-id-put-with-http-info id contact-method-id optional-params))))

(defn users-id-contact-methods-get-with-http-info
  "List a user's contact methods
  List contact methods of your PagerDuty user."
  [id ]
  (check-required-params id)
  (call-api "/users/{id}/contact_methods" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
             :auth-names    ["api_key"]}))

(defn users-id-contact-methods-get
  "List a user's contact methods
  List contact methods of your PagerDuty user."
  [id ]
  (:data (users-id-contact-methods-get-with-http-info id)))

(defn users-id-contact-methods-post-with-http-info
  "Create a user contact method
  Create a new contact method."
  ([id ] (users-id-contact-methods-post-with-http-info id nil))
  ([id {:keys [inline-object-31 ]}]
   (check-required-params id)
   (call-api "/users/{id}/contact_methods" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-31
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn users-id-contact-methods-post
  "Create a user contact method
  Create a new contact method."
  ([id ] (users-id-contact-methods-post id nil))
  ([id optional-params]
   (:data (users-id-contact-methods-post-with-http-info id optional-params))))

(defn users-id-delete-with-http-info
  "Delete a user
  Remove an existing user."
  [id ]
  (check-required-params id)
  (call-api "/users/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn users-id-delete
  "Delete a user
  Remove an existing user."
  [id ]
  (:data (users-id-delete-with-http-info id)))

(defn users-id-get-with-http-info
  "Get a user
  Get details about an existing user."
  ([id ] (users-id-get-with-http-info id nil))
  ([id {:keys [include ]}]
   (check-required-params id)
   (call-api "/users/{id}" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn users-id-get
  "Get a user
  Get details about an existing user."
  ([id ] (users-id-get id nil))
  ([id optional-params]
   (:data (users-id-get-with-http-info id optional-params))))

(defn users-id-notification-rules-get-with-http-info
  "List a user's notification rules
  List notification rules of your PagerDuty user."
  ([id ] (users-id-notification-rules-get-with-http-info id nil))
  ([id {:keys [include ]}]
   (check-required-params id)
   (call-api "/users/{id}/notification_rules" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn users-id-notification-rules-get
  "List a user's notification rules
  List notification rules of your PagerDuty user."
  ([id ] (users-id-notification-rules-get id nil))
  ([id optional-params]
   (:data (users-id-notification-rules-get-with-http-info id optional-params))))

(defn users-id-notification-rules-notification-rule-id-delete-with-http-info
  "Delete a user's notification rule
  Remove a user's notification rule."
  [id notification-rule-id ]
  (check-required-params id notification-rule-id)
  (call-api "/users/{id}/notification_rules/{notification_rule_id}" :delete
            {:path-params   {"id" id "notification_rule_id" notification-rule-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn users-id-notification-rules-notification-rule-id-delete
  "Delete a user's notification rule
  Remove a user's notification rule."
  [id notification-rule-id ]
  (:data (users-id-notification-rules-notification-rule-id-delete-with-http-info id notification-rule-id)))

(defn users-id-notification-rules-notification-rule-id-get-with-http-info
  "Get a user's notification rule
  Get details about a user's notification rule."
  ([id notification-rule-id ] (users-id-notification-rules-notification-rule-id-get-with-http-info id notification-rule-id nil))
  ([id notification-rule-id {:keys [include ]}]
   (check-required-params id notification-rule-id)
   (call-api "/users/{id}/notification_rules/{notification_rule_id}" :get
             {:path-params   {"id" id "notification_rule_id" notification-rule-id }
              :header-params {}
              :query-params  {"include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn users-id-notification-rules-notification-rule-id-get
  "Get a user's notification rule
  Get details about a user's notification rule."
  ([id notification-rule-id ] (users-id-notification-rules-notification-rule-id-get id notification-rule-id nil))
  ([id notification-rule-id optional-params]
   (:data (users-id-notification-rules-notification-rule-id-get-with-http-info id notification-rule-id optional-params))))

(defn users-id-notification-rules-notification-rule-id-put-with-http-info
  "Update a user's notification rule
  Update a user's notification rule."
  ([id notification-rule-id ] (users-id-notification-rules-notification-rule-id-put-with-http-info id notification-rule-id nil))
  ([id notification-rule-id {:keys [inline-object-34 ]}]
   (check-required-params id notification-rule-id)
   (call-api "/users/{id}/notification_rules/{notification_rule_id}" :put
             {:path-params   {"id" id "notification_rule_id" notification-rule-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-34
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn users-id-notification-rules-notification-rule-id-put
  "Update a user's notification rule
  Update a user's notification rule."
  ([id notification-rule-id ] (users-id-notification-rules-notification-rule-id-put id notification-rule-id nil))
  ([id notification-rule-id optional-params]
   (:data (users-id-notification-rules-notification-rule-id-put-with-http-info id notification-rule-id optional-params))))

(defn users-id-notification-rules-post-with-http-info
  "Create a user notification rule
  Create a new notification rule."
  ([id ] (users-id-notification-rules-post-with-http-info id nil))
  ([id {:keys [inline-object-33 ]}]
   (check-required-params id)
   (call-api "/users/{id}/notification_rules" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-33
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn users-id-notification-rules-post
  "Create a user notification rule
  Create a new notification rule."
  ([id ] (users-id-notification-rules-post id nil))
  ([id optional-params]
   (:data (users-id-notification-rules-post-with-http-info id optional-params))))

(defn users-id-put-with-http-info
  "Update a user
  Update an existing user. Note that you may also supply a `password` property--it will not be returned by any API."
  ([id ] (users-id-put-with-http-info id nil))
  ([id {:keys [inline-object-30 ]}]
   (check-required-params id)
   (call-api "/users/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-30
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn users-id-put
  "Update a user
  Update an existing user. Note that you may also supply a `password` property--it will not be returned by any API."
  ([id ] (users-id-put id nil))
  ([id optional-params]
   (:data (users-id-put-with-http-info id optional-params))))

(defn users-post-with-http-info
  "Create a user
  Create a new user. Note that you must also supply a `password` property to create a user--it will not be returned by any API."
  ([from ] (users-post-with-http-info from nil))
  ([from {:keys [inline-object-29 ]}]
   (check-required-params from)
   (call-api "/users" :post
             {:path-params   {}
              :header-params {"From" from }
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-29
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn users-post
  "Create a user
  Create a new user. Note that you must also supply a `password` property to create a user--it will not be returned by any API."
  ([from ] (users-post from nil))
  ([from optional-params]
   (:data (users-post-with-http-info from optional-params))))

