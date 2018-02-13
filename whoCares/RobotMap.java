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

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveBasefrontLeft;
    public static CANTalon driveBasebackLeft;
    public static CANTalon driveBasefrontRight;
    public static CANTalon driveBasebackRight;
    public static RobotDrive driveBaseRobotDrive;
    public static SpeedController liftermotor;
    public static SpeedController intakemotor;
    public static SpeedController dumpermotor;
    public static Encoder dumperroatationCounter;
    public static DigitalInput dumpertopStop;
    public static DigitalInput dumperbotStop;
    public static DoubleSolenoid dumpDoorpiston;
    public static Relay cam1;
    public static Relay cam2;
    public static Relay cam3;
    public static Relay cam4;



    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
    	
        CameraServer.getInstance().startAutomaticCapture(0);        

    	cam1 = new Relay(0);
    	cam2 = new Relay(1);
    	cam3 = new Relay(2);
    	cam4 = new Relay(3);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveBasefrontLeft = new CANTalon(1);
        LiveWindow.addActuator("driveBase", "frontLeft", driveBasefrontLeft);
        
        driveBasebackLeft = new CANTalon(2);
        LiveWindow.addActuator("driveBase", "backLeft", driveBasebackLeft);
        
        driveBasefrontRight = new CANTalon(4);
        LiveWindow.addActuator("driveBase", "frontRight", driveBasefrontRight);
        
        driveBasebackRight = new CANTalon(3);
        LiveWindow.addActuator("driveBase", "backRight", driveBasebackRight);
        
        driveBaseRobotDrive = new RobotDrive(driveBasefrontLeft, driveBasebackLeft,
              driveBasefrontRight, driveBasebackRight);
        
        driveBaseRobotDrive.setSafetyEnabled(true);
        driveBaseRobotDrive.setExpiration(0.1);
        driveBaseRobotDrive.setSensitivity(0.5);
        driveBaseRobotDrive.setMaxOutput(1.0);

        liftermotor = new VictorSP(0);
        LiveWindow.addActuator("lifter", "motor", (VictorSP) liftermotor);
        
        intakemotor = new VictorSP(2);
        LiveWindow.addActuator("intake", "motor", (VictorSP) intakemotor);
        
        dumpermotor = new VictorSP(1);
        LiveWindow.addActuator("dumper", "motor", (VictorSP) dumpermotor);
        
        dumperroatationCounter = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("dumper", "roatationCounter", dumperroatationCounter);
        dumperroatationCounter.setDistancePerPulse(1.0);
        dumperroatationCounter.setPIDSourceType(PIDSourceType.kDisplacement);
        dumpertopStop = new DigitalInput(2);
        LiveWindow.addSensor("dumper", "topStop", dumpertopStop);
        
        dumperbotStop = new DigitalInput(3);
        LiveWindow.addSensor("dumper", "botStop", dumperbotStop);
        
        dumpDoorpiston = new DoubleSolenoid(5, 0, 1);
        LiveWindow.addActuator("dumpDoor", "piston", dumpDoorpiston);
        
        driveBaseRobotDrive.setInvertedMotor(MotorType.kFrontRight, true);
        driveBaseRobotDrive.setInvertedMotor(MotorType.kFrontLeft, true);
        driveBaseRobotDrive.setInvertedMotor(MotorType.kRearLeft, true);
        driveBaseRobotDrive.setInvertedMotor(MotorType.kRearRight, true);
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
