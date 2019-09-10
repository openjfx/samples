## Modular samples for IntelliJ

JavaFX 13 samples to run from IntelliJ with different options and build tools

Version IntelliJ IDEA 2019.1

Download [JDK 11 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory. 

Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

### Java

Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

Clone the sample, open it with IntelliJ, and make sure the paths for JDK and JavaFX match those on your machine.

Define the following Path Variables in Preferences/Settings: 
 - name `PATH_TO_FX`, value `path/to/javafx-sdk-13/lib`
 - name `PATH_SEPARATOR`, value `:` on Linux/Mac, `;` on Windows.

Run the `runHelloFX` configuration.

To create and run a custom JRE, from terminal:

On Linux or Mac run:

    cd IDE/IntelliJ/Modular/Java/hellofx
    export PATH_TO_FX_MODS=path/to/javafx-jmods-13
    $JAVA_HOME/bin/jlink --module-path $PATH_TO_FX_MODS:mods/production --add-modules hellofx --output jre
    jre/bin/java -m hellofx/org.openjfx.MainApp

On Windows run:

    cd IDE\IntelliJ\Modular\Java\hellofx
    set PATH_TO_FX_MODS="path\to\javafx-jmods-13"
    jlink --module-path "%PATH_TO_FX_MODS%;mods\production" --add-modules hellofx --output jre
    jre\bin\java -m hellofx/org.openjfx.MainApp