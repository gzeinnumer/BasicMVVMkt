package com.gzeinnumer.basicmvvmkt.data

//todo 5
class QuoteRepository private constructor(private val quoteDao: FakeQuoteDao){

    fun addQuoteR(quote: Quote){
        quoteDao.addQuoteD(quote)
    }

    fun getQoutesR() = quoteDao.getQuotesD()

    companion object{
        @Volatile private var instance: QuoteRepository? = null

        fun getInstanceR(quoteDao: FakeQuoteDao) = instance
            ?: synchronized(this){
            instance
                ?: QuoteRepository(quoteDao).also {
                instance = it
            }
        }
    }
}