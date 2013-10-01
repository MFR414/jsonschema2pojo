(defproject jsonschema2pojo "0.1.0-SNAPSHOT"
            :description "Web front-end for jsonschema2pojo"
            :dependencies [[org.clojure/clojure "1.5.1"]
                           [org.clojure/data.codec "0.1.0"]
                           [org.clojure/tools.logging "0.2.6"]
                           [compojure "1.1.5"]
                           [ring/ring-jetty-adapter "1.2.0"]
                           [com.googlecode.jsonschema2pojo/jsonschema2pojo-core "0.3.7"]]
            :plugins [[lein-ring "0.8.7"]]
            :ring {:handler jsonschema2pojo.server/app}
            :main jsonschema2pojo.server
            :min-lein-version "2.0.0")
