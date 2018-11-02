# samples

JavaFX 11 samples to run with different options and build tools.

Download an appropriate JDK 11 for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

## Non-modular - Gradle

`hellofx` sample non-modular project to run with Gradle

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd Non-modular/Gradle/hellofx
    
To run the project:
    
    ./gradlew run

To create a fat jar:

    ./gradlew jar
    java -jar build/libs/hellofx.jar


### Windows

If you run on Windows, follow these steps:

    cd Non-modular\Gradle\hellofx

To run the project:
    
    gradlew.bat run

To create a fat jar:

    gradlew.bat jar
    java -jar build\libs\hellofx.jar

