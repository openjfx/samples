## Modular samples for Eclipse

JavaFX 12 samples to run from Eclipse with different options and build tools

Version Eclipse: 2019-03 (4.11.0)

Install this patch from MarketPlace: `Java 12 support for Eclipse 2019-03 (4.11)`.

Download an appropriate [JDK 12](https://jdk.java.net/12/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 12 installation directory. 

### Java

- Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

Clone the sample and open the project with Eclipse. 

Run with `Run configurations -> Java Application -> modHelloFX`

To create and run a custom JRE, from terminal:

On Linux or Mac run:

    cd IDE/Eclipse/Modular/Java/HelloFX
    export PATH_TO_FX_MODS=path/to/javafx-jmods-12
    $JAVA_HOME/bin/jlink --module-path $PATH_TO_FX_MODS:bin/hellofx --add-modules=hellofx --output jre
    jre/bin/java -m hellofx/org.openjfx.MainApp

On Windows run:

    cd IDE\Eclipse\Modular\Java\HelloFX
    set PATH_TO_FX_MODS="path\to\javafx-jmods-12"
    jlink --module-path "%PATH_TO_FX_MODS%;bin\hellofx" --add-modules=hellofx --output jre
    jre\bin\java -m hellofx/org.openjfx.MainApp
