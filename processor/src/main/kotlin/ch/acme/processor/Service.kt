package ch.acme.processor

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.time.LocalDateTime

@Service
class Service constructor(val restTemplate: RestTemplate) {

    fun fetchDBTimestamp(): LocalDateTime? = restTemplate.getForObject("/db-timestamp", LocalDateTime::class.java)

    fun fetchDBMetrics(): DBMetricsDto? = restTemplate.getForObject("/db-metrics", DBMetricsDto::class.java)
}