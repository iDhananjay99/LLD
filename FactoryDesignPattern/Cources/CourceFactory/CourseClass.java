package LLD.FactoryDesignPattern.Cources.CourceFactory;

public class CourseClass {
    public static Factory getCourse(String input){
        return switch (input) {
            case "LLD" -> new LLDCourse();
            case "HLD" -> new HLDCourse();
            default -> null;
        };
    }
}
