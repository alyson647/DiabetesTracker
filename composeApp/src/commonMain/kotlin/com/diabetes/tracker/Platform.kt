package com.diabetes.tracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform