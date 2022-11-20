package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.SupplyCurrentLimitConfiguration;

public class DriveSubsystem extends SubsystemBase {
    private TalonSRX left;
    private TalonSRX right;

    public DriveSubsystem() {
        left = new TalonSRX(Constants.LEFT_DRIVE_TALON_ID);
        left.configFactoryDefault(Constants.kTalonConfigTimeout);
        left.configAllSettings(Constants.getDriveTalonConfig(), Constants.kTalonConfigTimeout);
        left.configSupplyCurrentLimit(new SupplyCurrentLimitConfiguration(true, Constants.CURRENT_LIMIT,
                Constants.TRIGGER_THRESHOLD_CURRENT, Constants.TRIGGER_THRESHOLD_TIME));
        left.enableVoltageCompensation(true);
        left.setNeutralMode(NeutralMode.Brake);

        right = new TalonSRX(Constants.RIGHT_DRIVE_TALON_ID);
        right.configFactoryDefault(Constants.kTalonConfigTimeout);
        right.configAllSettings(Constants.getDriveTalonConfig(), Constants.kTalonConfigTimeout);
        right.configSupplyCurrentLimit(new SupplyCurrentLimitConfiguration(true, Constants.CURRENT_LIMIT,
                Constants.TRIGGER_THRESHOLD_CURRENT, Constants.TRIGGER_THRESHOLD_TIME));
        right.enableVoltageCompensation(true);
        right.setNeutralMode(NeutralMode.Brake);
    }

    public void drive(double leftPCT, double rightPCT) {
        left.set(ControlMode.PercentOutput, leftPCT);
        right.set(ControlMode.PercentOutput, rightPCT);
    }
}
