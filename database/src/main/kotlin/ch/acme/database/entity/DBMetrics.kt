package ch.acme.database.entity

import lombok.Getter
import lombok.Setter
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "metrics")
@Getter
@Setter
class DBMetrics(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", updatable = false, nullable = false)
        var id: Long,
        @Column(name = "version", nullable = false)
        var version: String = "8.0.1",
        @Column(name = "lastRestart", nullable = false)
        var lastRestart: LocalDateTime = LocalDateTime.now(),
        @Column(name = "dbType", nullable = false)
        var dbType: String = "MYSQL"
)