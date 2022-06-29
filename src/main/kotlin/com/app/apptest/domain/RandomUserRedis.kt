package com.app.apptest.domain

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.index.Indexed

@RedisHash("RandomUserRedis")
data class RandomUserRedis(
    @Indexed val id: String,
    val response: String
 )
//) {
//    @get:Id
//    var id: String? = null
//}