## Modular samples for NetBeans

JavaFX 11 samples to run from NetBeans with different options and build tools

Version NetBeans [10vc2](https://dist.apache.org/repos/dist/dev/incubator/netbeans/incubating-netbeans/incubating-10.0-vc2/incubating-netbeans-10.0-vc2-bin.zip)

Download an appropriate [JDK 11](https://jdk.java.net/11/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

The samples assume NetBeans 10 runs on JDK 11 (this can be set editing the `etc/netbeans.conf` file
and setting `netbeans_jdkhome="/path/to/jdk11"`).

Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

### Gradle

For the first time only:

- Install manually the Gradle plugin for NetBeans 2.0.1 from the 
[GitHub repository](https://github.com/kelemen/netbeans-gradle-project/releases).

- Add `org.gradle.java.home` to a `gradle.properties` file, with the path to JDK 11, and
 `path.to.fx.mods` to a `gradle.properties` file, with the path to JDK jmods. This file 
can be part of the project or under the gradle user home `USER_HOME/.gradle`. 

Clone the sample, open it with NetBeans and reload the project. Build and run
from the Tasks context-menu. Run the `jlink` task to create a custom runtime image:

#### Linux / Mac

On Linux or Mac run:

    build/hellofx/bin/java -m hellofx/org.openjfx.MainApp

#### Windows

On Windows, run:

    build\hellofx\bin\java -m hellofx/org.openjfx.MainApp
