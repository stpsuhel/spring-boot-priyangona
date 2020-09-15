package com.priyangona.priyangona.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController {

    @RequestMapping(value = ["/"])
    fun getHomePage(): String {
        return "home"
    }

}