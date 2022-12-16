package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Servo;

import java.lang.Math;
import frc.robot.Constants;

public class HopperSubsystem extends SubsystemBase {
    private Servo releaseServo;

    public HopperSubsystem() {
        releaseServo = new Servo(Constants.RELEASE_SERVO_PORT);
    }

    public void set(double pct) {
        releaseServo.set(pct);
    }
}
