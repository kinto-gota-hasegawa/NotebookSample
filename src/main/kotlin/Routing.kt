package com.example.notebooksample

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

data class User(val name: String)

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/user") {
            call.respondText("Hello")
        }
    }
}
