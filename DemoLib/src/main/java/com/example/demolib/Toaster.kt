package com.example.demolib

import android.content.Context
import android.widget.Toast

object Toaster {
    fun simpleToast(context: Context?, msg: String?) {
        Toast.makeText(context, "Helllo", Toast.LENGTH_LONG).show()
    }
}