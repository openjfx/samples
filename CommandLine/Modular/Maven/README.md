# samples

JavaFX samples to run with different options and build tools.

Download [JDK 17 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory. 

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