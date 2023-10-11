## Student

Name: Daniel Janzen

Matrikelnumber: 7218230

## Description

This Project is the Implementation of Homework 3.
It uses the create file methods of Homework 2 and the new `showCharacteristics()` method to fill the files.

The `Car` class is replaced by the `Vehicle` class getting attributes from Engine and Manufacture.

The new car `Arrays` have instances of the different `Vehicles` (BEV, ICEV, HybridV) and are beeing combined to a single
car `array` to iterate over them.

## Development Enviroment

This project is coded in Visual Studio Code as the IDE.
For easier use the Java Extension Pack is installed: https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack

Java Version (JDK):
openjdk 17.0.8.1 2023-08-24
OpenJDK Runtime Environment Temurin-17.0.8.1+1 (build 17.0.8.1+1)
OpenJDK 64-Bit Server VM Temurin-17.0.8.1+1 (build 17.0.8.1+1, mixed mode)

Futhermore you need the `Apache Commen Lang 3 Library` to use the `ArrayUtils`. (https://commons.apache.org/proper/commons-lang/javadocs/api-release/index.html)
You can find the `.jar` file inside the `lib` folder. Or download here: https://commons.apache.org/proper/commons-lang/download_lang.cgi

If you have the Java Extension Pack installed you can add the Library to the Referenced Libraries under the `JAVA PROJECTS`.
Otherwise you need to change the import to reference the `commons-lang3-3.13.0.jar` file.
