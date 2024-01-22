package com.example.kotlinpatterns.facadepattern.facade

import com.example.kotlinpatterns.facadepattern.User
import java.util.UUID

class UserManager(
    private val userApi: ApiManager = ApiManager(),
    private val userCache: CacheManager = CacheManager())
    : IUserManager {
    override fun getUser(id: UUID): User {
        val cachedUser = userCache.getUser(id)
        if (cachedUser == null) {
            val apiUser = userApi.getUser(id)
            if (apiUser != null)
                userCache.add(apiUser)
            return apiUser
        }
        return cachedUser
    }
}