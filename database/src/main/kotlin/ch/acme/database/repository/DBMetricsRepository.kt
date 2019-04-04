package ch.acme.database.repository

import ch.acme.database.entity.DBMetrics
import org.springframework.data.repository.CrudRepository

interface DBMetricsRepository : CrudRepository<DBMetrics, Long>