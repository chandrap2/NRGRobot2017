package org.usfirst.frc.team948.robot.subsystems;

import org.usfirst.frc.team948.robot.Robot;
import org.usfirst.frc.team948.robot.RobotMap;
import org.usfirst.frc.team948.utilities.PreferenceKeys;
import org.usfirst.frc.team948.utilities.PIDE;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem implements PIDOutput {
	private static PIDController drivePID;
	
	public static final double driveP = 1;
	public static final double driveI = 1;
	public static final double driveD = 1;
	public static final double turnP = 1;
	public static final double turnI = 1;
	public static final double turnD = 1;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void tankDrive(int leftPower, int rightPower){
    	RobotMap.motorFrontLeft.set(leftPower);
    	RobotMap.motorFrontRight.set(rightPower*-1);
    	RobotMap.motorBackLeft.set(leftPower);
    	RobotMap.motorBackRight.set(rightPower*-1);
    }
    
	@Override
	public void pidWrite(double output) {
		// TODO Auto-generated method stub
		
	}
}
