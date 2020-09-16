package com.priyangona.priyangona.model.database

import com.priyangona.priyangona.model.AuditModel
import org.jetbrains.annotations.NotNull
import javax.persistence.Entity

@Entity
class Category: AuditModel() {

    @NotNull
    var name: String? = null

}