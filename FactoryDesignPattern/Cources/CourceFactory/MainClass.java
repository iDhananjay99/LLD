package LLD.FactoryDesignPattern.Cources.CourceFactory;

public class MainClass {
    public static void main(String[] args) {
        Factory c1 = CourseClass.getCourse("LLD");
        c1.printCourseModules();

        Factory c2 = CourseClass.getCourse("HLD");
        c2.printCourseModules();
    }
}
