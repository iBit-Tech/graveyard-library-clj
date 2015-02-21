(ns graveyard-library-clj.math.temperature_converter)

(defn fahrenheit-to-celsius
  [fah]
  (* (/ 5 9) (- fah 32)))

(defn fanrenheit-to-kelvin
  [fah]
  (* (/ 5 9) (+ fan 459.67)))

(defn celsius-to-fahrenheit
  [cel]
  (+ 32 (* cel (/ 9 5))))

(defn celsius-to-kelvin
  [cel]
  (+ cel 273.15))

(defn kelvin-to-fahrenheit
  [kelv]
  (- (* kelv (9/5)) 459.67))

(defn kelvin-to-celsius
  [kelv]
  (- kelv 273.15))
