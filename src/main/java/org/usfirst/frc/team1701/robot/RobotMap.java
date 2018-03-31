/**
 * RobotMap.java
 *
 * @author Nicholas Hubbard
 * @since 1/3/19
 * @license BSD-3-Clause
 */
package org.usfirst.frc.team1701.robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX; // Replaced wildcard import.
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


public class RobotMap {
  /*
   * Create all static variables, most (exception of logger) filled
   * by the init() method below.
   */
  public static WPI_TalonSRX _leftFrontMotor;
  public static WPI_TalonSRX _leftBackMotor;
  public static WPI_TalonSRX _rightFrontMotor;
  public static WPI_TalonSRX _rightBackMotor;
  public static WPI_TalonSRX _leftFrontSwerve;
  public static WPI_TalonSRX _leftBackSwerve;
  public static WPI_TalonSRX _rightFrontSwerve;
  public static WPI_TalonSRX _rightBackSwerve;
  public static SpeedControllerGroup _leftMotors;
  public static SpeedControllerGroup _rightMotors;

  /**
   * Initialize the public values above.
   */
  public static void init() {
    _leftFrontMotor = new WPI_TalonSRX(0);
    _leftBackMotor = new WPI_TalonSRX(1);
    _rightFrontMotor = new WPI_TalonSRX(2);
    _rightBackMotor = new WPI_TalonSRX(3);

    _leftFrontSwerve = new WPI_TalonSRX(4);
    _leftBackSwerve = new WPI_TalonSRX(5);
    _rightFrontSwerve = new WPI_TalonSRX(6);
    _rightBackSwerve = new WPI_TalonSRX(7);
    /**
     * Create 4-wheel drivetrain object using DifferentialDrive and SpeedControllerGroups.
     */
    _leftMotors = new SpeedControllerGroup(_leftFrontMotor, _leftBackMotor);
    _rightMotors = new SpeedControllerGroup(_rightFrontMotor, _rightBackMotor);

  }

}
