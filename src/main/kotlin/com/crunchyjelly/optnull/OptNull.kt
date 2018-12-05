package com.crunchyjelly.optnull

import java.util.*

fun <T> T?.toOptional() : Optional<T> = Optional.ofNullable(this)

fun <T> Optional<T>.toNullable() : T? = orElse(null)
