package com.priyangona.priyangona.repository

import com.priyangona.priyangona.model.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository: JpaRepository<Category, Long> {
}