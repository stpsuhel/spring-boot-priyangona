package com.priyangona.priyangona.controller.webController.restController


import com.priyangona.priyangona.constant.Status
import com.priyangona.priyangona.model.Response
import com.priyangona.priyangona.model.database.Category
import com.priyangona.priyangona.repository.CategoryRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class CategoryRestController(val categoryRepository: CategoryRepository) {

    @GetMapping
    @RequestMapping("category/all-category")
    fun getAllCategory(): Response<ArrayList<Category>> {

        val response = Response<ArrayList<Category>>()

        val getAllCategory = categoryRepository.findAllByStatus(Status.Active.value)

        if (getAllCategory.isNotEmpty()){
            response.message = arrayOf("Category Found")
            response.result = getAllCategory
            response.isResultAvailable = true
            response.isSuccessful = true
        }

        return response
    }

}