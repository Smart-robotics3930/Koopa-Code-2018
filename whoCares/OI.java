// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3930.whoCares;

import org.usfirst.frc3930.whoCares.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc3930.whoCares.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
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

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton a;
    public JoystickButton b;
    public JoystickButton x;
    public JoystickButton y;
    public JoystickButton start;
    public JoystickButton select;
    public Joystick playerOne;
    public JoystickButton lB;
    public JoystickButton rB;
    public JoystickButton alsoStart;
    public JoystickButton alsoSelect;
    public JoystickButton alsoB;
    public Joystick playerTwo;
    public JoystickButton buttonOne;
    public JoystickButton buttonTwo;
    public JoystickButton buttonThree;
    public Joystick buttonBoard;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @SuppressWarnings("deprecation")
	public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        buttonBoard = new Joystick(2);
        
        buttonThree = new JoystickButton(buttonBoard, 3);
        buttonThree.whenPressed(new cameraThree());
        buttonTwo = new JoystickButton(buttonBoard, 2);
        buttonTwo.whenPressed(new cameraTwo());
        buttonOne = new JoystickButton(buttonBoard, 1);
        buttonOne.whenPressed(new cameraOne());
        playerTwo = new Joystick(1);
        
        alsoSelect = new JoystickButton(playerTwo, 7);
        alsoSelect.whileHeld(new doYouEvenDrop());
        alsoStart = new JoystickButton(playerTwo, 8);
        alsoStart.whileHeld(new doYouEvenLift());
        rB = new JoystickButton(playerTwo, 6);
        rB.whenPressed(new doorUp());
        lB = new JoystickButton(playerTwo, 5);
        lB.whenPressed(new doorDown());
        alsoB = new JoystickButton(playerTwo, 2);
        alsoB.whileHeld(new getEm());
        playerOne = new Joystick(0);
        
        select = new JoystickButton(playerOne, 7);
        select.whileHeld(new doYouEvenDrop());
        start = new JoystickButton(playerOne, 8);
        start.whileHeld(new doYouEvenLift());
        y = new JoystickButton(playerOne, 4);
        y.whenPressed(new gearSet());
        x = new JoystickButton(playerOne, 3);
        x.whileHeld(new getEm());
        b = new JoystickButton(playerOne, 2);
        b.whenPressed(new knife());
        a = new JoystickButton(playerOne, 1);
        a.whileHeld(new loseEm());

        /*
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("drive", new drive());
        SmartDashboard.putData("knife", new knife());
        SmartDashboard.putData("doYouEvenLift", new doYouEvenLift());
        SmartDashboard.putData("doYouEvenDrop", new doYouEvenDrop());
        SmartDashboard.putData("getEm", new getEm());
        SmartDashboard.putData("loseEm", new loseEm());
        SmartDashboard.putData("dump", new dump());
        SmartDashboard.putData("unDump", new unDump());
        SmartDashboard.putData("doorUp", new doorUp());
        SmartDashboard.putData("doorDown", new doorDown());
        SmartDashboard.putData("cameraNone", new cameraNone());
        SmartDashboard.putData("cameraOne", new cameraOne());
        SmartDashboard.putData("cameraTwo", new cameraTwo());
        SmartDashboard.putData("cameraThree", new cameraThree());
        SmartDashboard.putData("gearSet", new gearSet());
        */
        
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getplayerOne() {
        return playerOne;
    }

    public Joystick getplayerTwo() {
        return playerTwo;
    }

    public Joystick getbuttonBoard() {
        return buttonBoard;
    }
    

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

