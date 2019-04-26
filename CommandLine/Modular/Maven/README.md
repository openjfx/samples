# samples

JavaFX 12 samples to run with different options and build tools.

Download an appropriate [JDK 12](https://jdk.java.net/12/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 12 installation directory. 

## Modular - Maven

`hellofx` sample modular project to run with Maven

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd CommandLine/Modular/Maven/hellofx
    mvn clean javafx:run

To create and run a custom JRE:

    cd CommandLine/Modular/Maven/hellofx
    mvn clean javafx:jlink
    target/hellofx/bin/launcher

### Windows

If you run on Windows, follow these steps:

    cd CommandLine\Modular\Maven\hellofx
    mvn clean javafx:run

To create and run a custom JRE:

    cd CommandLine/Modular/Maven/hellofx
    mvn clean javafx:jlink
    target\hellofx\bin\launcher