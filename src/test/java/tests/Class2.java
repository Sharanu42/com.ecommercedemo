package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class2 {

    @Test
    public void demo2(){
        System.out.println("Class2 demo");
        //Assert.assertTrue(true,"Class2 demo");
        Assert.assertTrue(false, "Class2 demo intentionally failing");

    }
}
