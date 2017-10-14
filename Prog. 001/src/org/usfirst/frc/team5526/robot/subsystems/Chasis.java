package org.usfirst.frc.team5526.robot.subsystems;

import org.usfirst.frc.team5526.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chasis extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Talon brazo = new Talon(0);
	
	RobotDrive robot = new RobotDrive(0, 1);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void motorpotmax() {
    	brazo.set(1);
    }
    public void runChassis() {
    	arcadeDrive.drive(Robot.oi.stick, 0)
    }
}

