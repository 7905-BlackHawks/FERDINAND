/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;



  //CAN
  public static final int left = 0; 
  public static final int right = 1;



  //PWM




  //USB
  public static final int joystickPort = 0;
  public static final int joystickPort_MOVE_AXIS = 1;
  public static final int joystickPort_ROTATE_AXIS = 4;
  public static final int joystickPort_SLOW = 5;
  

  public static final int operatorPort = 1;


  // Constants

  public static final double Deadzone_Value = 0.1;
  public static final double Precision_Slow = 0.35;
  public static final double Precision_Fast = 0.8;





  
}
