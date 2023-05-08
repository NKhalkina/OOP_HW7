package HW7.controler;

import HW7.model.ComplexNumber;

public class NumCreator {
    public ComplexNumber createComplexNumber (int index, int material, int imaginary){
        return new ComplexNumber(index, material, imaginary);
    }
}
