package com.example.retrofittest1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.retrofittest1.model.RetrofitHelper
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.create
import com.example.retrofittest1.model.QuotesAPI
import retrofit2.http.GET

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quotesApi = RetrofitHelper.getInstance().create<QuotesAPI>()
        // launching a new coroutine
        GlobalScope.launch {
            val result = quotesApi.getQuote()
            if (result != null)
            // Checking the results
                Log.d("result: ", result.body().toString())
        }

    }

}