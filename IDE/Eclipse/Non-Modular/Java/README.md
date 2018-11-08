## Non-modular samples for Eclipse

JavaFX 11 samples to run from Eclipse with different options and build tools

Version Eclipse 2018-09 (4.9) Build id: I20180906-0745.

Download an appropriate [JDK 11](https://jdk.java.net/11/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

Note: If you get this message when you add JDK 11:
 
> You selected a JRE that this version of Eclipse JDT does not yet support fully. Some of the features may not work as expected.

then install this patch from MarketPlace: `Java 11 support for Eclipse 2018-09 (4.9)`.

### Java

For the first time only:

- Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

- Open Eclipse and create a string substitution variable under `Preferences->Run/Debug->String Substitution`, named `PATH_TO_FX` and
pointing to the JavaFX 11 lib folder. 

- Create a User Library under `Eclipse -> Window -> Preferences -> Java -> Build Path -> User Libraries -> New`.
Name it `JavaFX11` and include the jars under the lib folder from JavaFX 11.

Clone the sample, open it with Eclipse, and make sure the paths for Java 11 and 
JavaFX 11 match those on your machine.

Build the project and run with Run configurations-> Java Application -> HelloFX.

Note: Edit Run configurations... -> Arguments and make sure the option:
 
> Use the -XstartOnFirstThread argument when launching with SWT 

is not selected.