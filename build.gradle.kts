import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.dokka.gradle.DokkaTaskPartial

plugins {
    kotlin("jvm") version "1.7.21"
    id("org.jetbrains.dokka") version "1.7.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")
    apply(plugin = "org.jetbrains.kotlin.jvm")
}

tasks.withType<DokkaTaskPartial>().configureEach {
    dokkaSourceSets.configureEach { reportUndocumented.set(true) }
}

tasks.withType<DokkaTask>().configureEach {
    dokkaSourceSets.configureEach { reportUndocumented.set(true) }
}
