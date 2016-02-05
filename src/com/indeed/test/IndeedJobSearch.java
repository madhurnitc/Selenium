package com.indeed.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndeedJobSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://indeed.com");
		driver.findElement(By.id("what")).sendKeys("Software Engineer");
		driver.findElement(By.id("where")).clear();
		driver.findElement(By.id("where")).sendKeys("San Jose");
		driver.findElement(By.id("fj")).click();
		System.out.println(driver.findElement(By.id("searchCount")).getText());
		driver.close();

	}

}
