(defproject markov-elear "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [twitter-api "0.7.9"]
                 [environ "1.0.0"]
                 [overtone/at-at "1.2.0"]]
  :main markov-elear.generator
  :plugins [[lein-environ "1.0.0"]]
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.7.0"]]}})
