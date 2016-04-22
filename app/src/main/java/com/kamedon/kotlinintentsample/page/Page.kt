package com.kamedon.kotlinintentsample.page

import android.app.Activity
import android.content.res.Resources
import com.kamedon.kotlinintentsample.MainActivity
import com.kamedon.kotlinintentsample.R
import com.kamedon.kotlinintentsample.SecondActivity

/**
 * Created by h_kamei on 2016/04/22.
 */
enum class Page(val nameId: Int, val c: Class<out Activity>) {
    MAIN(R.string.page_main, MainActivity::class.java), SECOND(R.string.page_second, SecondActivity::class.java);

    fun name(resources: Resources) = resources.getString(nameId)

}
