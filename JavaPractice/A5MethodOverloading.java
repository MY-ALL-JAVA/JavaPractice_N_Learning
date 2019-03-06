class A5MethodOverloading{
    public static void main(String Args[]){

    OverLoader Obj = new OverLoader();

    int SumTwo = Obj.adder(4, 5);
    int SumThree = Obj.adder(6);

    System.out.println("Sum Of Two Number is :: " + SumTwo);
    System.out.println("Sum of Three Number is :: " + SumThree);
    System.out.println("Find Out The Third Number ..?? ..?? ..?? :) :) (: ");
    }
}


class OverLoader{
    private int First = 0;
    private int Second = 0;
    private int Third = 0;

    protected int adder(int One, int Two){
        this.First = One;
        this.Second = Two;

        return this.First + this.Second;
    }

    protected int adder(int Three){
        this.Third = Three;

        return this.First + this.Second + this.Third;
    }

}