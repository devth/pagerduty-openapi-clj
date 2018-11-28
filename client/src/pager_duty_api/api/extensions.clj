(ns pager-duty-api.api.extensions
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn extensions-get-with-http-info
  "List extensions
  List existing extensions."
  ([] (extensions-get-with-http-info nil))
  ([{:keys [extension-object-id query extension-schema-id include ]}]
   (call-api "/extensions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"extension_object_id" extension-object-id "query" query "extension_schema_id" extension-schema-id "include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn extensions-get
  "List extensions
  List existing extensions."
  ([] (extensions-get nil))
  ([optional-params]
   (:data (extensions-get-with-http-info optional-params))))

(defn extensions-id-delete-with-http-info
  "Delete an extension
  Delete an existing extension. Once the extension is deleted, it will not be accessible from the web UI and new incidents won't be able to be created for this extension."
  [id ]
  (check-required-params id)
  (call-api "/extensions/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.pagerduty+json;version=2"]
             :auth-names    ["api_key"]}))

(defn extensions-id-delete
  "Delete an extension
  Delete an existing extension. Once the extension is deleted, it will not be accessible from the web UI and new incidents won't be able to be created for this extension."
  [id ]
  (:data (extensions-id-delete-with-http-info id)))

(defn extensions-id-get-with-http-info
  "Get an extension
  Get details about an existing extension."
  ([id ] (extensions-id-get-with-http-info id nil))
  ([id {:keys [include ]}]
   (check-required-params id)
   (call-api "/extensions/{id}" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"include[]" (with-collection-format include :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn extensions-id-get
  "Get an extension
  Get details about an existing extension."
  ([id ] (extensions-id-get id nil))
  ([id optional-params]
   (:data (extensions-id-get-with-http-info id optional-params))))

(defn extensions-id-put-with-http-info
  "Update an extension
  Update an existing extension."
  ([id ] (extensions-id-put-with-http-info id nil))
  ([id {:keys [inline-object-5 ]}]
   (check-required-params id)
   (call-api "/extensions/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-5
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn extensions-id-put
  "Update an extension
  Update an existing extension."
  ([id ] (extensions-id-put id nil))
  ([id optional-params]
   (:data (extensions-id-put-with-http-info id optional-params))))

(defn extensions-post-with-http-info
  "Create an extension
  Create a new extension."
  ([] (extensions-post-with-http-info nil))
  ([{:keys [inline-object-4 ]}]
   (call-api "/extensions" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-4
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn extensions-post
  "Create an extension
  Create a new extension."
  ([] (extensions-post nil))
  ([optional-params]
   (:data (extensions-post-with-http-info optional-params))))

