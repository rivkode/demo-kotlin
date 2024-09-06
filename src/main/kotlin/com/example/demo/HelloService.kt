package com.example.demo

import org.springframework.stereotype.Service

@Service
class HelloService {
    fun search(helloDto: HelloDto): String? {
        println(helloDto.toString())
        return "String"
    }
}