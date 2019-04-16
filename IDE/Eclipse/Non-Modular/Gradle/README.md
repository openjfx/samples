## Non-modular samples for Eclipse

JavaFX 12 samples to run from Eclipse with different options and build tools

Version Eclipse: 2019-03 (4.11.0)

Install this patch from MarketPlace: `Java 12 support for Eclipse 2019-03 (4.11)`.

Download an appropriate [JDK 12](https://jdk.java.net/12/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 12 installation directory. 

### Gradle

Clone the sample, add a `gradle.properties` file with this property:

    org.gradle.java.home=/path/to/Java/12

Open it with Eclipse and refresh the Gradle project. 

Run with Run configurations -> Gradle Project -> hellofx
