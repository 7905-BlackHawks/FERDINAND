/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  public Joystick stick= new Joystick(RobotMap.joystickPort);
  public JoystickButton Abutton1 = new JoystickButton(stick, RobotMap.Abutton);
  public JoystickButton Bbutton2 = new JoystickButton(stick, RobotMap.Bbutton);
  public JoystickButton button3 = new JoystickButton(stick, RobotMap.Xbutton);
  public JoystickButton button4 = new JoystickButton(stick, RobotMap.Ybutton);
  public JoystickButton button6 = new JoystickButton(stick, 6);
  public JoystickButton button7 = new JoystickButton(stick, 7);
  public JoystickButton button8 = new JoystickButton(stick, 8);
  public Button LeftTrigger, RightTrigger;

    public OI() {
        LeftTrigger = new XBoxTrigger(stick, 2);
        RightTrigger = new XBoxTrigger(stick, 3);
    }
  public Joystick Operator  = new Joystick(RobotMap.operatorPort);
                         






  
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
   


  // Run the command while the button is being held down and interrupt it once
  // the button is released.
   // button.whileHeld(new ExampleCommand());
  //Stick.button5.whileHeld(new Slow_Mode(true, 1));

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
  
  

}




