// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.HopperCommand;
// import frc.robot.commands.LowerElevatorCommand;
// import frc.robot.commands.UpperElevatorCommand;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.HopperSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in
 * the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of
 * the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
    // The robot's subsystems and commands are defined here...
    private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

    private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

    private final DriveSubsystem driveSubsystem;
    // private final HopperSubsystem hopperSubsystem;
    // private final ElevatorSubsystem elevatorSubsystem;

    private final XboxController joystick = new XboxController(0);

    /**
     * The container for the robot. Contains subsystems, OI devices, and commands.
     */
    public RobotContainer() {
        // Configure the button bindings
        configureButtonBindings();

        // elevatorSubsystem = new ElevatorSubsystem();
        driveSubsystem = new DriveSubsystem();
        // hopperSubsystem = new HopperSubsystem();

        driveSubsystem.setDefaultCommand(new DriveCommand(driveSubsystem, joystick));
    }

    /**
     * Use this method to define your button->command mappings. Buttons can be
     * created by
     * instantiating a {@link GenericHID} or one of its subclasses ({@link
     * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing
     * it to a {@link
     * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
     */
    private void configureButtonBindings() {
        // new JoystickButton(joystick, 1)
        // .whenPressed(new LowerElevatorCommand(elevatorSubsystem,
        // Constants.LOWER_ELEVATOR_SPEED_PCT));
        // new JoystickButton(joystick, 2).whenPressed(new
        // LowerElevatorCommand(elevatorSubsystem, 0));
        // new JoystickButton(joystick, 3)
        // .whenPressed(new UpperElevatorCommand(elevatorSubsystem,
        // Constants.UPPER_ELEVATOR_SPEED_PCT));
        // new JoystickButton(joystick, 4)
        // .whenPressed(new UpperElevatorCommand(elevatorSubsystem, 0));
        // new JoystickButton(joystick, 5).whenPressed(new HopperCommand(hopperSubsystem, Constants.RELEASE_SERVO_MIN));
        // new JoystickButton(joystick, 6).whenPressed(new HopperCommand(hopperSubsystem, Constants.RELEASE_SERVO_MAX));
    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        // An ExampleCommand will run in autonomous
        return m_autoCommand;
    }
}