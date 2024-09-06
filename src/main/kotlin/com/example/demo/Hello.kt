package com.example.demo

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Hello(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int,
    val word: String,
    val cnt: Int = 0
)