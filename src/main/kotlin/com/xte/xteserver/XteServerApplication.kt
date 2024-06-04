package com.xte.xteserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class XteServerApplication

fun main(args: Array<String>) {
    runApplication<XteServerApplication>(*args)
}
