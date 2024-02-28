plugins {
    kotlin("jvm") version "1.9.22"
    jacoco
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport) // report is always generated after tests run
}

kotlin {
    jvmToolchain(11)
}

tasks.jacocoTestReport {
    reports {
        xml.required = true
    }
}
