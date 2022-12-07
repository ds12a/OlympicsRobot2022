// package frc.robot.commands;

// import edu.wpi.first.wpilibj2.command.InstantCommand;
// import frc.robot.subsystems.ElevatorSubsystem;

// public class UpperElevatorCommand extends InstantCommand{
//     private ElevatorSubsystem elevatorSubsystem;
//     private double pct;

//     public UpperElevatorCommand(ElevatorSubsystem elevatorSubsystem, double pct) {
//         this.elevatorSubsystem = elevatorSubsystem;
//         this.pct = pct;
//         addRequirements(elevatorSubsystem);
//     }

//     @Override
//     public void initialize() {
//         elevatorSubsystem.setUpperElevator(pct);
//     }
// }
