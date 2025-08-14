pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

// Allows Gradle to find & download JDKs automatically via Foojay
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "AquaTallyApp"
