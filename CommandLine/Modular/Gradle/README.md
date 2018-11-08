# samples

JavaFX 11 samples to run with different options and build tools.

Download an appropriate [JDK 11](https://jdk.java.net/11/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

## Modular - Gradle

`hellofx` sample modular project to run with Gradle

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd CommandLine/Modular/Gradle/hellofx
    
To run the project:
    
    ./gradlew run

To create custom JRE:

Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

    export PATH_TO_FX_MODS=path/to/javafx-jmods-11
    ./gradlew jlink
    build/hellofx/bin/java -m hellofx/hellofx.HelloFX 


### Windows

If you run on Windows, follow these steps:

    cd CommandLine\Modular\Gradle\hellofx

To run the project:
    
    gradlew run

To create custom JRE:

Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

    export PATH_TO_FX_MODS=path/to/javafx-jmods-11
    gradlew jlink
    build\hellofx\bin\java -m hellofx/hellofx.HelloFX 
