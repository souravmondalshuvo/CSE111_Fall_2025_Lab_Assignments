/*
Task 4

Design the ComplexNumber class with the necessary property to produce the output from the given driver code. 

Driver Code and Parent Class 
public class ComplexNumberTester {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber();
        System.out.println(cn1.details());
        System.out.println("----------------");
        ComplexNumber cn2 = new ComplexNumber(5.0, 7.0);
        System.out.println(cn2.details());
    }
}

public class RealNumber {
    public double realValue;
    public RealNumber() {
        this(0.0);
    }
    public RealNumber(double realValue) {
        this.realValue = realValue;
    }
    public String getReal(){
        return "RealPart: " + realValue;
    }
}

Output
RealPart: 1.0
ImaginaryPart: 1.0
----------------
RealPart: 5.0
ImaginaryPart: 7.0
*/

public class ComplexNumberTester {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber();
        System.out.println(cn1.details());
        System.out.println("----------------");
        ComplexNumber cn2 = new ComplexNumber(5.0, 7.0);
        System.out.println(cn2.details());
    }
}