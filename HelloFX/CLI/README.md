# HelloFX Sample

JavaFX 13 HelloFX sample to run with different options and build tools.

Download [JDK 11 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory. 

## CLI

Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd HelloFX/CLI/hellofx
    export PATH_TO_FX=path/to/javafx-sdk-13/lib

Compile:

    javac --module-path $PATH_TO_FX --add-modules javafx.controls HelloFX.java

Run:

    java --module-path $PATH_TO_FX --add-modules javafx.controls HelloFX

### Windows

If you run on Windows, follow these steps:

    cd HelloFX\CLI\hellofx
    Set-Variable -Name PATH_TO_FX -Value "path\to\javafx-sdk-13\lib"

Compile:

    javac --module-path $PATH_TO_FX --add-modules javafx.controls HelloFX.java

Run:
    
    java --module-path $PATH_TO_FX --add-modules javafx.controls HelloFX
