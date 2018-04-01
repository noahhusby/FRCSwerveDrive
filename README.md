# FRCSwerveDrive
An example showing how to program swerve dirve

## What is swerve drive?

Swerve drive is a new type of drive train becoming popular amongst first teams. Swerve drive allows the robot to navigate, not by turning the wheels oppisite each other but by moving the wheels themselves. The wheels can drive forward and backward but the wheel assembly is turned by another motor and are tracked by encoders.

## Can I use your swerve drive code?

Of course you can! As long as you give credit in your code somewhere. 

Download the source code <span style="color: black">[**here.**](https://github.com/noahhusby/FRCSwerveDrive/releases)</span>

While this code works and may work for you, my robotics library <span style="color: black">[**Jello**](https://github.com/noahhusby/Jello)</span> has swerve drive built in as an object and is similar to setup to MecanumDrive and DifferentialDrive.

## Getting Started

Here is your typical *type some hacker stuff in a console* setup:

1. Open a terminal and clone the repository: `git clone https://github.com/noahhusby/FRCSwerveDrive.git`
2. Set up Gradle:
  * On Windows platforms: `./gradlew build`
  * On Unix-Based platforms: `gradlew build`
3. Set up your IDE with `./gradlew idea` or `./gradlew eclipse`

## Other Useful Gradle Targets

* `./gradlew build` simply builds the target, and downloads any new dependencies.
* `./gradlew build deploy` builds the target and deploys it to the roboRIO.
* `./gradlew --offline build deploy` builds the target and deploys it to the roboRIO *without checking for updates*.\

## Contact

* There is no guarantee of assistance, but if you need help, file an issue.
* This project is licensed under a MIT liscense.
