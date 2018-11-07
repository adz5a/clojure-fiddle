(ns clojure_fiddle.rotate_sequence
  "http://www.4clojure.com/problem/44")

(def s1 '(1 2 3 4 5))
(def s2 '(:a :b :c))

(reverse s1)
(split-at 2 s1)

(def rotate (fn [index coll]
              (let [i (mod index (count coll))
                    [h t] (split-at i coll)]
                (concat t h))))

(rotate s1 2)
(rotate s1 -2)
(rotate s1 6)

(rotate s2 1)
(rotate s2 -4)
