package com.example.mysql.mysql_app.repository

import com.example.mysql.mysql_app.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface UserRepository: JpaRepository<User, Long> {
}