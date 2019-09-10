# samples

JavaFX 13 samples to run with different options and build tools.

Download [JDK 11 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory. 

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

