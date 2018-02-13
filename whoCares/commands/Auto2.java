package org.usfirst.frc3930.whoCares.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Auto2 extends CommandGroup {

    public Auto2() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	addParallel(new doorUp(),4);
    	addSequential(new StrafeAndBack1(),0.8);
    	addSequential(new Drivebward(),0.9);
    	//addSequential(new doorUp(),4);
    	addSequential(new doorDown(),3);
    	addSequential(new DriveFward2(),3);
    	
    }
}
