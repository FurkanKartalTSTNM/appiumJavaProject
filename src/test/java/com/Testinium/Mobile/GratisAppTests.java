package com.Testinium.Mobile;

import org.openqa.selenium.By;

public class GratisAppTests extends HookImpl {

    StepImpl step= new StepImpl();

    @org.junit.jupiter.api.Test
    public void IOSBasicTestSuccess01() throws InterruptedException {

        step.waitBySecond(3);
        appiumDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Markalar\"]")).click();
        step.waitBySecond(3);
        appiumDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Kategoriler\"]")).click();
        step.waitBySecond(3);
        appiumDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Kampanyalar\"]")).click();
        step.waitBySecond(3);
        appiumDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Markalar\"]")).click();
        step.waitBySecond(3);
        appiumDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Kategoriler\"]")).click();
        step.waitBySecond(3);
        appiumDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Kampanyalar\"]")).click();
        step.waitBySecond(3);

    }

    @org.junit.jupiter.api.Test
    public void AndroidBasicTestSuccess01() throws InterruptedException {

        step.waitBySecond(3);
        appiumDriver.findElement(By.id("com.gratis.android:id/nav_graph_trademarks")).click();
        step.waitBySecond(3);
        appiumDriver.findElement(By.id("com.gratis.android:id/nav_graph_categories")).click();
        step.waitBySecond(3);
        appiumDriver.findElement(By.id("com.gratis.android:id/nav_graph_campaignnnn")).click();
        step.waitBySecond(3);
        appiumDriver.findElement(By.id("com.gratis.android:id/nav_graph_trademarks")).click();
        step.waitBySecond(3);
        appiumDriver.findElement(By.id("com.gratis.android:id/nav_graph_categories")).click();
        step.waitBySecond(3);
        appiumDriver.findElement(By.id("com.gratis.android:id/nav_graph_campaign")).click();
        step.waitBySecond(3);

    }

    @org.junit.jupiter.api.Test
    public void WaitStep() throws InterruptedException {

        step.waitBySecond(3);


    }


}
