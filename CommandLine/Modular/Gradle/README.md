# samples

JavaFX samples to run with different options and build tools.

Download [JDK 17 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory. 

## Modular - Gradle

`hellofx` sample modular project to run with Gradle

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd CommandLine/Modular/Gradle/hellofx
    
To run the project:
    
    ./gradlew run

To create custom JRE you can use the `org.beryx.jlink` plugin:

    ./gradlew jlink
    build/image/bin/hellofx

### Windows

If you run on Windows, follow these steps:

    cd CommandLine\Modular\Gradle\hellofx

To run the project:
    
    gradlew run

To create custom JRE with the `org.beryx.jlink` plugin:

    gradlew jlink
    build\image\bin\hellofx
