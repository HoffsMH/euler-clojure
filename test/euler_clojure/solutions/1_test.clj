(ns euler-clojure.solutions.1-test
  (:require [clojure.test :refer :all]
            [euler-clojure.solutions.1 :refer :all]))

(deftest multiple-set-test
  (testing "with normal param"
    (is (=
      (multiple-set {:factor 5 :max-num 20})
      #{0 5 10 15}))))

(deftest merge-multiples-test
  (testing "with normal param"
    (is (=
      (merge-multiples #{0 5 10 15} #{0 3 6 9 12 15})
      #{0 15}))))

(deftest update-factors-test
  (testing "with normal param"
    (is (=
      (update-factors #{0 2 3})
      #{2 3})))
  (is (=
      (update-factors #{9 2 3 5 1})
      #{2 3 5 9})))
