package com.example.route

import com.example.model.Food
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Route.getFood(){
    get("/food/{index}"){
        try {
            val index = call.parameters["index"]?.toInt()
            index?.let {
                val result = Food.foodList[index]
                call.respond(
                    HttpStatusCode.OK,
                    result
                )
            }
        }catch (e : IndexOutOfBoundsException){
            call.respond(
                HttpStatusCode.ExpectationFailed,
                "Error:IndexOutOfBoundsException"
            )
        }catch (e : NumberFormatException){
            call.respond(
                HttpStatusCode.ExpectationFailed,
                "Error:NumberFormatException"
            )
        }
    }
}

fun Route.randomFood(){
    get("/food"){
        call.respond(
            HttpStatusCode.OK,
            Food.foodList.random()
        )
    }
}