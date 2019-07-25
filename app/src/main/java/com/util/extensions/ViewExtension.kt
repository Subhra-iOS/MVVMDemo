
package com.util.extensions

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.content.ContextWrapper

fun View.getParentActivity(): AppCompatActivity?{
    var context = this.context
    while (context is ContextWrapper) {
        if (context is AppCompatActivity) {
            return context
        }
        context = context.baseContext
    }
    return null
}