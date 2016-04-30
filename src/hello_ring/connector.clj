(ns hello-ring.connector)

(use 'ring.adapter.jetty)
(use 'hello-ring.core)
(run-jetty handler {:port 3000})
