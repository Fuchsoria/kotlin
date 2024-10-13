plugins {
    kotlin("jvm")
}

dependencies {
    implementation(projects.m2l6Gradle.sub1.subsub1)
    implementation(projects.m2l6Gradle.sub1.subsub2)
}

repositories {
    mavenCentral()
}