/**
 * subsystems/DriveTrain.java
 *
 * @author Noah Husby
 * @since 1/7/18
 * @license BSD-3-Clause
 */
package org.usfirst.frc.team1701.robot.subsystems;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.command.PIDCommand;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team1701.robot.RobotMap;
import org.usfirst.frc.team1701.robot.commands.TeleopDrive;
import com.kauailabs.navx.frc.AHRS;
public class DriveTrain extends PIDSubsystem {
  /*
   * Set of drive motors.
   */
  private final WPI_TalonSRX left_1 = RobotMap._leftFrontMotor;
  private final WPI_TalonSRX left_2 = RobotMap._leftBackMotor;
  private final WPI_TalonSRX right_1 = RobotMap._rightFrontMotor;
  private final WPI_TalonSRX right_2 = RobotMap._rightBackMotor;
  /*
   * Set of swerve motors
   */
  private final WPI_TalonSRX leftSwerve_1 = RobotMap._leftFrontSwerve;
  private final WPI_TalonSRX leftSwerve_2 = RobotMap._leftBackSwerve;
  private final WPI_TalonSRX rightSwerve_1 = RobotMap._rightFrontSwerve;
  private final WPI_TalonSRX rightSwerve_2 = RobotMap._rightBackSwerve;

  /*
   * Our swerve encoder input
   */
  private final WPI_TalonSRX swerveEncoder = leftSwerve_1;


    /**

    Assuming the swerve is turned all the way right, the encoder will read (THIS NUMBER WAS MADE UP, SUBJECT TO CHANGE)
    10000. If the swerve is turned all the way left it will read -10000, and if the swerve is forward it will read 0.

    Following the philosophy described above, the numbers are placed below


   Right Swerve (Encoder: 10000)

   **************
   **********
   **********
   **********
   **************

   Forward Swerve (Encoder: 0)

   ***        ***
   ***        ***
   **************
   **************
   **************

   Left Swerve (Encoder: -10000)

   **************
       **********
       **********
       **********
   **************

  *
   */
  private final int swerveMax = 10000;



  public DriveTrain() {
    super(1.1,0,0);
    this.setInputRange(-10000,10000);
    this.setOutputRange(-1,1);
    this.setAbsoluteTolerance(5);
    this.getPIDController().setContinuous(true);
  }

  @Override
  protected void initDefaultCommand() {

  }

  /**
   * Sets angle for robot to turn to using PIDSubsystem
   * @param startAngle angle to turn to
   */
  public void setAngle(double startAngle) {
    this.setSetpoint(startAngle);
  }

  public void startPID() {
    this.getPIDController().enable();
  }

  public void stopPID() {
    this.getPIDController().disable();
  }



  public double getJoystickSwervePercent(double xAxis) {
    /*
     * Assuming the joystick range is from -1 to 1, we will find the percent of how far the joystick is and then find
     * the number that is the percent of the swerve max
     *
     * Example:
     *
     * Joystick input is 0.3 out of 1 which is max. So therefore we know that the joystick is at 30%. Then we find 30%
     * of the max swerve value so in this case that is 10000. So 30% of 10000 is 3000, so we know that the swerve wheel
     * needs to be at 3000 on its encoder value
     */

    double input = xAxis * 100;
    double output = swerveMax * input/100;
    return output;
  }

  public void teleopControl(double forwardsBackwardsAxis, double turningAxis) {
    RobotMap._leftMotors.set(forwardsBackwardsAxis);
    RobotMap._rightMotors.set(forwardsBackwardsAxis);

    setAngle(getJoystickSwervePercent(turningAxis));
    startPID();
  }

  @Override
  protected double returnPIDInput() {
    return swerveEncoder.get();
  }

  @Override
  protected void usePIDOutput(double output) {

    leftSwerve_1.set(output);
    leftSwerve_2.set(output);
    rightSwerve_1.set(output);
    rightSwerve_2.set(output);
  }
}
