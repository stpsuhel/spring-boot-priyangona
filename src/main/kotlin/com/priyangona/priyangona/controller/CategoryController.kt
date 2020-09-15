package com.priyangona.priyangona.controller

import com.priyangona.priyangona.model.Category
import com.priyangona.priyangona.repository.CategoryRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.mvc.support.RedirectAttributes

@Controller
class CategoryController(val categoryRepository: CategoryRepository) {

    @RequestMapping("add-category")
    fun addCategoryPage(model: Model): String{

        model.addAttribute("category", Category())
        return "category/addCategory"
    }

    @RequestMapping("add-category", method = [RequestMethod.POST])
    fun saveCategory(@Validated @ModelAttribute("category") category: Category, bindingResult: BindingResult,
                     model: Model, redirectAttributes: RedirectAttributes): String{

        if(category.name != null){
            categoryRepository.save(category)
            return "home.html"
        }
        return "redirect:./add-category"
    }

    @RequestMapping("all-category")
    fun allCategoryList(model: Model): String{

        val categoryList = categoryRepository.findAll()

        model.addAttribute("categoryList", categoryList)
        return "category/addCategory"
    }

}