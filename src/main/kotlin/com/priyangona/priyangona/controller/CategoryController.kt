package com.priyangona.priyangona.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class CategoryController {

    @RequestMapping("add-category")
    fun addCategoryPage(): String{
        return "category/addCategory"
    }

}