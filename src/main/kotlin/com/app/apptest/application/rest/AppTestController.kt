package com.app.apptest.application.rest

import com.app.apptest.domain.RandomUser
import com.app.apptest.domain.repository.RandomUserRepository
import com.app.apptest.domain.service.RandomUserService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api")
class AppTestController(private val randomUserService : RandomUserService) {

    @RequestMapping(value= arrayOf("/"), method = arrayOf(RequestMethod.GET))
    @ResponseBody
    open fun getRandomUserBySeed(@RequestParam("seed") seed: String?): RandomUser? {
        return randomUserService.getRandomUserBySeed(seed)
    }
}