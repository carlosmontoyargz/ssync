package com.mino.ssync

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SyncApplication

fun main(args: Array<String>) {
	runApplication<SyncApplication>(*args)
}
