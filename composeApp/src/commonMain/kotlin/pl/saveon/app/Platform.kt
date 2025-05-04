package pl.saveon.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform