package com.example.mysql.mysql_app.service

import com.example.mysql.mysql_app.entity.User
//import com.example.mysql.mysql_app.repository.ReactiveUserRepository
import com.example.mysql.mysql_app.repository.UserRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class UserServiceImpl(
        private val userRepository: UserRepository
//        private val reactiveUserRepository: ReactiveUserRepository
) : UserService {

    override fun saveUser(user: User): User {
        return userRepository.save(user)
    }

    override fun getUsers(): List<User> {
        return userRepository.findAll()
    }

//    override fun getUsers2(): Flux<User> {
//        return reactiveUserRepository.findAllBy()
//    }
}