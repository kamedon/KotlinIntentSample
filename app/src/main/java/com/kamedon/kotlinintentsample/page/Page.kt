package com.kamedon.kotlinintentsample.page

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import com.kamedon.kotlinintentsample.MainActivity
import com.kamedon.kotlinintentsample.R
import com.kamedon.kotlinintentsample.SecondActivity

/**
 * Created by h_kamei on 2016/04/22.
 */
enum class Page(val nameId: Int, val page: Class<out Activity>) {
    MAIN(R.string.page_main, MainActivity::class.java) {
        override fun init(intent: Intent): Intent {
            return super.init(intent).apply { addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) }
        }
    },
    SECOND(R.string.page_second, SecondActivity::class.java);

    inline fun intent(context: Context, f: (intent: Intent) -> Intent) = init(Intent(context, page)).apply { f(this) }
    inline fun intent(context: Context) = init(Intent(context, page))

    open fun init(intent: Intent) = intent
    fun name(resources: Resources) = resources.getString(nameId)

}
