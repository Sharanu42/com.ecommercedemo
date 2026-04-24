package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MainClass {
    public  void Dothis() {
        System.out.println("Hello World");
    }
    @BeforeMethod
    public void   BeforeRun() {
        System.out.println("i am here before run");
    }
    @AfterMethod
    public void   AfterRun() {
        System.out.println("i am here after run");
    }
}
