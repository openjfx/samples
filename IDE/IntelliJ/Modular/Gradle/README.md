## Modular samples for IntelliJ

JavaFX 11 samples to run from IntelliJ with different options and build tools

Version IntelliJ IDEA 2018.3.3

Download an appropriate [JDK 11](https://jdk.java.net/11/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

### Gradle

- Add `org.gradle.java.home` to a `gradle.properties` file, with the path to JDK 11, and
 `path.to.fx.mods` to a `gradle.properties` file, with the path to JDK jmods. This file 
can be part of the project or under the gradle user home `USER_HOME/.gradle`. 

Clone the sample, open it with IntelliJ and import the Gradle changes. Build and run
from the Gradle window. Run the `jlink` task to create a custom runtime image:

#### Linux / Mac

On Linux or Mac run:

    build/hellofx/bin/java -m hellofx/org.openjfx.MainApp

#### Windows

On Windows, run:

    build\hellofx\bin\java -m hellofx/org.openjfx.MainApp
