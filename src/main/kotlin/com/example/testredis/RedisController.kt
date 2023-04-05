package com.example.testredis

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RedisController(
    private val repo: RedisRepo
) {

    @GetMapping("/create")
    fun createNewUser(
        id: Long,
        @RequestParam(required = false, defaultValue = "Lee") name: String,
        @RequestParam(required = false, defaultValue = "20") age: Int): UserRedisEntity =
        repo.save(UserRedisEntity(id, name, age))

    @GetMapping("/count")
    fun getCount() = repo.count()

    @DeleteMapping("/deleteAll")
    fun deleteAll() = repo.deleteAll()
}