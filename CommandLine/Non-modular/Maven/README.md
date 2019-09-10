# samples

JavaFX 13 samples to run with different options and build tools.

Download [JDK 11 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory. 

## Non-modular - Maven

`hellofx` sample non-modular project to run with Maven

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd CommandLine/Non-modular/Maven/hellofx
    
To run the project:
    
    mvn clean javafx:run

To create a fat jar:

    mvn compile package
    java -jar shade/hellofx.jar


### Windows

If you run on Windows, follow these steps:

    cd CommandLine\Non-modular\Maven\hellofx

To run the project:
    
    mvn compile exec:java

To create a fat jar:

    mvn compile package
    java -jar shade\hellofx.jar

