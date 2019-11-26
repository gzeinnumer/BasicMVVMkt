package com.gzeinnumer.basicmvvmkt.data

//todo 2
data class Quote(val quote: String,
                 val author: String){
    override fun toString(): String {
        return "$quote - $author"
    }
}