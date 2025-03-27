package yg.booking_ticket

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Test {

    @GetMapping("/test")
    fun test(): String {
        return "other environment push";
    }
}