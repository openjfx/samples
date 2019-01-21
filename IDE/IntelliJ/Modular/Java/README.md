## Modular samples for IntelliJ

JavaFX 11 samples to run from IntelliJ with different options and build tools

Version IntelliJ IDEA 2018.3.3

Download an appropriate [JDK 11](https://jdk.java.net/11/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

### Java

Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

Clone the sample, open it with IntelliJ, and make sure the paths for Java 11 and 
JavaFX 11 match those on your machine.

Define a Path Variable in Preferences/Settings: name `PATH_SEPARATOR`, value `:` on Linux/Mac, `;` on Windows.

Run the `runHelloFX` configuration.

To create and run a custom JRE, from terminal:

On Linux or Mac run:

    cd IDE/IntelliJ/Modular/Java/hellofx
    export PATH_TO_FX_MODS=path/to/javafx-jmods-11.0.2
    $JAVA_HOME/bin/jlink --module-path $PATH_TO_FX_MODS:mods/production --add-modules=hellofx --output jre
    jre/bin/java -m hellofx/org.openjfx.MainApp

On Windows run:

    cd IDE\IntelliJ\Modular\Java\hellofx
    set PATH_TO_FX_MODS="path\to\javafx-jmods-11.0.2"
    jlink --module-path "%PATH_TO_FX_MODS%;mods\production" --add-modules=hellofx --output jre
    jre\bin\java -m hellofx/org.openjfx.MainApp