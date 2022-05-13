(ns first.core
  (:gen-class))

(use 'first.core :reload)

(println "hello, world")

(def a "aaaaa")
(println a)

(let [l "light"] (println (str "hello " l)))

(let [l "light"
      l_d (str l " is made by")]
  (println (str l_d " nature")))

(def object "light")

(println (str "let's be the " object))

(defn say-hello "introduction"
  [name]
  (str "hi, my name is " name))

(say-hello "alfian")

(doc say-hello)

(meta (var say-hello))

(comment (let [plus (fn [] (+ 1 %1 %2 %3))]
  (println (plus 2 3 4))))

(let [plus #(+ 1 %1 %2)]
  (println (plus 2 3)))


(def say-hello (fn [name] 
                 (println (str "hello, " name))))

(say-hello "kempil")

(def greeting (fn [greeting-func name] (greeting-func name)))

(greeting say-hello "kempil")

(defn inner [from-outer] #(println from-outer))

(def outer (inner "this is from outer"))

(outer)

(if true
  (do
  (println "ini benar")
  (println "ini salah")))

(defn positive-number [numbers]
  (if-let [pos-nums (not-empty (filter pos? numbers))]
    pos-nums "no positive numbers"))

(positive-number [-3, -4, 1, 2, 3])

(when true
  (println "hello"))

(defn case-test
  [n]
  (case n 
    1 "nomer satu"
    2 "nomer dua"
    "cuma ada dua"))
(case-test 1)
(case-test 2)

(defn cond-test
  [n]
  (cond
    (= n 1) "satu"
  (and (> n 3) (< n 10)) "lebih dari 3 kurang dari 10"
  :else "tidak ada"))

(cond-test 99)

