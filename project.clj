(defproject code-jam "0.1.0-SNAPSHOT"
  :description "Attempting old google code jam questions"
  :url "https://github.com/plasma147/googcj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [[midje "1.8.3"]]
                   :plugins [[lein-midje "3.2"]]}})
