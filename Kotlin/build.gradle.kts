plugins {
    kotlin("jvm") version "1.9.0"
    application
    id("org.openjfx.javafxplugin") version "0.0.13"
}

javafx {
    setVersion("20")
    setModules(listOf("javafx.controls"))
}

group = "com.andmal"
version = "0.0.2"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(20)
}

application {
    mainClass.set("Main")
}