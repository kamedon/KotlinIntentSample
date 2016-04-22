package com.kamedon.kotlinintentsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import com.kamedon.kotlinintentsample.ex.go
import com.kamedon.kotlinintentsample.page.Page

/**
 * Created by h_kamei on 2016/04/22.
 */
class SecondActivity : AppCompatActivity() {
    val btn: Button by lazy {
        findViewById(R.id.btn) as Button
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btn.text = getString(R.string.go, Page.MAIN.name(resources))
        btn.setOnClickListener {
            go(Page.MAIN)
            finish()
        }
        intent?.extras?.getString("hoge")?.let {
            Toast.makeText(applicationContext, it, Toast.LENGTH_SHORT).show()
        }
    }


}
