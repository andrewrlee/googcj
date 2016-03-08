(ns code-jam.codejam-2012-Q-B
  (:require [clojure.string :as string])
  (:gen-class))

(def modifiers
  "from modulo to max diff from avg in [normal-case surprising-case]"
  {0 [0 1] 1 [1 1] 2 [1 2]})

(defn judge-max-scores [total]
  (let [average (quot total 3)
        [normal-mod surprising-mod] (modifiers (rem total 3))]
    {:total total :max (min total (+ average normal-mod)) :surprise-max (min total (+ average surprising-mod))}))

(defn solver [line] 
  (let [values (string/split line #" ")
        [_ surprises max-score-limit & scores] (map #(Integer/parseInt %) values)
        maxes (reverse (sort-by :total (map judge-max-scores scores)))
        [match-with-max unmatched] (split-with #(<= max-score-limit (:max %)) maxes)
        match-with-surprise (take surprises (filter #(<= max-score-limit (:surprise-max %)) unmatched))]
    (+ (count match-with-max) (count match-with-surprise))))

