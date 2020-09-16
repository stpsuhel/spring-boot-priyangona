package com.priyangona.priyangona.repository

import com.priyangona.priyangona.constant.Status
import com.priyangona.priyangona.model.database.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository: JpaRepository<Category, Long> {
    fun findAllByStatus(status: Int): ArrayList<Category>
}