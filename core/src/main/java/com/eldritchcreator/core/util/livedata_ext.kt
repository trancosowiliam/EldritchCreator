package com.eldritchcreator.core.util

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

fun <T> LiveData<T>.observe(fragment: Fragment, action: (T) -> Unit) {
    observe(fragment.viewLifecycleOwner, Observer {
        action(it)
    })
}