# PancakeWorldGenerator

**this branch is the ending point of a tutorial.**

Generates a flat Minecraft world. Requires [SpigotMC](https://www.spigotmc.org/) and [WorldGeneratorApi](https://github.com/rutgerkok/WorldGeneratorApi). This is both a sample from a tutorial, and an actually usable Spigot plugin to create a flat world.

## Building the project
Make sure you have downloaded this project. There's a `Clone or download` button near the top of this page. The follow one of the sub-sections below.

### Eclipse
Use `File` → `Import...` → `Maven` → `Existing Maven Projects`. Follow the remaining steps.

To create a JAR file, select the `pom.xml` file in the Package Explorer (that list of projects, classes and files on the left) and press the Play button. Choose `Maven Install` and press `Ok`. After Maven is done compiling, you'll end up with a JAR file in the (newly created) `target` folder. Place this file in the `plugins` directory of your server to run it.

### IntelliJ
Use `File` → `New` → `Project from Existing Sources...`. Follow the remaining steps; you'll want to import this project as a Maven project.

To create a JAR file, select the project and use `Build` → `Build Module 'pancakeworldgenerator`. You'll end up with a JAR file in the (newly created) `target` folder. Place this file in the `plugins` directory of your server to run it.

### Command line
This project requires [Maven](https://maven.apache.org/). Maven can be a bit tricky to install, as you need to make some changes to your environment variables and the official installation instructions do not explain how to do this. So you'll need to Google around a bit on how to install Maven.

After you have managed to install Maven, you can run the following command to compile Pancake:

`mvn install`

You'll end up with a JAR file in the (newly created) `target` folder. Place this file in the `plugins` directory of your server to run it.
