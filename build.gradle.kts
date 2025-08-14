plugins {
    application
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

repositories {
    mavenCentral()
}

dependencies {
    // Local DB for logs/spots
    implementation("org.xerial:sqlite-jdbc:3.46.0.0")
    // JSON for API parsing (weather/tides later)
    implementation("com.google.code.gson:gson:2.11.0")
}

application {
    // must match your package + class
    mainClass.set("app.Main")
}

java {
    toolchain {
        languageVersion.set(org.gradle.jvm.toolchain.JavaLanguageVersion.of(21))
    }
}


// Make the jar runnable and compatible with Shadow fat jar
tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "app.Main"
    }
}
