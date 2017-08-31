package org.theflies.tkg

import org.springframework.boot.SpringApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableConfigServer
class ConfigApplication

fun main(args: Array<String>) {
  SpringApplication.run(ConfigApplication::class.java, *args)
}