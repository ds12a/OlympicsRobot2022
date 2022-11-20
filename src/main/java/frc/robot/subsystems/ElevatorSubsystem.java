package frc.robot.subsystems;

import java.lang.invoke.ConstantBootstraps;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ElevatorSubsystem extends SubsystemBase{
    private TalonSRX upperElevator;
    private TalonSRX lowerElevator;

    public ElevatorSubsystem() {
        upperElevator = new TalonSRX(Constants.UPPER_ELEVATOR_TALON_ID);
        lowerElevator = new TalonSRX(Constants.LOWER_ELEVATOR_TALON_ID);
    }

    public void setUpperElevator(double pct) {
        upperElevator.set(ControlMode.PercentOutput, pct);
    }

    public void setLowerElevator(double pct) {
        lowerElevator.set(ControlMode.PercentOutput, pct);
    }
}
