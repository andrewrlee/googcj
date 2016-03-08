(ns code-jam.codejam-2012-Q-A
  (:gen-class))

(def input 
  ["ejp mysljylc kd kxveddknmc re jsicpdrysi"
   "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd"
   "de kr kd eoya kw aej tysr re ujdr lkgc jv"])

(def output 
 ["our language is impossible to understand"
  "there are twenty six factorial possibilities"
  "so it is okay if you want to just give up"])

(def dict
  (letfn [(to-chars [s] (flatten (map seq s)))
          (zip-to-map [i o] {i  o})]   
    (into {\z \q \q \z} (map zip-to-map (to-chars input) (to-chars output)))))

(defn solver [line] 
  (apply str (map dict (seq line))))
