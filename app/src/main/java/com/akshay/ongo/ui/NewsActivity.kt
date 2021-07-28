package com.akshay.ongo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.akshay.ongo.R
import kotlinx.android.synthetic.main.acitivity_news.*

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitivity_news)

        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}