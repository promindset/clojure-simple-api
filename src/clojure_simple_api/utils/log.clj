(ns clojure-simple-api.utils.log
  (:require [clojure.pprint :refer [pprint]])
  (:gen-class))


(defn prettify
  "Prints out the message and returns it with no side effects."
  [message]
  (pprint message)
  message)
