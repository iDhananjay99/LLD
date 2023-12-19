package LLD.StrategyDesignPattern;
import LLD.StrategyDesignPattern.Strategy.SpecialDrive;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SpecialDrive());
    }
}
