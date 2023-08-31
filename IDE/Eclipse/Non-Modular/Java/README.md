## Non-modular samples for Eclipse

JavaFX samples to run from Eclipse with different options and build tools

Download [JDK 17 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory.

### Java

For the first time only:

- Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

- Open Eclipse and create a string substitution variable under `Preferences->Run/Debug->String Substitution`, named `PATH_TO_FX` and
pointing to the JavaFX lib folder. 

- Create a User Library under `Eclipse -> Window -> Preferences -> Java -> Build Path -> User Libraries -> New`.
Name it `JavaFXSDK` and include the jars under the lib folder from JavaFX.

Clone the sample, open it with Eclipse, and make sure the paths for JDK and JavaFX match those on your machine.

Build the project and run with Run configurations-> Java Application -> HelloFX.

Note: Edit Run configurations... -> Arguments and make sure the option:
 
> Use the -XstartOnFirstThread argument when launching with SWT 

is not selected.