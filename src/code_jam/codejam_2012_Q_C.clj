(ns code-jam.codejam-2012-Q-C
  (:require [clojure.string :as string])
  (:gen-class))

(defn rotations [s]
  (->> s
       (iterate #(apply str (concat (drop 1 %) (take 1 %))))
       (take (count s))
       (remove (fn [s] (string/starts-with? s "0")))
       (map #(Integer/parseInt %))))


(defn solver [line]
  (let [[min max] (map #(Integer/parseInt %) (string/split line #" "))]
    (->>
     (range min (inc max))
     (map #(rotations (str %)))
     (mapcat (fn [[i & rs]] (map (fn [n] [i n]) rs)))
     (filter (fn [[a b]] (and (<= min a) (>= max b) (< a b))))
     (into #{})
     count
     str)))
