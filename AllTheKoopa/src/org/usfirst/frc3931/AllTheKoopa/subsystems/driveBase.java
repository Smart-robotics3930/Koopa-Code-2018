// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3931.AllTheKoopa.subsystems;

import org.usfirst.frc3931.AllTheKoopa.Robot;
import org.usfirst.frc3931.AllTheKoopa.RobotMap;
import org.usfirst.frc3931.AllTheKoopa.commands.*;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class driveBase extends Subsystem {


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new drive());

    }
    
    public void drive(){
    	RobotDrive drivebase = Robot.driveBase.getRobotDrive();
    	drivebase.arcadeDrive(Robot.oi.joystick);
    }
    public RobotDrive getRobotDrive(){
    	return RobotMap.driveBaseRobotDrive;
    }
}
