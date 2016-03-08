(ns code-jam.codejam-2012-Q_C-test
  (:use midje.sweet)
  (:require [clojure.test :refer :all]
            [code-jam.codejam-2012-Q-C :as codejam-2012-Q-C]
            [code-jam.runner :refer [solve]]))

(facts samples
  (fact (codejam-2012-Q-C/solver "1 9")     => "0")
  (fact (codejam-2012-Q-C/solver "10 40")   => "3")
  (fact (codejam-2012-Q-C/solver "100 500") => "156")
  (fact (codejam-2012-Q-C/solver "1111 2222") => "287"))

(deftest generate-output-files
  (solve codejam-2012-Q-C/solver ["2012-Q-C-S" "2012-Q-C-L"]))
