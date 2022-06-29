package com.app.apptest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.client.WebClient

@SpringBootApplication
open class AppTestApplication {
	@Bean
	fun client(builder: WebClient.Builder): WebClient {
		return builder
			.baseUrl("https://randomuser.me/api")
			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
			.build()
	}
}

fun main(args: Array<String>) {
	runApplication<AppTestApplication>(*args)
}
