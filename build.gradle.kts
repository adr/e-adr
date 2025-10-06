import com.vanniktech.maven.publish.JavaLibrary
import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("java-library")
    id("java")
    id("com.vanniktech.maven.publish") version "0.32.0"
}

repositories {
    mavenCentral()
}

group = "io.github.adr"

var version: String = project.findProperty("projVersion")?.toString() ?: "2.0.0"
if (project.findProperty("tagbuild")?.toString() != "true") {
    version += "-SNAPSHOT"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
        vendor = JvmVendorSpec.ADOPTIUM
    }
}

tasks.withType<JavaCompile>().configureEach {
    options.release = 17
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.13.3")
    testImplementation("org.junit.platform:junit-platform-launcher:1.13.4")
}

tasks.test {
  useJUnitPlatform()
}

mavenPublishing {
  configure(JavaLibrary(
    // configures the -javadoc artifact, possible values:
    // - `JavadocJar.None()` don't publish this artifact
    // - `JavadocJar.Empty()` publish an emprt jar
    // - `JavadocJar.Javadoc()` to publish standard javadocs
    javadocJar = JavadocJar.Javadoc(),
    // whether to publish a sources jar
    sourcesJar = true,
  ))

  publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

  signAllPublications()

  coordinates("io.github.adr", "e-adr", version)

  pom {
    name.set("e-adr")
    description.set("Architectural Decision Records embedded in Java code")
    inceptionYear.set("2017")
    url.set("https://github.com/adr/e-addr/")
    licenses {
      license {
        name.set("EPL-2.0")
      }
    }
    developers {
      developer {
        id.set("koppor")
        name.set("Oliver Kopp")
        url.set("https://github.com/koppor/")
      }
    }
    scm {
        url.set("https://github.com/adr/e-adr")
        connection.set("scm:git:https://github.com/adr/e-adr.git")
        developerConnection.set("scm:git:github.com:adr/e-adr.git")
    }
  }
}

// Include the BOM in the generated POM ("inline" / "inlining")
// Source: https://github.com/gradle/gradle/issues/10861#issuecomment-3027387345
publishing.publications.withType<MavenPublication>().configureEach {
    versionMapping {
        allVariants { fromResolutionResult() }
    }
}
