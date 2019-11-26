package com.gzeinnumer.basicmvvmkt.util

import com.gzeinnumer.basicmvvmkt.data.FakeDatabase
import com.gzeinnumer.basicmvvmkt.data.QuoteRepository
import com.gzeinnumer.basicmvvmkt.ui.quotes.QuoteViewModelFactory

//todo 8

object InjectorUtils {
    fun provideQouteViewModelFactory(): QuoteViewModelFactory{
        val quoteRepository = QuoteRepository.getInstanceR(FakeDatabase.getInstanceFD().quoteDao)
        return QuoteViewModelFactory(quoteRepository)
    }
}