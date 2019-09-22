(defproject clojure-simple-api "0.1.0-SNAPSHOT"
  :description "meant to serve as a stand alone identity authentication service."
  :url "https://github.com/promindset/clojure-simple-api.git"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]

                 ;Routing library for ring.
                 [compojure "1.6.1"]

                 ;http stuff.
                 [ring "1.7.1"]
                 [ring/ring-json "0.5.0"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [ring/ring-devel "1.7.1"]

                 ;JSON data format.
                 [cheshire "5.9.0"]]


  :ring {:handler clojure-simple-api.handler/main}
  :plugins [[lein-ring "0.12.5"]
            [compojure "1.6.1"]]
  :repl-options {:init-ns clojure-simple-api.core})
