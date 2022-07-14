package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.routing.*
import kotlinx.html.body
import kotlinx.html.div
import kotlinx.html.head
import kotlinx.html.img
import kotlinx.html.style
import kotlinx.html.title
import kotlinx.html.unsafe

fun Application.configureTemplating() {


    routing {
        get("/") {
            call.respondHtml {
                head {
                    title("Powered By Paketo Buildpacks")
                }
                body {
                    unsafe {
                        +"""
                            <img style="display: block; margin-left: auto; margin-right: auto; width: 50%;" 
                            src="https://paketo.io/images/paketo-logo-full-color.png"/>
                            """
                    }
                }
            }
        }
    }
}
