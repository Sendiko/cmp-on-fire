package com.sendiko.composeonfire

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform