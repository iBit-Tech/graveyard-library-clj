(ns graveyard-library-clj.math.temperature_converter)

(defn fahrenheit-to-celsius
  [fah]
  (* (/ 5 9) (- fah 32)))
