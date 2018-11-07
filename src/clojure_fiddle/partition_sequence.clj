(ns clojure-fiddle.partition_sequence
  "http://www.4clojure.com/problem/54
  Write a function which returns a sequence of lists of x items each.
  List of less than x items should not be returned")

(def answer (fn [size coll]
              (let [partitions (loop [partitions ()
                                      [h t] (split-at size coll)]
                                 (if (< (count h) size)
                                   partitions
                                   (recur (conj partitions h)
                                          (split-at size t))))]
                (reverse partitions))))

(answer 3 (range 9))
(answer 2 (range 8))
(answer 3 (range 8))
