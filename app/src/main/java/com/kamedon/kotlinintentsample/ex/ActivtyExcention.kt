package com.kamedon.kotlinintentsample.ex

import android.app.Activity
import android.content.Intent
import com.kamedon.kotlinintentsample.page.Page

/**
 * Created by h_kamei on 2016/04/22.
 */

inline fun Activity.go(page: Page, f: (intent: Intent) -> Intent) = startActivity(page.intent(applicationContext, f))

inline fun Activity.go(page: Page) = startActivity(page.intent(applicationContext))
