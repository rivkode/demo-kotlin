package com.example.demo

import org.springframework.data.repository.CrudRepository

interface HelloRepository: CrudRepository<Hello, Int>   {
}