package LLD.StrategyDesignPattern;

import LLD.StrategyDesignPattern.Strategy.NormalDrive;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new NormalDrive());
    }
}
