package tests;

public class SubClass2 {

    int a;

    public SubClass2(int a) {
        this.a=a;
    }

    public int Increment(){

        a=a+1;
        return a;
    }
    public int Decrement(){
        a=a-1;
        return a;
    }

}
