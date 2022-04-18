package rafe95.com.github.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import rafe95.com.github.routes.customerRouting
import rafe95.com.github.routes.getOrderRoute
import rafe95.com.github.routes.listOrdersRoute
import rafe95.com.github.routes.totalizeOrderRoute

fun Application.configureRouting() {

    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
