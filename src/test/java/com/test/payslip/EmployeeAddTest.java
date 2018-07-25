/*package com.test.payslip;
import java.io.IOException;
//import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


//@Test
//Open Add page in pay slips
public class EmployeeAddTest {

	private WebDriver driver;
	private static final String PAYSLIPS_URL = "http://localhost:8080/employee-payslips/#!/login#employee";

	static Map<String, Object[]> testresultdata;

	@BeforeTest
	public static void beforeTest() throws EncryptedDocumentException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/vishali/Downloads/chromedriver_win32/chromedriver.exe");
	}

	@Test(priority = 1)
	public void successfulLogin() {
		try {
			driver = new ChromeDriver();
			driver.get(PAYSLIPS_URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement username = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[1]/input"));
			username.sendKeys("admin");
			username.submit();
			WebElement password = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[2]/input"));
			password.sendKeys("admin");
			password.submit();
			WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[4]/button"));
			loginbutton.click();
			WebElement Employee = driver.findElement(By.xpath("//*[@id=\"MainMenu\"]/div[1]/a[1]"));
			Employee.click();
			Thread.sleep(5000);
			WebElement Add = driver.findElement(By.xpath("//*[@id=\"employee\"]/a[1]"));
			Add.click();
			// Thread.sleep(5000);
			// driver.quit();

		} catch (Exception ex) {
			testresultdata.put("2", new Object[] { 1d, "login with valid credentials", "login successful", "Fail" });
		}
	}

}
*/