import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    application
}
group = "com.olegchir"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    testImplementation(kotlin("test-junit5"))
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
application {
    mainClassName = "MainKt"
}

tasks.register<Jar>("uberJar") {
    archiveClassifier.set("uber")

    manifest {
        attributes(
            "Main-Class" to "MainKt",
            "Implementation-Title" to "Gradle",
            "Implementation-Version" to archiveVersion
        )
    }

    from(sourceSets.main.get().output)

    dependsOn(configurations.runtimeClasspath)
    from({
        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
    })
}
