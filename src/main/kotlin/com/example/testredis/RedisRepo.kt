package com.example.testredis

import org.springframework.data.repository.CrudRepository

interface RedisRepo: CrudRepository<UserRedisEntity, String>