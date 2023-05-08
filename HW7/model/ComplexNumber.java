package HW7.model;

public class ComplexNumber extends ComplexAdapter {
    //z1 = a1+b1i

    private int index;
    private int materialPart;
    private int imaginary;

    public int getIndex() {
        return index;
    }

    public int getMaterialPart() {
        return materialPart;
    }

    public int getImaginary() {
        return imaginary;
    }


    @Override
    public String toString() {
        if (imaginary < -1) {
            return String.format("z%d=%d-%di", index, materialPart, -(imaginary));
        }
        if (imaginary == -1) {
            return String.format("z%d=%d-i", index, materialPart);
        }
        if (imaginary == 1) {
            return String.format("z%d=%d+i", index, materialPart);
        }
        return String.format("z%d=%d+%di", index, materialPart, imaginary);

    }

    @Override
    public HW7.model.ComplexNumber subtraction(Number arg2) {
        HW7.model.ComplexNumber z1 = this;
        HW7.model.ComplexNumber z2 = (HW7.model.ComplexNumber) arg2;
        int nextA = z1.getMaterialPart() - z2.getMaterialPart();
        int nextB = z1.getImaginary() - z2.getImaginary();
        int maxInd = this.getIndex();
        if (z2.getIndex() > maxInd) maxInd = z2.getIndex();
        return new HW7.model.ComplexNumber(maxInd + 1, nextA, nextB);
    }

    @Override
    public ComplexNumber sum(Number arg2) {
        HW7.model.ComplexNumber z1 = this;
        HW7.model.ComplexNumber z2 = (HW7.model.ComplexNumber) arg2;
        int nextA = z1.getMaterialPart() + z2.getMaterialPart();
        int nextB = z1.getImaginary() + z2.getImaginary();
        int maxInd = this.getIndex();
        if (z2.getIndex() > maxInd) maxInd = z2.getIndex();
        return new ComplexNumber(maxInd + 1, nextA, nextB);
    }

    public ComplexNumber(int index, int materialPart, int imaginary) {
        this.index = index;
        this.materialPart = materialPart;
        this.imaginary = imaginary;
    }
}
