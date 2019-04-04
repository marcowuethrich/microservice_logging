package ch.acme.database.service

import ch.acme.database.entity.DBMetrics
import ch.acme.database.repository.DBMetricsRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class DBMetricsService(val dbMetricsRepository: DBMetricsRepository) {

    fun fetchDBTimestamp(): LocalDateTime? = LocalDateTime.now()

    fun fetchDBMetrics(): DBMetrics? = dbMetricsRepository.findAll().first()
}