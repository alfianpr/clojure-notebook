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

(let [plus (fn [] (+ 1 %1 %2 %3))]
  (println (plus 2 3 4)))

(let [plus #(+ 1 %1 %2)]
  (println (plus 2 3)))

