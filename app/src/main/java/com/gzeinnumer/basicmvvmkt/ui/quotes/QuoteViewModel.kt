package com.gzeinnumer.basicmvvmkt.ui.quotes

import androidx.lifecycle.ViewModel
import com.gzeinnumer.basicmvvmkt.data.QuoteRepository
import com.gzeinnumer.basicmvvmkt.data.Quote

//todo 6
class QuoteViewModel(private val quoteRepository: QuoteRepository) : ViewModel(){
    fun getQuoteVM() = quoteRepository.getQoutesR()

    fun addQouteVM(quote: Quote) = quoteRepository.addQuoteR(quote)
}