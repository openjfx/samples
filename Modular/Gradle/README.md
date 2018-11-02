# samples

JavaFX 11 samples to run with different options and build tools.

## Modular - Gradle

`hellofx` sample modular project to run with Gradle

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd Modular/Gradle/hellofx
    
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

    cd Modular\Gradle\hellofx

To run the project:
    
    gradlew.bat run

To create custom JRE:

Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

    export PATH_TO_FX_MODS=path/to/javafx-jmods-11
    gradlew.bat jlink
    build\hellofx\bin\java -m hellofx/hellofx.HelloFX 
