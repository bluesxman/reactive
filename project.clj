(defproject reactive "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :source-paths ["src/clojure"]
;;  :java-source-paths ["src/java"]
;;  :javac-options ["-target" "1.8" "-source" "1.8"]
  :compile-path "classes"
  :target-path "jar"
  :jar-name "reactive-core.jar"
  :aot [reactive.Core])
