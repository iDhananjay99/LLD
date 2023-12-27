package LLD.FactoryDesignPattern.Cources.CourceFactory;

import LLD.FactoryDesignPattern.Cources.CourceFactory.Modules.M1;
import LLD.FactoryDesignPattern.Cources.CourceFactory.Modules.M3;
import LLD.FactoryDesignPattern.Cources.CourceFactory.Modules.M4;

public class LLDCourse extends Factory{

    LLDCourse(){
        super.arr.add(new M1());
        super.arr.add(new M4());
        super.arr.add(new M3());
    }
}
