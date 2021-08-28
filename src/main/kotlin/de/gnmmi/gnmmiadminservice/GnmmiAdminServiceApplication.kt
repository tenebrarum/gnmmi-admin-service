package de.gnmmi.gnmmiadminservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GnmmiAdminServiceApplication

fun main(args: Array<String>) {
	runApplication<GnmmiAdminServiceApplication>(*args)
}
