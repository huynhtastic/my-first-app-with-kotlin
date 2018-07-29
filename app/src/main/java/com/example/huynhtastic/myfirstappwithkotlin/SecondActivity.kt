package com.example.huynhtastic.myfirstappwithkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.textViewLabel
import kotlinx.android.synthetic.main.activity_second.textViewRandom
import java.util.Random

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    fun showRandomNumber() {
        val maxRandom: Int = intent.getIntExtra("total_count", 0)
        val randomResult: Int = Random().nextInt(maxRandom + 1)
        textViewRandom.text = randomResult.toString()
        textViewLabel.text = getString(R.string.random_heading, maxRandom)
    }
}
