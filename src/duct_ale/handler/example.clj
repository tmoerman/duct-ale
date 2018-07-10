(ns duct-ale.handler.example
  (:require [ataraxy.core :as ataraxy]
            [ataraxy.response :as response] 
            [clojure.java.io :as io]
            [integrant.core :as ig]))

(defmethod ig/init-key :duct-ale.handler/example [_ options]
  (fn [{[_] :ataraxy/result}]
    [::response/ok (io/resource "duct_ale/handler/example/example.html")]))
