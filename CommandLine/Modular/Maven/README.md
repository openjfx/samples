# samples

JavaFX 12 samples to run with different options and build tools.

## Modular - Maven

`hellofx` sample modular project to run with Maven

Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd CommandLine/Modular/Maven/hellofx
    mvn clean package javafx:run

To create custom JRE:

    export PATH_TO_FX_MODS=path/to/javafx-jmods-12
    $JAVA_HOME/bin/jlink --module-path $PATH_TO_FX_MODS:target/hellofx-1.0-SNAPSHOT.jar --add-modules hellofx --output jre
    jre/bin/java -m hellofx/org.openjfx.MainApp

### Windows

If you run on Windows, follow these steps:

    cd CommandLine\Modular\Maven\hellofx
    mvn clean package javafx:run

To create custom JRE:

    set PATH_TO_FX_MODS="path\to\javafx-jmods-12"
    jlink --module-path "%PATH_TO_FX_MODS%;target\hellofx-1.0-SNAPSHOT.jar" --add-modules hellofx --output jre
    jre\bin\java -m hellofx/org.openjfx.MainApp