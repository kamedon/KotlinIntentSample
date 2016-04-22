package com.kamedon.kotlinintentsample.page

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import com.kamedon.kotlinintentsample.MainActivity
import com.kamedon.kotlinintentsample.R
import com.kamedon.kotlinintentsample.SecondActivity
import com.kamedon.kotlinintentsample.ThirdActivity

/**
 * Created by h_kamei on 2016/04/22.
 */
enum class Page(val nameId: Int, val page: Class<out Activity>) {
    MAIN(R.string.page_main, MainActivity::class.java) {
        override fun intent(context: Context): Intent {
            return super.intent(context).apply { addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)  }
        }
    },
    SECOND(R.string.page_second, SecondActivity::class.java),
    THIRD(R.string.page_third, ThirdActivity::class.java);

    open fun intent(context: Context) = Intent(context, page)
    fun name(resources: Resources) = resources.getString(nameId)

}
