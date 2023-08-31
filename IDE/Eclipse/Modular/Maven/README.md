## Modular samples for Eclipse

JavaFX samples to run from Eclipse with different options and build tools

Download [JDK 17 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory.

### Maven

For the first time only:

- Make sure you have the Maven Integration for Eclipse m2e plugin installed.

- Add the JavaFX Maven archetypes `org.openjfx:javafx-archetype-simple:0.0.1` and `org.openjfx:javafx-archetype-fxml:0.0.1`

Clone the sample, open it with Eclipse, and make sure the paths for JDK and 
JavaFX match those on your machine.

Run with `Run configurations -> Maven Build -> hellofx`.

As well, this will work from the terminal:

    mvn clean javafx:run
    
Note: on Windows, under Eclipse running Oracle JDK 1.8, you need to add `-Djava.library.path=C:\` 
to the JavaFX maven plugin:

    <configuration>
        <executable>/path/to/JDK/bin/java</executable>
        <options>
            <option>-Djava.library.path=C:\tmp</option>
        </options>
        <mainClass>hellofx/org.openjfx.hellofx.App</mainClass>
    </configuration>
    
    
#### Custom Runtime
    
To create and run a custom JRE, from terminal:

On Linux or Mac run:

    cd IDE/Eclipse/Modular/Maven/hellofx
    mvn clean javafx:jlink
    target/hellofx/bin/launcher

On Windows run:

    cd IDE\Eclipse\Modular\Maven\hellofx
    mvn clean javafx:jlink
    target\hellofx\bin\launcher
