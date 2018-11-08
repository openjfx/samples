## Non-modular samples for Eclipse

JavaFX 11 samples to run from Eclipse with different options and build tools

Version Eclipse 2018-09 (4.9) Build id: I20180906-0745.

Download an appropriate [JDK 11](https://jdk.java.net/11/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

Note: If you get this message when you add JDK 11:
 
> You selected a JRE that this version of Eclipse JDT does not yet support fully. Some of the features may not work as expected.

then install this patch from MarketPlace: `Java 11 support for Eclipse 2018-09 (4.9)`.

### Maven

For the first time only:

- Make sure you have the Maven Integration for Eclipse m2e plugin installed.

Clone the sample, open it with Eclipse and import the Maven changes. 

Run with `Run configurations -> Maven Build -> hellofx`.

Note: on Windows, under Eclipse running Oracle JDK 1.8, you need to add `-Djava.library.path=C:\` 
to the `Run configuration... -> Maven Build -> hellofx -> JRE -> VM arguments`.