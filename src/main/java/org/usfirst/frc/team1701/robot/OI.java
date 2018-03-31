/*
 * OI.java
 *
 * @author Noah Husby
 * @since 12/21/17
 * @license BSD-3-Clause
 */
package org.usfirst.frc.team1701.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team1701.robot.commands.*;
/*
 * This class sets up and enables the Joysticks and Buttons on your console.
 */
public class OI {
  /*
   * Create initial values.
   */

  public static Joystick drive;
  /**
   * Instead of an init() function, we call this on OI startup.
   */
  public OI() {
    /*
     * Enable the physical joysticks.
     */
    drive = new Joystick(0); // Left
    /*
     * Assign commands to buttons.
     */

  }
}