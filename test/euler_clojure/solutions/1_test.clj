(ns euler-clojure.solutions.1-test
  (:require [clojure.test :refer :all]
            [euler-clojure.solutions.1 :refer :all]))

(deftest solution-default
  (testing "with no parameters"
    (is (=
      (solution)
      698))))

(deftest is-a-multiple-test
  (testing "with standard numbers"
    (is (=
      (is-a-multiple 10 5)
      true))
    (is (=
      (is-a-multiple 10 3)
      false))
    (is (=
      (is-a-multiple 100 2)
      true))
    (is (=
      (is-a-multiple 7 3)
      false))
    (is (=
      (is-a-multiple 20 10)
      true))))

(deftest sum-of-multiples-test
  (testing "with beginning arguments"
    (is (=
      (sum-of-multiples {:of '(3 6 7) :below 1200})
      "some text"))))
