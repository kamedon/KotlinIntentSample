package com.kamedon.kotlinintentsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.kamedon.kotlinintentsample.ex.go
import com.kamedon.kotlinintentsample.page.Page

class MainActivity : AppCompatActivity() {
    val btn: Button by lazy {
        findViewById(R.id.btn) as Button
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.text = getString(R.string.go, Page.SECOND.name(resources))
        btn.setOnClickListener {
            go(Page.SECOND) {
                it.putExtra("hoge", "hoge")
            }
        }
    }
}
