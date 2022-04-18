package com.github.rafe95

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.github.rafe95.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureTemplating()
    }.start(wait = true)
}
