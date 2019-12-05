/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;



import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class turn180auto extends Command {
  public turn180auto() {
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

    Robot.DriveTrain.left1.set(0.3);
    Robot.DriveTrain.left2.set(0.3);
    Robot.DriveTrain.right1.set(0.3);
    Robot.DriveTrain.right2.set(0.3);

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      
      e.printStackTrace();

    

      Robot.DriveTrain.left1.set(0);
      Robot.DriveTrain.left2.set(0);
      Robot.DriveTrain.right1.set(0);
      Robot.DriveTrain.right2.set(0);




    }



      

    
  }

    




  
  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
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
  }
}
