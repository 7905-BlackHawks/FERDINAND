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


import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveManuallyCommand;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.


  // instantiate new motor controller objects
  public WPI_VictorSPX left = new WPI_VictorSPX(RobotMap.left);
  public WPI_VictorSPX right = new WPI_VictorSPX(RobotMap.right);


  
  // instantiate a new DifferentialDrive object and assign motor controllers to differential drive
  //public DifferentialDrive drive = new DifferentialDrive(leftMaster, rightMaster); 
   public DifferentialDrive drive = new DifferentialDrive(left, right);

  // create constructor function
  public DriveTrain() {
  // point slaves to masters
  //leftSlave.follow(leftMaster);
  //rightSlave.follow(rightMaster);
  }

  // add manualDrive() method
  public void manualDrive(double move, double turn) {

    

    drive.arcadeDrive(move, turn);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new DriveManuallyCommand());
  }

  //public void setLeftMotors(double move) {
    //leftMaster.set(ControlMode.PercentOutput, -move);
    //leftSlave.set(ControlMode.PercentOutput, -move);
  //}

  //public void setRightMotors(double move) {
  //  rightMaster.set(ControlMode.PercentOutput, move);
  //  rightSlave.set(ControlMode.PercentOutput, move);
  //}
}