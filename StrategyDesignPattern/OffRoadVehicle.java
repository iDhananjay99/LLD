package LLD.StrategyDesignPattern;
import LLD.StrategyDesignPattern.Strategy.SpecialDrive;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SpecialDrive());
    }
}
