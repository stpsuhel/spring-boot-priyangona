package com.priyangona.priyangona.model

import org.jetbrains.annotations.NotNull
import javax.persistence.Entity

@Entity
class Product: AuditModel() {

    @NotNull
    var name: String? = null

    @NotNull
    var description: String? = null

    @NotNull
    var price: Int? = null

    @NotNull
    var image: String? = null

    @NotNull
    var categoryId: Long? = null
}