import org.gradle.kotlin.dsl.support.kotlinCompilerOptions

plugins {
    kotlin("jvm") apply false
}

group = "fuchsoria.dev.kotlin"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    group = rootProject.group
}
