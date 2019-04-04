package ch.acme.processor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class ProcessorApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<ProcessorApplication>(*args)
        }
    }

    @Bean
    fun getDatabaseRestTemplate(): RestTemplate = RestTemplateBuilder().rootUri("http://localhost:8083").build()

}
