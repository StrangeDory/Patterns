package com.example.kotlinpatterns.facadepattern.facade

import com.example.kotlinpatterns.facadepattern.User
import java.util.UUID

class ApiManager: IUserManager {
    override fun getUser(id: UUID): User {
        TODO("Not yet implemented")
    }
}