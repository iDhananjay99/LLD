package LLD.FactoryDesignPattern.Cources.ShapeFactory.FactoryPackage;

public class ShapeFactory {
    public ShapeInterface getShape(String input){

        return switch (input) {
            case "Circle" -> new CircleClass();
            case "Rectangle" -> new RectangleClass();
            default -> new SquareClass();
        };
    }
}
