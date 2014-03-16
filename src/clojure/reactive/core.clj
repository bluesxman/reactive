(ns reactive.Core
  (:gen-class
     :methods
       [ #^{:static true} [hello [] String]]))

(defn -hello []
  "Hello clojure")
