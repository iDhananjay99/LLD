package LLD.FactoryDesignPattern.Cources.ShapeFactory;

import LLD.FactoryDesignPattern.Cources.ShapeFactory.FactoryPackage.ShapeFactory;
import LLD.FactoryDesignPattern.Cources.ShapeFactory.FactoryPackage.ShapeInterface;

public class MainClass {
    public static void main(String []args) {
        ShapeFactory factory = new ShapeFactory();
        ShapeInterface shape = factory.getShape("Rectangle");
        shape.draw();
    }
}
