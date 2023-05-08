package HW7.controler;

import HW7.model.Calculatable;
import HW7.model.Number;

public class Calculator<N extends Number> {

    public N summ (N arg1, N arg2){
        N sum = (N) arg1.sum(arg2);
        return sum;
    }

    public N subtraction (N arg1, N arg2){
        N sub = (N) arg1.subtraction(arg2);
        return sub;
    }
}
