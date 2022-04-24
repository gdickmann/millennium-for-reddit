plugins {
    id("com.android.application") version "7.0.1" apply false
    id("com.android.library") version "7.0.1" apply false
    id("org.jetbrains.kotlin.android") version "1.5.20" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
