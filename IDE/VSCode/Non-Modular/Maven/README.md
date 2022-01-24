## Non-modular samples for Visual Studio Code

JavaFX 17 samples to run from Visual Studio Code with different options and build tools.

Version Visual Studio Code: 1.63.0 or higher.

Download [JDK 11 or later](http://jdk.java.net/) for your operating system. Make sure `JAVA_HOME` is properly set to the JDK installation directory.

### Maven

For the first time only:

- Make sure you have the [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) installed in your Visual Studio Code.

- Clone the sample, open the folder `hellofx` in Visual Studio Code.

#### Run the JavaFX Application

To run the JavaFX application, you can open the `Maven` explorer, expand `hellofx` > `Plugins` > `javafx` and run the Maven goal: `javafx:run`

![Run](./run.png)

Or alternatively run from terminal: `mvn javafx:run`
