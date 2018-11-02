# samples

JavaFX 11 samples to run with different options and build tools.

Download an appropriate JDK 11 for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

## Non-modular - Maven

`hellofx` sample non-modular project to run with Maven

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd Non-modular/Maven/hellofx
    
To run the project:
    
    mvn compile exec:java

To create a fat jar:

    mvn compile package
    java -jar shade/hellofx.jar


### Windows

If you run on Windows, follow these steps:

    cd Non-modular\Maven\hellofx

To run the project:
    
    mvn compile exec:java

To create a fat jar:

    mvn compile package
    java -jar shade\hellofx.jar

