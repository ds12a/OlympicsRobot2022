// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.SupplyCurrentLimitConfiguration;
import com.ctre.phoenix.motorcontrol.can.TalonSRXConfiguration;
import com.ctre.phoenix.sensors.SensorVelocityMeasPeriod;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int LEFT_DRIVE_TALON_ID = 1; 
    public static final int RIGHT_DRIVE_TALON_ID = 2;
    public static final int RELEASE_SERVO_PORT = 9;

    public static final double RELEASE_SERVO_MAX = 0.2;
    public static final double RELEASE_SERVO_MIN = 0;

    public static final double UPPER_ELEVATOR_SPEED_PCT = 0.5;
    public static final double LOWER_ELEVATOR_SPEED_PCT = 0.5;
    
    public static final double DEADBAND = 0.05;

    public static final int kTalonConfigTimeout = 10; // ms

    public static final double DRIVE_RATE_LIMIT = 1.3; // units per sec

    // Talon SRX Constants
    public static final int CURRENT_LIMIT = 40;
    public static final int TRIGGER_THRESHOLD_CURRENT = 45;
    public static final double TRIGGER_THRESHOLD_TIME = 0.01;

    // Drive Falcon Config
    public static TalonSRXConfiguration getDriveTalonConfig() {
        TalonSRXConfiguration driveConfig = new TalonSRXConfiguration();
        // driveConfig.supplyCurrLimit.currentLimit = 40;
        // driveConfig.supplyCurrLimit.triggerThresholdCurrent = 45;
        // driveConfig.supplyCurrLimit.triggerThresholdTime = 0.01;
        // driveConfig.supplyCurrLimit.enable = true;
        // driveConfig.statorCurrLimit.enable = false;
        driveConfig.slot0.kP = 0.045;
        driveConfig.slot0.kI = 0.0005;
        driveConfig.slot0.kD = 0.000;
        driveConfig.slot0.kF = 0.047;
        driveConfig.slot0.integralZone = 500;
        driveConfig.slot0.maxIntegralAccumulator = 75_000;
        driveConfig.slot0.allowableClosedloopError = 0;
        driveConfig.velocityMeasurementPeriod = SensorVelocityMeasPeriod.Period_100Ms;
        driveConfig.velocityMeasurementWindow = 64;
        driveConfig.voltageCompSaturation = 12;
        driveConfig.neutralDeadband = 0.01;
        driveConfig.voltageMeasurementFilter = 32;
        return driveConfig;
    }

    public static SupplyCurrentLimitConfiguration getAzimuthSupplyCurrentLimit() {
        return new SupplyCurrentLimitConfiguration(true, 10, 15, 0.04);
    }
}
