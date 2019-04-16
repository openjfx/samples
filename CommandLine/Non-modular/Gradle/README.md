# samples

JavaFX 12 samples to run with different options and build tools.

Download an appropriate [JDK 12](https://jdk.java.net/12/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 12 installation directory. 

## Non-modular - Gradle

`hellofx` sample non-modular project to run with Gradle

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd CommandLine/Non-modular/Gradle/hellofx
    
To run the project:
    
    ./gradlew run

To create a fat jar:

    ./gradlew jar
    java -jar build/libs/hellofx.jar


### Windows

If you run on Windows, follow these steps:

    cd CommandLine\Non-modular\Gradle\hellofx

To run the project:
    
    gradlew run

To create a fat jar:

    gradlew jar
    java -jar build\libs\hellofx.jar

