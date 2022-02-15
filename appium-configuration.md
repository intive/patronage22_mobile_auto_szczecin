# APPIUM CONFIGURATION
---
## Prerequisites
To run the tests the Java Development Kit is required. If you don’t have the JDK configured, please install the JDK and [set the JAVA_HOME and PATH environment variables][1].

[1]: https://www.ibm.com/docs/en/b2b-integrator/5.2?topic=installation-setting-java-variables-in-windows "Setting Java variables"
## Required tools
1. Android Studio - Download and install [Android Studio][1]
1. Set `ANDROID_HOME` environment variable:
    1. Open Android Studio
    1. Open Settings (File -> Settings)
    1. In the search bar type `Android SDK`
    1. Copy the Android SDK location path
    1. Set the path as `ANDROID_HOME` environment variable
    1. Add `ANDROID_HOME` to PATH environment variable
1. NodeJS - Download and install [NodeJS][2]

[1]: https://developer.android.com/studio "Android studio"
[2]: https://nodejs.org/en/ "NodeJS"
## Installing Appium
There are two ways to install Appium on your Windows machine.
1. Installing Appium via command line:
    1. Open command line and run: `npm install -g appium`
    1. Then run: `npm install wd`
1. Installing Appium as desktop app:
    1. Download and install [Appium destkop app (.exe file)][3]

[3]: https://github.com/appium/appium-desktop/releases/ "Appium"
## Running Appium
1. Via command line:
    1. Open command line and run command: `appium -a 127.0.0.1 -p 4723`
1. Via the desktop app:
    1. Open Appium Server GUI desktop app
    1. Set host as `127.0.0.1`
    1. Set port as `4723`
    1. Click Start Server
## Configure your Android device
1. To use your Android device as a test device you have to enable [developer options and USB debugging][4]
1. Run Android Studio
1. Connect your device to the computer via USB
1. You should see the `Allow USB debugging` dialog on your mobile phone.
1. Press `OK` button
1. If the dialog was not presented - open command line and run command: `adb devices`

[4]: https://developer.android.com/studio/debug/dev-options "developer options"
## Running Tests
1. While your Appium server is running and your Android device is connected open the `patronage22_mobile_auto_szczecin` project.
1. In the terminal run command: `mvn clean test -Ddevice="default"`
## Troubleshooting
1. If the tests are not running and you are receiving some errors, you can use an additional tool [Appium Doctor][5]
2. To install Appium Doctor in the command line run command: `npm install appium-doctor -g`
3. To find and fix possible issues in the command line run command: `appium-doctor --android`

[5]: https://github.com/appium/appium-doctor "Appium Doctor"
## Appium Inspector
The Appium provides an additional tool to inspect a mobile app. To install [the Appium Inspector][6] download .exe file from project github page

[6]: https://github.com/appium/appium-inspector/releases "Appium inspector"
### Appium Inspector configuration
1. Run Appium Inspector while your Appium Server is running and the Android Device is connected to your computer,
1. In the Appium Server tab set the Remote Host: `127.0.0.1`
1. In the Appium Server tab set the Remote Path: `/wd/hub`
1. In the Desired Capabilities tab you should define at least the platform name:
    1. Press `+` button in the Desired Capabilities tab
    1. Add platformName text capability with value Android
    1. In the JSON representation on the right side you should see json:
       `{
       "platformName": "Android"
       }`
1. Press `Start Session` button