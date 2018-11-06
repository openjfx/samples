# samples for IntelliJ

JavaFX 11 samples to run from IntelliJ with different options and build tools

Version IntelliJ IDEA 2018.2.5

Download an appropriate [JDK 11](https://jdk.java.net/11/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

## Ant

Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

Clone the sample, open it with IntelliJ, and make sure the paths for Java 11 and 
JavaFX 11 match those on your machine.

## Maven

Clone the sample, open it with IntelliJ and import the Maven changes. Compile or run
from the Maven Projects window.

## Gradle

Clone the sample, open it with IntelliJ and import the Gradle changes. Build or run
from the Gradle window.

## Modular

### Gradle

- Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

- Add `org.gradle.java.home` to a `gradle.properties` file, with the path to JDK 11, and
 `path.to.fx.mods` to a `gradle.properties` file, with the path to JDK jmods. This file 
can be part of the project or under the gradle user home `USER_HOME/.gradle`. 

Clone the sample, open it with IntelliJ and import the Gradle changes. Build and run
from the Gradle window. Run the `jlink` task to create a custom runtime image:

Run:

    hellofx/bin/java -m hellofx/org.openjfx.MainApp
