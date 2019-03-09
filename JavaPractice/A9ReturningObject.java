class A9ReturningObject {
    public static void main(String args[]) {
        BaseClass BC = new BaseClass();
        BaseClass BCObj = BC.incrByTen();
        System.out.println("The Incremented Object Is :: " + BCObj.A);

    }
}

class BaseClass {
    public int A = 10;

    public BaseClass incrByTen() {
        A += 10;
        return this;
    }
}