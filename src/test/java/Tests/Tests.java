package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tests extends BaseClass{
	
	@Test
	public void TestOne() throws InterruptedException {
		extent.createTest("Alert 1");
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("Completed Test One ...");  
		Thread.sleep(2000);
		extent.flush();
	}
	
	@Test
	public void LoginTest() throws InterruptedException {
		extent.createTest("Alert 2");
		//katalon record : pour enregistrer no scas de tests et ensuite nous pouvons l'exporter dans différents langage de programmation
		// il enregistre tous nos actions
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div/header/div/div[2]/ul/li/span")).click();		  
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Logout")).click();
	    Thread.sleep(2000);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    extent.flush();
		
	    /*driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/div/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/div/div/input")).sendKeys("Ramisa Rakib Chowdhury");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div[5]/div/div[2]/div/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div[5]/div/div[2]/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div[5]/div/div[2]/div/div/input")).sendKeys("Peter Mac Anderson");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div[2]/div/div[2]/input")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div[2]/div/div[2]/input")).clear();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div[2]/div/div[2]/input")).sendKeys("951426");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div[6]/div/div[2]/div/div/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div[3]/div/div[2]/div/div/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div[7]/div/div[2]/div/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div[4]/div/div[2]/div/div/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div[2]/div/button")).click();
	    Thread.sleep(2000);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
	    driver.findElement(By.name("firstName")).click();
	    driver.findElement(By.name("firstName")).clear();
	    driver.findElement(By.name("firstName")).sendKeys("Mariem");
	    Thread.sleep(2000);
	    driver.findElement(By.name("middleName")).click();
	    driver.findElement(By.name("middleName")).clear();
	    driver.findElement(By.name("middleName")).sendKeys("mimi");
	    Thread.sleep(2000);
	    driver.findElement(By.name("lastName")).click();
	    driver.findElement(By.name("lastName")).clear();
	    driver.findElement(By.name("lastName")).sendKeys("Taieb");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/42");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div[2]/div/div[2]/div/div/i")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[3]/div[6]/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div/div[2]/div/div[2]/div/div/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div/div/div/div[2]/div/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div[2]/div/div/div[2]/div/div/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[13]/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div/div/div/div[2]/div/div/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']/div/div/header/div/div[2]/ul/li/span/p")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Déconnexion")).click();
	    Thread.sleep(2000);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");*/
		
		System.out.println("Completed login test ...");   
	}

}
