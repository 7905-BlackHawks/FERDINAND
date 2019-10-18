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
  public static final int leftyellow = 2; 
  public static final int leftblue = 1; 
  public static final int rightred = 3;
  public static final int rightorange = 4;




  //PWM
  public static final int Elevator = 5;




  //USB
  public static final int joystickPort = 0;
  public static final int joystickPort_MOVE_AXIS = 1;
  public static final int joystickPort_ROTATE_AXIS = 4;
  public static final int joystickPort_SLOW = 5;
  public static final int joystickPort_Fast = 6;
  public static final int joystickPort_QuickTurn = 3;
  public static final int TriggerAxis = 3;
  

  public static final int operatorPort = 1;


  // Constants

  public static final double Deadzone_Value = 0.05;
  public static final double Precision_Move_Slow = 0.5;
  public static final double Precision_Move_Norm = 0.7;
  public static final double Precision_Move_Fast = 1.0;
  public static final double Precision_Turn_Slow = 0.5;
  public static final double Precision_Turn_Norm = 0.7;
  public static final double Precision_Turn_Fast = 0.8;




  
}
