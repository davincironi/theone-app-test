package com.app.apptest.domain.repository

import com.app.apptest.domain.RandomUser
import com.app.apptest.domain.RandomUserRedis
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RandomUserRedisRepository : CrudRepository<RandomUserRedis, String>

interface ActorService {

    fun getRandomUser(id: String): RandomUserRedis?
    fun createRandomUser(randomUserRedis: RandomUserRedis)

}