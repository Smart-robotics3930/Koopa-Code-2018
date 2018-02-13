package org.usfirst.frc3930.whoCares.commands;

import org.usfirst.frc3930.whoCares.Robot;
import org.usfirst.frc3930.whoCares.subsystems.driveBase;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StrafeAndBack1 extends Command {

	
    public StrafeAndBack1() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveBase);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveBase.strafeRightAlsoBackuup();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
