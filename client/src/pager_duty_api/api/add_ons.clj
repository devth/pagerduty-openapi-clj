(ns pager-duty-api.api.add-ons
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn addons-get-with-http-info
  "List installed add-ons
  List all of the add-ons installed on your account."
  ([] (addons-get-with-http-info nil))
  ([{:keys [include service-ids filter ]}]
   (call-api "/addons" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"include[]" (with-collection-format include :multi) "service_ids[]" (with-collection-format service-ids :multi) "filter" filter }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn addons-get
  "List installed add-ons
  List all of the add-ons installed on your account."
  ([] (addons-get nil))
  ([optional-params]
   (:data (addons-get-with-http-info optional-params))))

(defn addons-id-delete-with-http-info
  "Delete an add-on
  Remove an existing add-on."
  [id ]
  (check-required-params id)
  (call-api "/addons/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn addons-id-delete
  "Delete an add-on
  Remove an existing add-on."
  [id ]
  (:data (addons-id-delete-with-http-info id)))

(defn addons-id-get-with-http-info
  "Get an add-on
  Get details about an existing add-on."
  [id ]
  (check-required-params id)
  (call-api "/addons/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
             :auth-names    ["api_key"]}))

(defn addons-id-get
  "Get an add-on
  Get details about an existing add-on."
  [id ]
  (:data (addons-id-get-with-http-info id)))

(defn addons-id-put-with-http-info
  "Update an add-on
  Update an existing add-on."
  ([id ] (addons-id-put-with-http-info id nil))
  ([id {:keys [inline-object-1 ]}]
   (check-required-params id)
   (call-api "/addons/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-1
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn addons-id-put
  "Update an add-on
  Update an existing add-on."
  ([id ] (addons-id-put id nil))
  ([id optional-params]
   (:data (addons-id-put-with-http-info id optional-params))))

(defn addons-post-with-http-info
  "Install an add-on
  Install an add-on for your account."
  ([] (addons-post-with-http-info nil))
  ([{:keys [inline-object ]}]
   (call-api "/addons" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn addons-post
  "Install an add-on
  Install an add-on for your account."
  ([] (addons-post nil))
  ([optional-params]
   (:data (addons-post-with-http-info optional-params))))

