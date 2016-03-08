(ns code-jam.codejam-2012-Q_B-test
  (:use midje.sweet)
  (:require [clojure.test :refer :all]
            [code-jam.codejam-2012-Q-B :as codejam-2012-Q-B]
            [code-jam.runner :refer [solve]]))

(facts samples
  (fact (codejam-2012-Q-B/solver "3 1 5 15 13 11") => 3)
  (fact (codejam-2012-Q-B/solver "3 0 8 23 22 21") => 2)
  (fact (codejam-2012-Q-B/solver "2 1 1 8 0") => 1)
  (fact (codejam-2012-Q-B/solver "6 2 8 29 20 8 18 18 21") => 3))

(deftest generate-output-files
  (solve codejam-2012-Q-B/solver ["2012-Q-B-S" "2012-Q-B-L"]))
