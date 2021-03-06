package com.priyangona.priyangona.repository

import com.priyangona.priyangona.model.database.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, Long> {
}