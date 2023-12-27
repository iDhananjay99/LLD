package LLD.FactoryDesignPattern.Cources.CourceFactory;
import LLD.FactoryDesignPattern.Cources.CourceFactory.Modules.*;

public class HLDCourse extends Factory{

    HLDCourse(){
        super.arr.add(new M1());
        super.arr.add(new M3());
    }

}
