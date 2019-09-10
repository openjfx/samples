## Modular samples for Eclipse

JavaFX 13 samples to run from Eclipse with different options and build tools

Version Eclipse: 2019-03 (4.11.0)

Download [JDK 11 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory.

**N.B**: If you use JDK 12, install this patch from MarketPlace: `Java 12 support for Eclipse 2019-03 (4.11)`.

### Gradle

For the first time only:

- Make sure you have the Buildship Gradle Integration 3.0 plugin installed.

- Add `org.gradle.java.home` to a `gradle.properties` file, with the path to JDK. This file 
can be part of the project or under the gradle user home `USER_HOME/.gradle`. 

Clone the sample, open it with Eclipse and refresh the Gradle project. 

Run from Gradle Tasks -> `application -> run`.

Run from Gradle Tasks -> `other -> jlink` to create a custom runtime. 

#### Linux / Mac

On Linux or Mac run:

    build/image/bin/hellofx

#### Windows

On Windows, run:

    build\image\bin\hellofx
