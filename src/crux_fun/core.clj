(ns crux-fun.core
  (:require
    [crux.api :as crux])
  (:import (crux.api ICruxAPI)))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(def ^crux.api.ICruxAPI system
  (crux/start-standalone-system {:kv-backend "crux.kv.memdb.MemKv"
                                 :db-dir "data/db-dir-1"}))



(comment


  )