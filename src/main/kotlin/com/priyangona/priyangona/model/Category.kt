package com.priyangona.priyangona.model

import org.jetbrains.annotations.NotNull
import javax.persistence.Entity

@Entity
class Category: AuditModel() {

    @NotNull
    var name: String? = null

}