(ns code-jam.codejam-2012-Q_A-test
  (:use midje.sweet)
  (:require [clojure.test :refer :all]
            [code-jam.codejam-2012-Q-A :as codejam-2012-Q-A]
            [code-jam.runner :refer [solve]]))

(facts samples
  (fact (codejam-2012-Q-A/solver "ejp mysljylc kd kxveddknmc re jsicpdrysi")
    => "our language is impossible to understand")
  (fact (codejam-2012-Q-A/solver "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd")
    => "there are twenty six factorial possibilities")
  (fact (codejam-2012-Q-A/solver "de kr kd eoya kw aej tysr re ujdr lkgc jv")
    => "so it is okay if you want to just give up"))

(deftest generate-output-files
  (solve codejam-2012-Q-A/solver ["2012-Q-A"]))
