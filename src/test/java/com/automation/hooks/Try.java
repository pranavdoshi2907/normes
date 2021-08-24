package com.automation.hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try {
	static WebDriver driver1;
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"browserResouces/chromedriver.exe");
	driver1 = new ChromeDriver();
	driver1.get("https://app-dev16.ilo.org/NormesCEACR/article-22/expert/expert-review?SPHostUrl=https:%2F%2Fintranet-dev16.ilo.org%2Fcollaborate%2Fceacr&SPLanguage=en-US&SPClientTag=2&SPProductNumber=16.0.10350.20000&ReportSetRef=USA_A22_FL_C105_2021&Id=22134");
	String text = driver1.findElement(By.xpath("//body[1]/div[1]/app-root[1]/div[1]/div[1]/div[1]/div[1]/app-expert-inputs[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]")).getText();
	System.out.println(text);
}
}
