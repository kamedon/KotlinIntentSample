package com.kamedon.kotlinintentsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import com.kamedon.kotlinintentsample.ex.go
import com.kamedon.kotlinintentsample.page.Page

class MainActivity : AppCompatActivity() {
    val btnSecond: Button by lazy {
        findViewById(R.id.btnSecond) as Button
    }

    val btnThird: Button by lazy {
        findViewById(R.id.btnThird) as Button
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSecond.text = getString(R.string.go, Page.SECOND.name(resources))
        btnSecond.setOnClickListener {
            //値をつける
            go(Page.SECOND) {
                it.putExtra("hoge", "hoge")
            }
        }

        btnThird.text = getString(R.string.go, Page.SECOND.name(resources))
        btnThird.setOnClickListener {
            //ノーマルな遷移
            go(Page.THIRD)
        }
    }

    override fun onStart() {
        super.onStart()
        intent?.extras?.getString("msg").let{
            Toast.makeText(applicationContext,it,Toast.LENGTH_SHORT).show()
        }
    }
}
