(ns screenshot-demo.core
  (:require ["puppeteer" :as p]))

(defn main []
  (-> (p/launch)
      (.then (fn [browser]
               (.newPage browser)))
      (.then (fn [page]
               (-> (.goto page "https://google.com")
                   (.then (fn [_]
                            (.screenshot page #js {:path "/tmp/screenshot.png.png"})))
                   (.then #(js/console.log "Done!")))))))

(comment
  (main))
;;TODO promise-to-chan
