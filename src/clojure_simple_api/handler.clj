(ns clojure-simple-api.handler
  (:require [clojure-simple-api.routes :refer [app-routes]]
            [clojure-simple-api.utils.log :refer [prettify]])
	(:gen-class))


(defn main [request]
  (println "\n\n!! REQUEST !!\n\n")
  (-> request
    prettify
		app-routes))
