## Modular samples for Eclipse

JavaFX 11 samples to run from Eclipse with different options and build tools

Version Eclipse 2018-09 (4.9) Build id: I20180906-0745.

Download an appropriate [JDK 11](https://jdk.java.net/11/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

Note: If you get this message when you add JDK 11:
 
> You selected a JRE that this version of Eclipse JDT does not yet support fully. Some of the features may not work as expected.

then install this patch from MarketPlace: `Java 11 support for Eclipse 2018-09 (4.9)`.

### Java

- Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

Clone the sample, edit the file `.settings/modHelloFX.launch` and change the value for
`org.eclipse.jdt.launching.MODULE_CLI_OPTIONS` to:

On Linux, Mac:

    value="--module-path path/to/javafx-sdk-11/lib:hellofx"

On Windows:

    value="--module-path path\to\javafx-sdk-11\lib;hellofx"


Open the project with Eclipse.

Run with `Run configurations -> Java Application -> modHelloFX`

To create and run a custom JRE, from terminal:

On Linux or Mac run:

    cd IDE/Eclipse/Modular/Java/HelloFX
    export PATH_TO_FX_MODS=path/to/javafx-jmods-11
    $JAVA_HOME/bin/jlink --module-path $PATH_TO_FX_MODS:hellofx --add-modules=hellofx --output jre
    jre/bin/java -m hellofx/org.openjfx.MainApp

On Windows run:

    cd IDE\Eclipse\Modular\Java\HelloFX
    set PATH_TO_FX_MODS="path\to\javafx-jmods-11"
    jlink --module-path "%PATH_TO_FX_MODS%;hellofx" --add-modules=hellofx --output jre
    jre\bin\java -m hellofx/org.openjfx.MainApp