## Modular samples for IntelliJ

JavaFX 13 samples to run from IntelliJ with different options and build tools

Version IntelliJ IDEA 20189.1

Download [JDK 11 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory. 

Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

### Gradle

Clone the sample, open it with IntelliJ and import the Gradle changes. Build and run
from the Gradle window. 

To create custom JRE you can use the `org.beryx.jlink` plugin. 
To create and run the custom runtime image:

#### Linux / Mac

On Linux or Mac run:

    ./gradlew jlink
    build/image/bin/hellofx

#### Windows

On Windows, run:

    gradlew jlink
    build\image\bin\hellofx
