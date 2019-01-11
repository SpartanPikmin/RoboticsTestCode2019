/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  Joystick controler1; 
  JoystickButton button;


  public OI(){
    controler1 = new Joystick(RobotMap.Ports.Controler);

    //examples of how to use a button
    button = new JoystickButton(controler1, RobotMap.Ports.Button);
    
    /*
    more examples on how to use buttons
    button.cancelWhenPressed(new command);
    button.whileHeld(new command);
    */

  }

  public double getRightYAxis() {
    return controler1.getRawAxis(RobotMap.Ports.g1_rightYAxis);
  }

  public double getRightXAxis() {
    return -controler1.getRawAxis(RobotMap.Ports.g1_rightXAxis);
  }

  public double getLeftYAxis() {
    return controler1.getRawAxis(RobotMap.Ports.g1_leftYAxis);
  }
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
