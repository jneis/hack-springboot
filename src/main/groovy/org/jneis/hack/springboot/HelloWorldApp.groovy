package org.jneis.hack.springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class HelloWorldApp {

    static void main(String... args) {
        SpringApplication.run(HelloWorldApp, args)
    }

}
