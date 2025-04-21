package com.hangox.testlibrary

import android.content.Context
import android.widget.Toast

object ProjectBLibraryCode {

    fun run(context : Context) {
        Toast.makeText(context, "我是来自 ProjectB TestLibrary 的代码", Toast.LENGTH_SHORT).show()
    }
}