(ns one-function-to-rule-them-all)

(defn concat-elements [a-seq]
 (if (empty? a-seq)
    ()
    (concat (first a-seq) (concat-elements(rest a-seq)))))


(defn str-cat-test [a-seq]
  (reduce str a-seq))


(defn my-interpose [x a-seq]
  [:-])

(defn my-count [a-seq]
  :-)

(defn my-reverse [a-seq]
  [:-])

(defn min-max-element [a-seq]
  [:-])

(defn insert [sorted-seq n]
  [:-])

(defn insertion-sort [a-seq]
  [:-])

(defn parity [a-seq]
  [:-])

(defn minus [x]
  :-)

(defn count-params [x]
  :-)

(defn my-* [x]
  :-)

(defn pred-and [x]
  (fn [x] :-))

(defn my-map [f a-seq]
  [:-])
