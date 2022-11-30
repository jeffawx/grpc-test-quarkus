import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    id("io.quarkus") version "2.14.3.Final"
    id("com.airwallex.grpc") version "1.4.2.1"
}

repositories {
    mavenLocal()
    maven("https://artistry.airwallex.com/repository/lib-release/libs-release-local")
    mavenCentral()
}

dependencies {
    implementation(platform("io.quarkus:quarkus-bom:2.14.3.Final"))
    implementation("io.quarkus:quarkus-kotlin")
    implementation("com.airwallex.grpc:quarkus-grpc-kotlin")
    implementation("org.jboss.logmanager:log4j2-jboss-logmanager")
}

group = "com.airwallex"
version = "1.0.0-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
}
