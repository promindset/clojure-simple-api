(ns clojure-simple-api.routes
  (:require [compojure.core :refer [defroutes GET POST]]
            [compojure.route :refer [not-found]]
            [clojure-simple-api.core :refer :all])
	(:gen-class))


(defroutes app-routes
  (GET "/" [] "<h1>Hello World...</h1>")
  (GET "/test" [] "<h1>Test World...</h1>")
  (POST "/register" request (create-user (:body request)))
  (not-found "Error,  Page not found!"))
