class A4SystemDotGc{
    public static void main(String args[]){
        System.out.println("I am from main method");

        int IntegerArray[] = {3, 5, 7};


        System.gc();
        System.out.println("Called The Garbage Collector & Freed up the Memory resources..");
    }
}