package com.bitrix.step_definitions;

import com.bitrix.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before     //run before every scenario
    public void setup0(Scenario scenario){
        Driver.getDriver().manage().window().maximize();

        System.out.println(scenario.getName() + " is running through automation");
    }

    @BeforeStep  //run before every step
    public void setup(){
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterStep  //run after every step
    public void evidence(Scenario scenario){

        byte[] data = (  (TakesScreenshot)Driver.getDriver()  ).getScreenshotAs(OutputType.BYTES);
        scenario.attach(data, "image/png", scenario.getName());

    }

    @After     //run after every scenario
    public void tearDown(Scenario scenario){

        System.out.println(scenario.getName() + " is ending");

        Driver.closeDriver();


    }




}
