// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3930.PowerUp;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

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
    public static SpeedController driveBaseFrontLeft;
    public static SpeedController driveBaseFrontRight;
    public static SpeedController driveBaseBackLeft;
    public static SpeedController driveBaseBackRight;
    public static RobotDrive driveBaseRobotDrive41;
    public static SpeedController armarmMotor;
    public static DigitalInput armlimitUp;
    public static DigitalInput armlimitDown;
    public static DigitalInput armlimitHall;
    public static SpeedController grippergripMotor;
    public static DoubleSolenoid pneumaticsleftPiston;
    public static DoubleSolenoid pneumaticsrightPiston;
    public static Compressor pneumaticsCompressor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveBaseFrontLeft = new PWMVictorSPX(0);
        LiveWindow.addActuator("driveBase", "FrontLeft", (PWMVictorSPX) driveBaseFrontLeft);
        driveBaseFrontLeft.setInverted(false);
        driveBaseFrontRight = new PWMVictorSPX(1);
        LiveWindow.addActuator("driveBase", "FrontRight", (PWMVictorSPX) driveBaseFrontRight);
        driveBaseFrontRight.setInverted(false);
        driveBaseBackLeft = new PWMVictorSPX(2);
        LiveWindow.addActuator("driveBase", "BackLeft", (PWMVictorSPX) driveBaseBackLeft);
        driveBaseBackLeft.setInverted(false);
        driveBaseBackRight = new PWMVictorSPX(3);
        LiveWindow.addActuator("driveBase", "BackRight", (PWMVictorSPX) driveBaseBackRight);
        driveBaseBackRight.setInverted(false);
        driveBaseRobotDrive41 = new RobotDrive(driveBaseFrontLeft, driveBaseBackLeft,
              driveBaseFrontRight, driveBaseBackRight);
        
        driveBaseRobotDrive41.setSafetyEnabled(true);
        driveBaseRobotDrive41.setExpiration(0.1);
        driveBaseRobotDrive41.setSensitivity(0.5);
        driveBaseRobotDrive41.setMaxOutput(1.0);

        driveBaseRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        armarmMotor = new VictorSP(4);
        LiveWindow.addActuator("Arm", "armMotor", (VictorSP) armarmMotor);
        armarmMotor.setInverted(false);
        armlimitUp = new DigitalInput(0);
        LiveWindow.addSensor("Arm", "limitUp", armlimitUp);
        
        armlimitDown = new DigitalInput(1);
        LiveWindow.addSensor("Arm", "limitDown", armlimitDown);
        
        armlimitHall = new DigitalInput(2);
        LiveWindow.addSensor("Arm", "limitHall", armlimitHall);
        
        grippergripMotor = new VictorSP(5);
        LiveWindow.addActuator("Gripper", "leftGripper", (VictorSP) grippergripMotor);
        grippergripMotor.setInverted(false);
     
        pneumaticsleftPiston = new DoubleSolenoid(0, 1, 2);
        LiveWindow.addActuator("Pneumatics", "leftPiston", pneumaticsleftPiston);
        
        pneumaticsrightPiston = new DoubleSolenoid(0, 0, 3);
        LiveWindow.addActuator("Pneumatics", "rightPiston", pneumaticsrightPiston);
        
        pneumaticsCompressor = new Compressor(0);
        LiveWindow.addActuator("Pneumatics", "Compressor", pneumaticsCompressor);
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
