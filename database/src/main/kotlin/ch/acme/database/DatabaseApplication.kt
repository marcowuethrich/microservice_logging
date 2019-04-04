package ch.acme.database

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
@EntityScan(basePackages = ["ch.acme.database"])
class DatabaseApplication

fun main(args: Array<String>) {
	runApplication<DatabaseApplication>(*args)
}
