package Class01;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void login(){
        System.out.println(10/0);

    }
    @Test(dependsOnMethods = "login")
    public void verificationDashboard(){

        System.out.println("This is Dashboard");


    }

}
