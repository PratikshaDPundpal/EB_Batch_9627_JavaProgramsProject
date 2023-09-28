package programsproject;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    int add(int a, int b) {
        return a + b + 10;
    }
    
    double multiply(double a, double b) {
        return a * b;
    }
}

public class MethodOverloadingandMethodOverriding {
    public static void main(String[] args) {
        Calculator basicCalculator = new Calculator();
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        
        System.out.println("Basic Calculator:");
        System.out.println("Int addition: " + basicCalculator.add(5, 7));
        System.out.println("Double addition: " + basicCalculator.add(3.5, 2.5));
        
        System.out.println("\nAdvanced Calculator:");
        System.out.println("Overridden int addition: " + advancedCalculator.add(5, 7));
        System.out.println("Double multiplication: " + advancedCalculator.multiply(3.5, 2.5));
    }
}
