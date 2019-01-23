## Non-modular samples for Eclipse

JavaFX 11 samples to run from Eclipse with different options and build tools

Version Eclipse: 2018-12 (4.10.0)

Download an appropriate [JDK 11](https://jdk.java.net/11/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

Note: If you get this message when you add JDK 11:
 
> You selected a JRE that this version of Eclipse JDT does not yet support fully. Some of the features may not work as expected.

then install this patch from MarketPlace: `Java 11 support for Eclipse 2018-09 (4.9)`.

### Gradle

For the first time only:

- Make sure you have the Buildship Gradle Integration 3.0 plugin installed. Update to 3.0.0 version
from this [URL](http://download.eclipse.org/buildship/updates/e410/snapshots/3.x/).

- Add `org.gradle.java.home` to a `gradle.properties` file, with the path to JDK 11. This file 
can be part of the project or under the gradle user home `USER_HOME/.gradle`. 

Clone the sample, open it with Eclipse and refresh the Gradle project. 

Run with Run configurations -> Gradle Project -> hellofx
