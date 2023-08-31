## Non-modular samples for Eclipse

JavaFX samples to run from Eclipse with different options and build tools

Download [JDK 17 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory.


### Gradle

Clone the sample, add a `gradle.properties` file with this property:

    org.gradle.java.home=/path/to/JDK

Open it with Eclipse and refresh the Gradle project. 

Run with Run configurations -> Gradle Project -> hellofx
