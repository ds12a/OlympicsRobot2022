package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.HopperSubsystem;

public class HopperCommand extends InstantCommand {
    private HopperSubsystem hopperSubsystem;
    private double pct;

    public HopperCommand(HopperSubsystem hopperSubsystem, double pct) {
        this.hopperSubsystem = hopperSubsystem;
        this.pct = pct;

        addRequirements(hopperSubsystem);
    }

    @Override
    public void initialize() {
        hopperSubsystem.set(pct);
    }
}
