package org.example.aifighter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform