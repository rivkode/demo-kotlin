package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
@RestController
@RequestMapping("/api/v1/hello")
class HelloController(
    val helloService: HelloService
) {
    @GetMapping
    fun search(@RequestBody helloDto: HelloDto): String? {
        val result = helloService.search(helloDto)
        return result
    }
}