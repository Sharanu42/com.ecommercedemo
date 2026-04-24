package tests;

import org.testng.annotations.Test;

public class SubClass extends MainClass{

    @Test
    public void testSubClass( ){
        Dothis();
        SubClass2 subClass2 = new SubClass2(3);
        int a=3;

        System.out.println(subClass2.Increment());
        System.out.println(subClass2.Decrement());
    }
}
