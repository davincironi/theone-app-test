package com.app.apptest.domain.service

import com.app.apptest.domain.RandomUser
import com.app.apptest.domain.RandomUserRedis
import com.app.apptest.domain.repository.RandomUserRepository
import com.google.gson.Gson
import com.google.gson.JsonObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import java.time.Duration


@Service
class RandomUserService : RandomUserRepository {

    @Autowired
    private lateinit var webClient: WebClient

    @Autowired
    private lateinit var randomUserRedisService: RandomUserRedisService

    override fun getRandomUserBySeed(seed: String?): RandomUser? {
        var id = seed.toString()
        var randomUserRedis = randomUserRedisService.getRandomUser(id)
        if (randomUserRedis == null) {
            var result = webClient
                .get()
                .uri("/?seed=$seed")
                .retrieve()
                .bodyToMono(RandomUser::class.java)
                .block(REQUEST_TIMEOUT)
            randomUserRedisService.createRandomUser(RandomUserRedis(id, Gson().toJson(result)))
            return result
        } else {
            return Gson().fromJson(randomUserRedis.response, RandomUser::class.java)
        }
    }

    companion object {
        private val REQUEST_TIMEOUT: Duration = Duration.ofSeconds(3)
    }
}