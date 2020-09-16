package com.priyangona.priyangona.controller.webController

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController {

    @RequestMapping("/")
    fun getHomePage(): String {
        return "home"
    }

}