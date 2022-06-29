package com.app.apptest.domain.repository

import com.app.apptest.domain.RandomUser

interface RandomUserRepository {

    fun getRandomUserBySeed(seed: String?) : RandomUser?

}