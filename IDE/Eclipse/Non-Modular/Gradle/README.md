## Non-modular samples for Eclipse

JavaFX 13 samples to run from Eclipse with different options and build tools

Version Eclipse: 2019-03 (4.11.0)

Download [JDK 11 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory.

**N.B**: If you use JDK 12, install this patch from MarketPlace: `Java 12 support for Eclipse 2019-03 (4.11)`.

### Gradle

Clone the sample, add a `gradle.properties` file with this property:

    org.gradle.java.home=/path/to/JDK

Open it with Eclipse and refresh the Gradle project. 

Run with Run configurations -> Gradle Project -> hellofx
