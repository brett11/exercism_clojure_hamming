(ns hamming)

(defn distance [s1 s2]
  (if (not (= (count s1) (count s2)))
    nil
    (let [zipped (map vector s1 s2)]
      (reduce (fn [accum [s1-elem s2-elem]]
                (if (= s1-elem s2-elem)
                  (+ accum 0)
                  (+ accum 1))) 0 zipped))))
