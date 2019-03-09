class A8Reccursion {
    public static void main(String args[]) {
        int FactorialResult = factorial(3);
        System.out.println("Factorial Is :" + FactorialResult);
    }

    static int result = 1;

    public static int factorial(int x) {

        if (x == 1) {
            return 1;
        } else {
            result *= x;

            factorial(x - 1);
        }
        return result;

    }
}