## Modular samples for Eclipse

JavaFX 12 samples to run from Eclipse with different options and build tools

Version Eclipse: 2019-03 (4.11.0)

Install this patch from MarketPlace: `Java 12 support for Eclipse 2019-03 (4.11)`.

Download an appropriate [JDK 12](https://jdk.java.net/12/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 12 installation directory. 

### Maven

For the first time only:

- Make sure you have the Maven Integration for Eclipse m2e plugin installed.

- Add the JavaFX Maven archetypes `org.openjfx:javafx-archetype-simple:0.0.1` and `org.openjfx:javafx-archetype-fxml:0.0.1`

Clone the sample, open it with Eclipse, and make sure the paths for Java 12 and 
JavaFX 12 match those on your machine.

Run with `Run configurations -> Maven Build -> hellofx`.

As well, this will work from the terminal:

    mvn clean javafx:run
    
Note: on Windows, under Eclipse running Oracle JDK 1.8, you need to add `-Djava.library.path=C:\` 
to the JavaFX maven plugin:

    <configuration>
        <executable>/path/to/Java/12/bin/java</executable>
        <options>
            <option>-Djava.library.path=C:\tmp</option>
        </options>
        <mainClass>hellofx/org.openjfx.hellofx.App</mainClass>
    </configuration>
    
    
#### Custom Runtime
    
To create and run a custom JRE, from terminal:

On Linux or Mac run:

    cd IDE/Eclipse/Modular/Maven/hellofx
    mvn clean package
    export PATH_TO_FX_MODS=path/to/javafx-jmods-12
    $JAVA_HOME/bin/jlink --module-path $PATH_TO_FX_MODS:target/hellofx-0.0.1-SNAPSHOT.jar --add-modules=hellofx --output jre
    jre/bin/java -m hellofx/org.openjfx.hellofx.App

On Windows run:

    cd IDE\Eclipse\Modular\Maven\hellofx
    mvn clean package
    set PATH_TO_FX_MODS="path\to\javafx-jmods-12"
    jlink --module-path "%PATH_TO_FX_MODS%;target\hellofx-0.0.1-SNAPSHOT.jar" --add-modules=hellofx --output jre
    jre\bin\java -m hellofx/org.openjfx.hellofx.App
