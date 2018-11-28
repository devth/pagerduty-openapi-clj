(ns pager-duty-api.api.response-plays
  (:require [pager-duty-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn response-plays-response-play-id-run-post-with-http-info
  "Run a response play
  Run a specified response play on a given incident."
  ([response-play-id from ] (response-plays-response-play-id-run-post-with-http-info response-play-id from nil))
  ([response-play-id from {:keys [inline-object-8 ]}]
   (check-required-params response-play-id from)
   (call-api "/response_plays/{response_play_id}/run" :post
             {:path-params   {"response_play_id" response-play-id }
              :header-params {"From" from }
              :query-params  {}
              :form-params   {}
              :body-param    inline-object-8
              :content-types ["application/json"]
              :accepts       ["application/vnd.pagerduty+json;version=2" "application/json"]
              :auth-names    ["api_key"]})))

(defn response-plays-response-play-id-run-post
  "Run a response play
  Run a specified response play on a given incident."
  ([response-play-id from ] (response-plays-response-play-id-run-post response-play-id from nil))
  ([response-play-id from optional-params]
   (:data (response-plays-response-play-id-run-post-with-http-info response-play-id from optional-params))))

