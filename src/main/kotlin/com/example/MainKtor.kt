package com.example

import com.example.plugins.configureMonitoring
import com.example.plugins.configureRouting
import com.example.plugins.configureSerialization
import com.example.route.getFood
import com.example.route.randomFood
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.routing.*

fun main() {
    val port = System.getenv("PORT")?.toInt() ?: 8080
    val server = embeddedServer(Netty,port){
        configureSerialization()
        configureMonitoring()
        configureRouting()
    }
    server.start(wait = true)
}