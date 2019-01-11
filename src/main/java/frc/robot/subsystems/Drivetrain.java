/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;
import frc.robot.commands.ArcadeDrive;;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {

    private Talon lefttalon, righttalon;
    private Victor leftvictor, rightvictor;


  public Drivetrain(){
    //setting the motors 
    lefttalon = new Talon(RobotMap.Ports.LEFT_FRONT_DRIVE);
    lefttalon.setInverted(true);
    righttalon = new Talon(RobotMap.Ports.RIGHT_FRONT_DRIVE);
    righttalon.setInverted(false);

    
    leftvictor = new Victor(RobotMap.Ports.LEFT_BACK_DRIVE);
    leftvictor.setInverted(false);
    rightvictor = new Victor(RobotMap.Ports.RIGHT_BACK_DRIVE);
    rightvictor.setInverted(true);
    /*
    -------------------------------------------------------------------------------------
      PLEASE PLEASE ENSURE WHICH MOTORS NEED TO BE INVERTED IT CAN CAUSE MAJOR PROBLEMS
    -------------------------------------------------------------------------------------
    */
    //REMEMBER TO UNCOMMENT
    //leftvictor.follow(lefttalon);
    //rightvictor.follow(righttalon);

  }


  public void setVolts (double leftspeed, double rightspeed){
    lefttalon.set(leftspeed);
    righttalon.set(rightspeed);
  }

  public void stopVolts(){
    lefttalon.set(0);
    righttalon.set(0);
  }

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new ArcadeDrive());
  }

  public void updateSmartDashboard(){
    SmartDashboard.putNumber("Leftspeed", lefttalon.get());
    SmartDashboard.putNumber("Rightspeed",righttalon.get());
  }
}
