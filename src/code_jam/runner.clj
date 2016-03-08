(ns code-jam.runner
  (:gen-class))

(defn- cases-from [file] 
  (with-open [rdr (clojure.java.io/reader file)] 
    (doall (rest (line-seq rdr)))))

(defn- solve-all-cases [solver file] 
  (map (fn [case line-number]
         (solver (inc line-number) case))
       (cases-from file) (range)))

(defn solve [solver problems]
  (doseq [problem problems]
    (let [result-file (clojure.java.io/writer (str "target/" problem ".out"))
          solver (fn [case-number case] (str "Case #" case-number ": " (solver case)))]
      (binding [*out* result-file]
        (doseq [result (solve-all-cases solver (str "resources/" problem ".in"))]
          (println result)))
      (.close result-file))))
