package rafe95.com.github

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import rafe95.com.github.plugins.configureHTTP
import rafe95.com.github.plugins.configureRouting
import rafe95.com.github.plugins.configureSerialization

fun main() {
    embeddedServer(Netty, port = 9005, host = "0.0.0.0") {
        configureRouting()
        configureHTTP()
        configureSerialization()
    }.start(wait = true)
}
