
package org.usfirst.frc.team1701.robot;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

import org.usfirst.frc.team1701.robot.subsystems.DriveTrain;


/*

  Swerve Drive Example Code

  Code by Noah Husby
 */

/*
 * The VM on the RoboRIO is automatically configured to run this class. If you change the name of
 * this class or the package, change it in Gradle and here.
 */
public class Robot extends IterativeRobot {
  /*
   * Initialize the various subsystems on the robot.
   */
  public static DriveTrain driveTrain;
  public static OI oi;

  /*
   * This function is run when the robot is first started up.
   */
  public void robotInit() {
    RobotMap.init(); // Initialize our RobotMap.
    driveTrain = new DriveTrain();
    oi = new OI();


  }
  /*
   * This function is called when the robot has been disabled.
   */
  public void disabledInit() {

  }
  /*
   * Periodically run this when the robot is disabled.
   */
  public void disabledPeriodic() {

  }
  /*
   * This function is called when autonomous mode is started.
   */
  public void autonomousInit() {

  }


  /*
   * This function is called periodically during autonomous mode.
   */

  public void autonomousPeriodic() {

    Scheduler.getInstance().run();
  }
  /*
   * This function is called on start of teleop.
   */
  public void teleopInit() {
  }
  /*
   * This function is called periodically during teleop.
   */
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }
  /*
   * This function is called periodically during test mode.
   */
  public void testPeriodic() {}


}
