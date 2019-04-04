package ch.acme.processor

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(val service: Service) {

    @GetMapping("/db-timestamp")
    fun getDbTimestamp() = service.fetchDBTimestamp()

    @GetMapping("/db-metrics")
    fun getDbMetrics() = service.fetchDBMetrics()
}