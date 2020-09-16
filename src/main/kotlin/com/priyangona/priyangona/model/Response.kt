package com.priyangona.priyangona.model

class Response<T> {
    var isResultAvailable = false
    var isSuccessful = false
    var result: T? = null
    var message: Array<String>? = null

    @JvmName("setResult1")
    fun setResult(result: T) {
        this.result = result
    }
}