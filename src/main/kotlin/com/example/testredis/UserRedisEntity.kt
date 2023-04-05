package com.example.testredis

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import java.time.LocalDateTime

@RedisHash(value = "user")
class UserRedisEntity(
    @Id
    val id: Long,
    val name: String,
    val age: Int,
    val localDateTime: LocalDateTime = LocalDateTime.now()
)