package Tests;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	AppiumDriver driver;
	ExtentReports extent;

	//Testng annotations:  @BeforTest, @AfterTest
	@BeforeTest
	// fonction de configuration
	public void setup() {
		try {
			ExtentHtmlReporter reporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"//reports//ExtentReport.html");
			reporter.config().setReportName("Android App Automation");
			reporter.config().setDocumentTitle("Test Results");
			
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			
			//je vais effacer les capacités souhaités
			DesiredCapabilities caps = new DesiredCapabilities();
			
			// vous pouvez utiliser l'un des 3 mais parmis les bonne pratique d'utiliser 3 et 2 parce que lorsque tu oublie tu trouve la liste
			//caps.setCapability("plateformName","ANDROID");
			//caps.setCapability(CapabilityType.PLATFORM_NAME,"ANDROID");
			
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			//settings -> à propos de l'appareil -> infos logiciel -> version Android
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"6.0.1");
			//settings -> a propos de l'appareil -> numéro du modéle
			caps.setCapability(MobileCapabilityType.DEVICE_NAME,"SM-G532F");
			//cmd -> adb devices
			caps.setCapability(MobileCapabilityType.UDID,"4200e4070783b4af");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 100 );
			caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
			
		    //on va passer l'url de notre serveur appium
		    URL url = new URL("http://0.0.0.0:4723/wd/hub");
		    //je dois envoyes les capability au serveur appium
		    //AppiumDriver: une classe parente pour androiddriver et iosdriver
		    driver = new AppiumDriver(url,caps);
		   //AndroidDriver Androiddriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		   //IOSDriver IOSdriver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		     
		    
		}catch(Exception exp) {
			
			System.out.println("Cause is: "+exp.getCause());
			System.out.println("Message is: "+exp.getMessage());
			exp.printStackTrace();
			
		}
	}
	
	@Test
	public void sampleTest() {
		System.out.println("I am inside sample Test");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
