package rafe95.com.github.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import rafe95.com.github.routes.customerRouting

fun Application.configureRouting() {

    routing {
        customerRouting()
    }
}
