package ch.acme.frontend

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import java.time.LocalDateTime

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class DBMetricsDto(
        var id: Long,
        var version: String,
        var lastRestart: LocalDateTime,
        var dbType: String
)