# samples

JavaFX 11 samples to run with different options and build tools.

Download an appropriate [JDK 11](https://jdk.java.net/11/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

## Modular - CLI

`hellofx` sample modular project to run on command line, without build tools

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd CommandLine/Modular/CLI/hellofx
    export PATH_TO_FX=path/to/javafx-sdk-11/lib
    export PATH_TO_FX_MODS=path/to/javafx-jmods-11
    javac --module-path $PATH_TO_FX -d mods/hellofx $(find src -name "*.java")
    
To run the project:
    
    java --module-path $PATH_TO_FX:mods -m hellofx/hellofx.HelloFX

To create and run a custom JRE:

    $JAVA_HOME/bin/jlink --module-path $PATH_TO_FX_MODS:mods --add-modules=hellofx --output hellofx
    hellofx/bin/java -m hellofx/hellofx.HelloFX

### Windows

If you run on Windows, follow these steps:

    cd CommandLine\Modular\CLI\hellofx
    set PATH_TO_FX="path\to\javafx-sdk-11\lib"
    set PATH_TO_FX_MODS="path\to\javafx-jmods-11"
    dir /s /b src\*.java > sources.txt & javac --module-path %PATH_TO_FX% -d mods/hellofx @sources.txt & del sources.txt

To run the project:
    
    java --module-path "%PATH_TO_FX%;mods" -m hellofx/hellofx.HelloFX

To create and run a custom JRE:

    jlink --module-path "%PATH_TO_FX_MODS%;mods" --add-modules=hellofx --output hellofx
    hellofx\bin\java -m hellofx/hellofx.HelloFX
