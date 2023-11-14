package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		
		WebElement dropdown = driver.findElement(By.name("awareness_source_c"));
		Select select = new Select(dropdown);
		
		select.selectByValue("YouTube");
		
		//select.selectByVisibleText("YouTube");
		
		//select.selectByIndex(5);
		
		driver.close();

	}

}
