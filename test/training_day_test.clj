(ns training-day-test
  (:require [clojure.test :refer :all]
            [training-day :refer :all]))

(deftest square-test
  (is (= 9 (square 3))))

(deftest average-test
  (is (= 3 (average 2 4))))

