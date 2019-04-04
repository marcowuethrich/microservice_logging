package ch.acme.database.controller

import ch.acme.database.service.DBMetricsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DBMetricsController(val service: DBMetricsService) {

    @GetMapping("/db-timestamp")
    fun getDbTimestamp() = service.fetchDBTimestamp()

    @GetMapping("/db-metrics")
    fun getDbMetrics() = service.fetchDBMetrics()
}