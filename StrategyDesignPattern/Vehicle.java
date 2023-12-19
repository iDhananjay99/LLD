package LLD.StrategyDesignPattern;
import LLD.StrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle implements DriveStrategy{

    DriveStrategy drive;

    Vehicle(DriveStrategy driveObj){
        this.drive = driveObj;
    }

    @Override
    public void drive() {
        drive.drive();
    }
}
