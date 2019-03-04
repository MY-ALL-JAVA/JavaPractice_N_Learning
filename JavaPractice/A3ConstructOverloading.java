class A3ConstructorOverloading{

    public static void main(String args[]){
        //making new object here
        int Length = 5; //Declaring Access Specifier Here will be an error :Illegal Start Of Expression:
        int Width = 6;
        int Depth = 7;
    
        OverloadedConstructor Area = new OverloadedConstructor(3, 4);
        OverloadedConstructor Volume = new OverloadedConstructor(Length, Width, Depth);

        int AreaValue = 0;
        AreaValue = Area.area();

        int VloumeValue = 0;
        VloumeValue = Volume.volume();

        System.out.println("The Area Is = "+AreaValue);
        System.out.println("Volume is = "+VloumeValue);
    }
}



class OverloadedConstructor{
    private int Length = 0;
    private int Width = 0;
    private int Depth = 0;

    //Overloaded Constructor
    OverloadedConstructor(int Length, int Width){
        this.Length = Length;
        this.Width = Width;
    }

    OverloadedConstructor(int Length, int Width, int Depth){
        this.Length = Length;
        this.Width = Width;
        this.Depth = Depth;
    }

    int area(){
        return Length*Width;
    }

    int volume(){
        return Length*Width*Depth;
    }
}
