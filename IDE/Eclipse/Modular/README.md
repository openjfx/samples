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

### Maven

Clone the sample, open it with Eclipse, and make sure the paths for Java 11 and 
JavaFX 11 match those on your machine.

Run with `Run configurations -> Maven Build -> hellofx`.

As well, this will work from the terminal on Linux or Mac:

    java --module-path $PATH_TO_FX:target/hellofx-1.0-SNAPSHOT.jar -m hellofx/org.openjfx.MainApp

or on Windows:
    
    java --module-path %PATH_TO_FX%:target\hellofx-1.0-SNAPSHOT.jar -m hellofx/org.openjfx.MainApp

To create and run a custom JRE, from terminal:

On Linux or Mac run:

    cd IDE/NetBeans/Modular/Maven/hellofx
    export PATH_TO_FX_MODS=path/to/javafx-jmods-11
    $JAVA_HOME/bin/jlink --module-path $PATH_TO_FX_MODS:target/hellofx-1.0-SNAPSHOT.jar --add-modules=hellofx --output jre
    jre/bin/java -m hellofx/org.openjfx.MainApp

On Windows run:

    cd IDE\NetBeans\Modular\Maven\hellofx
    set PATH_TO_FX_MODS="path\to\javafx-jmods-11"
    jlink --module-path "%PATH_TO_FX_MODS%;target\hellofx-1.0-SNAPSHOT.jar" --add-modules=hellofx --output jre
    jre\bin\java -m hellofx/org.openjfx.MainApp

### Gradle

For the first time only:

- Make sure you have the Buildship Gradle Integration 2.0 plugin installed. Update to 2.2.3 version
from this [URL](http://download.eclipse.org/buildship/updates/e48/snapshots/2.x/).

- Add `org.gradle.java.home` to a `gradle.properties` file, with the path to JDK 11, and
 `path.to.fx.mods` to a `gradle.properties` file, with the path to JDK jmods. This file 
can be part of the project or under the gradle user home `USER_HOME/.gradle`. 

- Add the `JavaFX11` library to the modulepath of the project.

Clone the sample, open it with Eclipse and refresh the Gradle project. 

Run with Run configurations -> Gradle Project -> hellofx