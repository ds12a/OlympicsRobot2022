package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

public class DriveSubsystem extends SubsystemBase {
    private TalonFX left;
    private TalonFX right;

    public DriveSubsystem() {
        left = new TalonFX(Constants.LEFT_DRIVE_TALON_ID);
        left.configFactoryDefault(Constants.kTalonConfigTimeout);
        left.configAllSettings(Constants.getDriveTalonConfig(), Constants.kTalonConfigTimeout);
        left.enableVoltageCompensation(true);
        left.setNeutralMode(NeutralMode.Brake);

        right = new TalonFX(Constants.RIGHT_DRIVE_TALON_ID);
        right.configFactoryDefault(Constants.kTalonConfigTimeout);
        right.configAllSettings(Constants.getDriveTalonConfig(), Constants.kTalonConfigTimeout);
        right.enableVoltageCompensation(true);
        right.setNeutralMode(NeutralMode.Brake);
    }

    public void drive(double leftPCT, double rightPCT) {
        left.set(ControlMode.PercentOutput, leftPCT);
        right.set(ControlMode.PercentOutput, rightPCT);
    }
}
