(ns clojure-simple-api.core
	(:require	[compojure.route :refer :all]
  					[compojure.core :refer [defroutes GET]]
            [cheshire.core :as json]
						[clojure.string :as str])
	(:gen-class))


(defn parse-body [body]
	(slurp (clojure.java.io/reader body)))


(defn validate-payload
	"Some function that takes in the body of the request as a parameter"
	[message]
	(println "Message" (parse-body message)))


(defn create-user
	[payload]
	(validate-payload payload)
	{:status 200
	 :headers {"Content-Type" "text/json"}
 	 :body (json/generate-string {:name "Assaad" :work "Homeless"})})
