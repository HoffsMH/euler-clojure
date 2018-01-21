(ns euler-clojure.solutions.1
  (:gen-class))

; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
; Find the sum of all the multiples of 3 or 5 below 1000.

; takes a number and a max
; returns a set of all the multiples of number between 0 and max
(defn multiple-set
  [{factor :factor max-num :max-num}]
  (set (range 0 max-num factor)))

(defn merge-multiples
  [set-1 set-2]
  (clojure.set/intersection set-1 set-2))

(defn get-first-factor
  [factors]
  (first factors))

(defn update-factors
  [factors]
  (disj factors (get-first-factor factors)))

(defn update-args
  [{factors :factors max-num :max-num set :set :as args}]
  args)

; takes a set and a max
; returns a set of all the multiple of each number in the set between 0 and max
(defn multiple-sets
  [{factors :factors max-num :max-num set :set :as args}]
  (if (empty? factors)
    set
    (multiple-sets
      {:factors (update-factors factors)
       :max-num max-num
       :set (clojure.set/intersection set (multiple-set {:factor (first factors) :max-num max-num}))})))
