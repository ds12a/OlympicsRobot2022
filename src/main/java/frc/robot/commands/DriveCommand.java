package frc.robot.commands;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveSubsystem;

public class DriveCommand extends CommandBase {
    private DriveSubsystem driveSubsystem;
    private XboxController joystick;

    public DriveCommand(DriveSubsystem driveSubsystem, XboxController joystick) {
        this.driveSubsystem = driveSubsystem;
        this.joystick = joystick;
        addRequirements(driveSubsystem);
    }

    @Override
    public void execute() {
        double dbX = MathUtil.applyDeadband(-joystick.getLeftY(), Constants.DEADBAND);
        double dbY = MathUtil.applyDeadband(-joystick.getRightY(), Constants.DEADBAND);

        driveSubsystem.drive(scale(dbX), scale(dbY));
    }

    private double scale(double r) {
        if (r == 0) {
            return 0;
        }
        final double PCT = 0.8;
        return PCT * (Math.pow(Math.abs(r), 5) * Math.abs(r) / r) + (1 - PCT) * r;
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
