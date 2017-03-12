package org.usfirst.frc.team948.robot.commands;

import org.usfirst.frc.team948.robot.OI;
import org.usfirst.frc.team948.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TestShooterRPM extends Command {
    public TestShooterRPM() {
        requires(Robot.shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.shooter.rampToRPMinit();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double targetRPM = ((OI.leftJoystick.getZ() + 1) * 5000);//0 - 10000 RPM.
    	Robot.shooter.rampToRPM(targetRPM);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.shooter.rampToRPMEnd();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}