package com.example.restservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class KreetingController {
    var counter: AtomicLong = AtomicLong();

    @GetMapping("/kreeting")
    fun kreeting(@RequestParam(name = "name", defaultValue = "world") name: String): Kreeting{
        return Kreeting(counter.incrementAndGet(), "Hello $name")
    }


}