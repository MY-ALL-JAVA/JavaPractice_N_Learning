class A6TypeCasting{
    public static void main(String args[]){
        int I = 100;
        long L = 0;
        

        L = I;
        float F = I;
        System.out.println("The Casted Value is : " + L);
        System.out.println("The Float casted value is : " + F);

        System.out.println("Directly castin an integer value "+(float)I);

        // float Test;
        // Test = I;
    }
}