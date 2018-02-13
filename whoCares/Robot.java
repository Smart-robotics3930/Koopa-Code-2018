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

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc3930.whoCares.commands.*;
import org.usfirst.frc3930.whoCares.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    Command autonomousCommand;
    SendableChooser autoChooser;
    Thread visionThread;

    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static driveBase driveBase;
    public static lifter lifter;
    public static intake intake;
    public static dumper dumper;
    public static dumpDoor dumpDoor;
    public static cameraSystem cameraSystem;
    
   // Thread visionThread;
    
    

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveBase = new driveBase();
        lifter = new lifter();
        intake = new intake();
        dumper = new dumper();
        dumpDoor = new dumpDoor();
        cameraSystem = new cameraSystem();
       
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        oi = new OI();

        // instantiate the command used for the autonomous period


        //autonomousCommand = new AutoSelect();
       // Robot.cameraSystem.camera1Activate();
        
        autoChooser = new SendableChooser();
        autoChooser.addDefault("forward", new Auto1());
        autoChooser.addObject("Blue Ball Dump", new Auto2());
        autoChooser.addObject("Red Ball Dump", new Auto3());
        SmartDashboard.putData("Autonomous Selection", autoChooser);
        
        CameraServer.getInstance().startAutomaticCapture();
        /*
        visionThread = new Thread(() -> {
			// Get the UsbCamera from CameraServer
			UsbCamera camera = CameraServer.getInstance().startAutomaticCapture(0);
			// Set the resolution
			camera.setResolution(640, 480);

			// Get a CvSink. This will capture Mats from the camera 
			CvSink cvSink = CameraServer.getInstance().getVideo();
			// Setup a CvSource. This will send images back to the Dashboard
			CvSource outputStream = CameraServer.getInstance().putVideo("Rectangle", 640, 480);

			// Mats are very memory expensive. Lets reuse this Mat.
			Mat mat = new Mat();

			// This cannot be 'true'. The program will never exit if it is. This
			// lets the robot stop this thread when restarting robot code or
			// deploying.
			while (!Thread.interrupted()) {
				// Tell the CvSink to grab a frame from the camera and put it
				// in the source mat.  If there is an error notify the output.
				if (cvSink.grabFrame(mat) == 0) {
					// Send the output the error.
					outputStream.notifyError(cvSink.getError());
					// skip the rest of the current iteration
					continue;
				}
				// Put a rectangle on the image
				Imgproc.circle(mat, new Point(100,100), 100, new Scalar(200, 0, 255), 5);
				//Imgproc.rectangle(mat, new Point(100, 100), new Point(400, 400),
						//new Scalar(200, 0, 255), 5);
				
				// Give the output stream a new image to display
				outputStream.putFrame(mat);
			}
		});
		visionThread.setDaemon(true);
		visionThread.start();
        
*/
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
    }
    


    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
    	autonomousCommand = (Command) autoChooser.getSelected();
        autonomousCommand.start();
        
        
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	//Robot.driveBase.getRobotDrive().mecanumDrive_Cartesian(Robot.oi.playerOne.getRawAxis(3)-Robot.oi.playerOne.getRawAxis(2), Robot.oi.getplayerOne().getX(), Robot.oi.getplayerOne().getY(), 0);
    	//Robot.driveBase.getRobotDrive().mecanumDrive_Cartesian(Robot.oi.getplayerOne().getTwist(), Robot.oi.getplayerOne().getX(), Robot.oi.getplayerOne().getY(), 0);
        Scheduler.getInstance().run();
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }

}