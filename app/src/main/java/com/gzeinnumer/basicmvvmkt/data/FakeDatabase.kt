package com.gzeinnumer.basicmvvmkt.data

//todo 4
class FakeDatabase private constructor(){
    var quoteDao = FakeQuoteDao()
    private set

    companion object{
        @Volatile private var instance: FakeDatabase? = null

        fun getInstanceFD() = instance ?: synchronized(this){
            instance ?: FakeDatabase().also {
                instance = it
            }
        }
    }
}