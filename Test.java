package SampleTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	
		public static ChromeDriver driver;
	    public static void main(String[] args) throws Throwable  {
	    	ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        
	        
	    	ChromeDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
			driver.get("https://tijarah-qa.vercel.app");
			Thread.sleep(5000);
			driver.findElement(By.id("mui-component-select-country")).click();
			driver.findElement(By.xpath("//*[contains(text(),'+91')]")).click();
			driver.findElement(By.id("phone")).sendKeys("1000000000");
			driver.findElement(By.id(":r2:")).sendKeys("00004444");
			driver.findElement(By.xpath("//*[contains(text(),'Log In')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[contains(text(),'Billing')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("device")).click();
//			Actions actions = new Actions(driver);
//			Thread.sleep(2000);
//			WebElement dropdown = driver.findElement(By.xpath("//*[@aria-activedescendant='device-option-0']"));
//			actions.moveToElement(dropdown).perform();
//			actions.click(dropdown).perform();
			 Robot robot = new Robot();
			 robot.keyPress(KeyEvent.VK_DOWN);
	         robot.keyRelease(KeyEvent.VK_DOWN);
	         robot.keyPress(KeyEvent.VK_ENTER);
	         robot.keyRelease(KeyEvent.VK_ENTER);
	         driver.findElement(By.id(":r16:")).click();
	         Thread.sleep(3000);
	         driver.findElement(By.id(":r17:")).sendKeys("100");
	        driver.findElement(By.id(":r18:")).click();
	        driver.findElement(By.xpath("//*[contains(text(),'Keypad')]")).click();
	        driver.findElement(By.id(":r19:")).sendKeys("10");
	        driver.findElement(By.xpath("//*[contains(text(),'Add')]")).click();
	        driver.findElement(By.xpath("//*[contains(text(),'Catalogue')]")).click();
	        driver.findElement(By.xpath("//*[contains(text(),'Mobile Charger')]")).click();
	        driver.findElement(By.xpath("//*[contains(text(),'65 W')]")).click();
	        driver.findElement(By.xpath("//*[contains(text(),'Add')]")).click();
	        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Tomato')]"));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth'});", element);
	        element.click();
	        driver.findElement(By.id(":r1f:")).sendKeys("10");
	        driver.findElement(By.id(":r1g:")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButtonGroup-grouped MuiButtonGroup-groupedHorizontal MuiButtonGroup-groupedOutlined MuiButtonGroup-groupedOutlinedHorizontal MuiButtonGroup-groupedOutlinedPrimary MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButtonGroup-grouped MuiButtonGroup-groupedHorizontal MuiButtonGroup-groupedOutlined MuiButtonGroup-groupedOutlinedHorizontal MuiButtonGroup-groupedOutlinedPrimary css-1a1pm44']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id(":r1h:")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@class='MuiCardContent-root css-d02ytb']//*[contains(text(),'SAR 35.00')]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@data-testid='CloseIcon']")).click();
	        System.out.println("Test -1 : Billing has been created for selected products");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@class='css-1abzdwk'][1]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[contains(text(),'Products Catalogue')]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[@class='MuiBox-root css-1rhspvg']//following::span[contains(text(),'Products')][2]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[contains(text(),'Create')]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@name='productNameEn']")).sendKeys("Test1");
	        driver.findElement(By.xpath("//*[@name='productNameAr']")).sendKeys("Test1");
	        WebElement brands = driver.findElement(By.xpath("//*[@name='productDescription']"));
	        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth'});", brands);
	        Thread.sleep(2000);
	        driver.findElement(By.id("Brands")).click();
	        Thread.sleep(2000);
	        robot.keyPress(KeyEvent.VK_DOWN);
	         robot.keyRelease(KeyEvent.VK_DOWN);
	         robot.keyPress(KeyEvent.VK_ENTER);
	         robot.keyRelease(KeyEvent.VK_ENTER);
	         driver.findElement(By.id("reportingCategory")).click();
	         robot.keyPress(KeyEvent.VK_DOWN);
	         robot.keyRelease(KeyEvent.VK_DOWN);
	         robot.keyPress(KeyEvent.VK_ENTER);
	         robot.keyRelease(KeyEvent.VK_ENTER);
	         WebElement Variant = driver.findElement(By.xpath("//*[@name='sku']"));
	         Thread.sleep(2000);
	         js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth'});", Variant);
	         Variant.sendKeys("86454");
	         WebElement Submit = driver.findElement(By.xpath("//*[contains(text(),'Add Order Types')]"));
	         Thread.sleep(2000);
	         js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth'});", Submit);
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//*[@class='MuiBox-root css-1lekzkb']//*[contains(text(),'Create')]")).click();
	         System.out.println("Test -2 :order has been Created sucessfully");
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("//tr[2]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-17mpv82']")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//*[@name='productNameEn']")).sendKeys("Test2");
	         driver.findElement(By.xpath("//button[contains(text(),\"Update\")]")).click();
	         System.out.println("Test -3 :order updated");
	         Thread.sleep(5000);
	         WebElement scrolldelete = driver.findElement(By.xpath("//*[contains(text(),'Create')]"));
	         js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth'});", scrolldelete);
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//tr[1]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-uzgi6i']")).click();
	         Thread.sleep(2000);
	         WebElement delete = driver.findElement(By.xpath("//*[contains(text(),\"Delete\")]"));
	         js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth'});", delete);
	         Thread.sleep(2000);
	         delete.click();
	         driver.findElement(By.xpath("//div[@class='MuiDialogContent-root css-1ty026z']//following::button[contains(text(),\"Delete\")]")).click();
	         System.out.println("Test -4 :order deleted");
	}
	  
}
