(ns graveyard-library-clj.system.operating_system)

;; Clojure doesn't exactly have enums...
(def os #{:windows :osx :linux :solaris :other})

(defn get-os
  (if (= (.toLowerCase (System/getProperty "os.name")) "win")
    :windows 
    (if (= (.toLowerCase (System/getProperty "os.name")) "mac")
      :osx 
      (if (= (.toLowerCase (System/getProperty "os.name")) "linux")
        :linux 
        (if (= (.toLowerCase (System/getProperty "os.name")) "unix")
          :linux 
          (if (= (.toLowerCase (System/getProperty "os.name")) "solaris")
            :solaris 
            (if (= (.toLowerCase (System/getProperty "os.name")) "sunos") 
              :solaris :other)
            )
          )
        )
      )
    )
  )
