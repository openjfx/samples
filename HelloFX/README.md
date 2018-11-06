# HelloFX Sample

JavaFX 11 HelloFX sample to run with different options and build tools.

Download an appropriate [JDK 11](https://jdk.java.net/11/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

## Ant

Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

`hellofx` single class to run with Gradle

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd HelloFX/Ant/hellofx
    export PATH_TO_FX=path/to/javafx-sdk-11/lib

Compile:

    javac --module-path $PATH_TO_FX --add-modules=javafx.controls HelloFX.java

Run:

    java --module-path $PATH_TO_FX --add-modules=javafx.controls HelloFX

### Windows

If you run on Windows, follow these steps:

    cd HelloFX\Ant\hellofx
    set PATH_TO_FX="path\to\javafx-sdk-11\lib"
    javac --module-path %PATH_TO_FX% --add-modules=javafx.controls HelloFX.java

To run the project:
    
    java --module-path %PATH_TO_FX% --add-modules=javafx.controls HelloFX

## Maven

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd HelloFX/Maven/hellofx
    
To compilea and run the project:
    
    mvn compile exec:java

### Windows

If you run on Windows, follow these steps:

    cd HelloFX\Maven\hellofx

To run the project:
    
    mvn compile exec:java

## Gradle

If you run on Linux or Mac, follow these steps:

    cd HelloFX/Gradle/hellofx
    
To run the project:
    
    ./gradlew run

### Windows

If you run on Windows, follow these steps:

    cd Non-modular\Gradle\hellofx

To run the project:
    
    gradlew.bat run
