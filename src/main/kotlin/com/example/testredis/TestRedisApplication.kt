package com.example.testredis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestRedisApplication

fun main(args: Array<String>) {
	runApplication<TestRedisApplication>(*args)
}
