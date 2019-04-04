package ch.acme.frontend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class FrontendApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<FrontendApplication>(*args)
        }
    }

    @Bean
    fun getProcessorRestTemplate(): RestTemplate = RestTemplateBuilder().rootUri("http://localhost:8082").build()

}