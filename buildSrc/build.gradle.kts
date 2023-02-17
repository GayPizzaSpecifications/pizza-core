plugins {
  `kotlin-dsl`
}

repositories {
  gradlePluginPortal()
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
  implementation("org.jetbrains.kotlin:kotlin-serialization:1.8.10")

  implementation("gradle.plugin.com.github.johnrengelman:shadow:7.1.2")
}
