package com.example.mysql.mysql_app.service

import com.example.mysql.mysql_app.entity.User
import reactor.core.publisher.Flux

interface UserService {
    fun saveUser(user: User): User
    fun getUsers(): List<User>
//    fun getUsers2(): Flux<User>
}