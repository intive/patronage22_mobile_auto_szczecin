### FRAMEWORK

This is simple example of test automation mobile framework.
- Java 15 or less (everything 15+ will fail the framework WHY ? TO READ: "illegal reflective access operation" and Java 15 + and Appium + 
Cucumber, I will explain later how to deal with that)
- Maven
- Appium
- jUnit5
- Cucumber
- BrowserStack

### Important
- On Github Actions Java version is 11 (Fix this soon) 

### TEST FRAMEWORK SETUP

Install the most important package manager for MAC
- #### Install [Brew](https://brew.sh)

Install latest JAVA version 
- #### Install [Latest Java](https://formulae.brew.sh/formula/openjdk)

Install latest MAVEN version
- #### Install [Maven](https://formulae.brew.sh/formula/maven#default)

### CONFIGURATION FOR APPIUM 
- TODO (This will be part of one todo, to explain how to setup mobile test automation on Windows/Mac and described here)

### RUN TEST
By default test will run default.json

- Run all `mvn clean test -Ddevice="default"` 
- Run by tag `mvn clean test -Ddevice="default" -Dcucumber.filter.tags="@Smoke"`

Also check Makefile for Browserstack


