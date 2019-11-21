/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import com.ctre.phoenix.motorcontrol.ControlMode;
//import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.DriveManuallyCommand;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.


  // instantiate new motor controller objects
  public WPI_VictorSPX left1 = new WPI_VictorSPX(RobotMap.leftyellow);
  public WPI_VictorSPX left2 = new WPI_VictorSPX(RobotMap.leftblue);
  public WPI_VictorSPX right1 = new WPI_VictorSPX(RobotMap.rightwhite);
  public WPI_VictorSPX right2 = new WPI_VictorSPX(RobotMap.rightgreen);
  

  SpeedControllerGroup left_SIDE = new SpeedControllerGroup(left1, left2);
  SpeedControllerGroup right_SIDE = new SpeedControllerGroup(right1, right2);



  
  // instantiate a new DifferentialDrive object and assign motor controllers to differential drive
  //public DifferentialDrive drive = new DifferentialDrive(leftMaster, rightMaster); 
  public DifferentialDrive drive = new DifferentialDrive(left_SIDE, right_SIDE);
   

  // create constructor function
  
  // point slaves to masters
  //leftSlave.follow(leftMaster);
  //rightSlave.follow(rightMaster);
  

  // add manualDrive() method
  public void manualDrive(double move, double turn) {


    drive.curvatureDrive(move, turn, Robot.oi.RightTrigger.get());
    //drive.curvatureDrive(move, turn, Robot.oi.stick.getRawButton(RobotMap.joystickPort_QuickTurn));
    

    

    //drive.arcadeDrive(move, turn);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new DriveManuallyCommand());
  }
  //tank drive
  //public void setLeftMotors(double move) {
    //leftMaster.set(ControlMode.PercentOutput, -move);
    //leftSlave.set(ControlMode.PercentOutput, -move);
  //}


public void drive(int i, double speed, int j) {
}

  //public void setRightMotors(double move) {
  //  rightMaster.set(ControlMode.PercentOutput, move);
  //  rightSlave.set(ControlMode.PercentOutput, move);
  //}
}