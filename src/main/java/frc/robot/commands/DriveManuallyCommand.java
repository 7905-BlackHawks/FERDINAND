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

    double precision_Move = 1.0;
    if (Robot.oi.stick.getRawButton(RobotMap.joystickPort_SLOW)) {
      precision_Move = RobotMap.Precision_Move_Slow;
    } else {
      precision_Move = RobotMap.Precision_Move_Norm;
    }
    if (Robot.oi.stick.getRawButton(RobotMap.joystickPort_Fast)) {
      precision_Move = RobotMap.Precision_Move_Fast;
    }
    double precision_Turn = 1.0;

    
    if (Robot.oi.stick.getRawButton(RobotMap.joystickPort_SLOW)) {
      precision_Turn = RobotMap.Precision_Turn_Slow;
    } else {
      precision_Turn = RobotMap.Precision_Turn_Norm;
    }
    if (Robot.oi.stick.getRawButton(RobotMap.joystickPort_Fast)) {
      precision_Turn = RobotMap.Precision_Turn_Fast;
    }

    double move = -Robot.oi.stick.getRawAxis(RobotMap.joystickPort_MOVE_AXIS);
    double turn = Robot.oi.stick.getRawAxis(RobotMap.joystickPort_ROTATE_AXIS); 

    if ((Math.abs(move) < RobotMap.Deadzone_Value)) {
      move = 0; 
    }
    if ((Math.abs(turn) < RobotMap.Deadzone_Value)) {
      turn = 0; 
    }
    



    
    
    
    
    
    Robot.DriveTrain.manualDrive(move*precision_Move, (turn*precision_Turn));

      

  


      
      
         
          
          
         
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