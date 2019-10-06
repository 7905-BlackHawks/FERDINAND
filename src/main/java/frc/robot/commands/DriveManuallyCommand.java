/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class DriveManuallyCommand extends Command {
  public DriveManuallyCommand() {
    // Use requires() here to declare subsystem dependencies
     requires(Robot.DriveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    double precision = 1.0;
    if (Robot.oi.stick.getRawButton(RobotMap.joystickPort_SLOW)) {
      precision = 0.25;
    } else {
      precision = 0.8;

    double move = -Robot.oi.stick.getRawAxis(RobotMap.joystickPort_MOVE_AXIS);
    double turn = Robot.oi.stick.getRawAxis(RobotMap.joystickPort_ROTATE_AXIS);
    Robot.DriveTrain.manualDrive(move*precision, turn*precision);

    }


    
    

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    //if(feetDrive > 10) return  true;  
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}