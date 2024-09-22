public strictfp class StrictfpExample {

    public static void main(String[] args) {

        double num1 = 1e+11; // This is equivalent to 10e+10
        double num2 = 6e+08;

        double result = num1 / num2;
        System.out.println("Result is: " + result);

    }

}
