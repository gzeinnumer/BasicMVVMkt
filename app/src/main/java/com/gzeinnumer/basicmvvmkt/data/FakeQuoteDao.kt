package com.gzeinnumer.basicmvvmkt.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

//todo 3
class FakeQuoteDao {
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value = quoteList
    }

    fun addQuoteD(q: Quote){
        quoteList.add(q)
        quotes.value = quoteList
    }

    fun getQuotesD() = quotes as LiveData<List<Quote>>
}