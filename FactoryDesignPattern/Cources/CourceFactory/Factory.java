package LLD.FactoryDesignPattern.Cources.CourceFactory;

import LLD.FactoryDesignPattern.Cources.CourceFactory.Modules.ModuleInterface;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    List<ModuleInterface> arr = new ArrayList<ModuleInterface>();

    void printCourseModules(){
        System.out.println(arr);
    }
}
