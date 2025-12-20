//HomeWorkTask04

public class ComplexNumber extends RealNumber {
    
    public double imaginary_number;

    public ComplexNumber() {
        super(1.0);
        this.imaginary_number = 1.0;
    }

    public ComplexNumber(double real_number, double imaginary_number) {
        super(real_number);
        this.imaginary_number = imaginary_number;
    }

    public String details() {
        return getReal() + "\nImaginaryPart: " + this.imaginary_number;
    }
}