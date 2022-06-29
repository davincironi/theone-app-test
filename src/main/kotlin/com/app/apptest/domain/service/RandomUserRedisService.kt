package com.app.apptest.domain.service

import com.app.apptest.domain.RandomUser
import com.app.apptest.domain.RandomUserRedis
import com.app.apptest.domain.repository.ActorService
import com.app.apptest.domain.repository.RandomUserRedisRepository
import org.springframework.stereotype.Service
import java.util.*


@Service
class RandomUserRedisService(val randomUserRedisRepository: RandomUserRedisRepository) : ActorService {

    override fun getRandomUser(id: String): RandomUserRedis? {
        if (randomUserRedisRepository.existsById(id)) {
            return randomUserRedisRepository.findById(id).get()
        } else {
            return null
        }
    }

    override fun createRandomUser(randomUserRedis : RandomUserRedis) {
        var result = randomUserRedisRepository.save(randomUserRedis)
    }
}