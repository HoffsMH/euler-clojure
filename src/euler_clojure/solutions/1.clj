(ns euler-clojure.solutions.1
  (:gen-class))

; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
; Find the sum of all the multiples of 3 or 5 below 1000.

(defn sum-of-multiples
  [{factors :of
    max :below
    sum :sum
    :or {sum 0}}]
  (str "factors: " factors " max: " max " sum: " sum))

(defn is-a-multiple
  [possible-multiple number]
  (zero? (mod possible-multiple number)))

(defn solution
  ([]
  (sum-of-multiples {:of '(3 5) :below 1000}))
  ([{:keys [max factors]}]
  (sum-of-multiples {:of factors :below max})))
