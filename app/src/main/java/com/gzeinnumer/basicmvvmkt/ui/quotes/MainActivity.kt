package com.gzeinnumer.basicmvvmkt.ui.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.gzeinnumer.basicmvvmkt.R
import com.gzeinnumer.basicmvvmkt.data.Quote
import com.gzeinnumer.basicmvvmkt.util.InjectorUtils
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //todo 9
        initializeUI()
    }

    //todo 10
    private fun initializeUI() {
        val factory = InjectorUtils.provideQouteViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
            .get(QuoteViewModel::class.java)

        viewModel.getQuoteVM().observe(this, Observer { quote ->
            val strBuilder = StringBuilder()
            quote.forEach{ quote ->
                strBuilder.append("$quote\n\n")
            }
            textView_quotes.text = strBuilder.toString()

            button_add_quote.setOnClickListener {
                val quote = Quote(
                    editText_quote.text.toString(),
                    editText_author.text.toString())

                viewModel.addQouteVM(quote)
                editText_author.setText("")
                editText_quote.setText("")
            }
        })
    }
}
