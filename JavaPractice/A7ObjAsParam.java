class A7ObjAsParam{
    public static void main(String args[]){
        MyObject NewObj = new MyObject(5, 6);
        int Result = 0;
        Result = NewObj.sumMaker(NewObj);

        System.out.println("The Result IS : " + Result);
    }
}


class MyObject{
    private int I = 0;
    private int J = 0;

    MyObject(int I, int J){
        System.out.println("The Constructor is Initialised");
        this.I = I;
        this.J = J;
    }

    int sumMaker(MyObject Obj){
        return Obj.I + Obj.J;
    }
}