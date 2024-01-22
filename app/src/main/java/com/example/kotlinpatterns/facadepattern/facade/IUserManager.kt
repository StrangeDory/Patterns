package com.example.kotlinpatterns.facadepattern.facade

import com.example.kotlinpatterns.facadepattern.User
import java.util.UUID

interface IUserManager {
    fun getUser(id: UUID): User
}