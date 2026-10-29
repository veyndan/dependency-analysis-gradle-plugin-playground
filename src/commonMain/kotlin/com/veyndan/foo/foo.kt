package com.veyndan.foo

import com.veyndan.bar.bar
import kotlinx.coroutines.flow.map

fun foo() {
    bar().map { it }
}
