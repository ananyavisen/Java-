class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    float add(float a, float b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

 class Test {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(5, 10));
        System.out.println("Sum of two floats: " + calc.add(5.5f, 2.3f));
        System.out.println("Sum of three integers: " + calc.add(2, 4, 6));
    }
}
