plugins {
    kotlin("jvm") version "1.7.21"
}

group = "org.example"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

sourceSets {
    main {
        java.srcDir("src")
    }
    test {
        java.srcDir("test")
    }
}

kotlin {
    explicitApi()
}

tasks.test {
    useJUnitPlatform()
}