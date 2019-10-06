package com.example.mysql.mysql_app.controller

import com.example.mysql.mysql_app.entity.User
import com.example.mysql.mysql_app.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class UserController(private val userService: UserService) {

    @GetMapping("/users")
    fun getUsers(): List<User> = userService.getUsers()

    @PostMapping("/users")
    fun saveUser(@RequestBody user: User): User = userService.saveUser(user)

//    @GetMapping("/users2")
//    fun getUsers2(): Flux<User> = userService.getUsers2()
}


//https://medium.com/netifi/spring-webflux-and-rxjava2-jdbc-83a94e71ba04