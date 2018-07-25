package com.test.payslip;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmployeeAd {

	private static WebDriver driver;
	private static final String PAYSLIPS_URL = "http://localhost:8080/employee-payslips/#!/login#employee";

	static Map<String, Object[]> testresultdata;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/vishali/Downloads/chromedriver_win32/chromedriver.exe");
		AddEmployeeDetails();
		AddSalary();

	}
	
	public static void AddEmployeeDetails() {
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
			Thread.sleep(5000);
			WebElement Empid = driver.findElement(By.xpath("//*[@id=\"empid\"]"));
			Empid.sendKeys("1");
			Thread.sleep(1000);
			WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
			FirstName.sendKeys("ABC");
			Thread.sleep(1000);
			WebElement SurName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
			SurName.sendKeys("XYZ");
			Thread.sleep(1000);
			WebElement username1 = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
			username1.sendKeys("Vishali");
			Thread.sleep(1000);
			WebElement password1 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
			password1.sendKeys("password");
			Thread.sleep(1000);
			WebElement DOB = driver.findElement(By.xpath("//*[@id=\"dob\"]"));
			DOB.sendKeys("01012018");
			Thread.sleep(1000);
			WebElement Address = driver.findElement(By.xpath("//*[@id=\"address\"]"));
			Address.sendKeys("Dummy Address");
			Thread.sleep(1000);
			WebElement PhoneNo = driver.findElement(By.xpath("//*[@id=\"phoneNo\"]"));
			PhoneNo.sendKeys("1010101010");
			Thread.sleep(1000);
			WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
			Email.sendKeys("abc@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"departmentName\"]")).sendKeys("QA ");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"designationName\"]")).sendKeys("developer ");
			Thread.sleep(1000);
			WebElement PanNo = driver.findElement(By.xpath("//*[@id=\"panNo\"]"));
			PanNo.sendKeys("1234");
			Thread.sleep(1000);
			WebElement UAN = driver.findElement(By.xpath("//*[@id=\"pfNo\"]"));
			UAN.sendKeys("1234");
			Thread.sleep(1000);
			WebElement HireDate = driver.findElement(By.xpath("//*[@id=\"hireDate\"]"));
			HireDate.sendKeys("01012020");
			Thread.sleep(1000);
			WebElement Skype = driver.findElement(By.xpath("//*[@id=\"skypeId\"]"));
			Skype.sendKeys("abc@gmail.com");
			Thread.sleep(1000);
			//WebElement Submit = driver.findElement(By.xpath("//*[@id=\"addUserForm\"]/div[16]/div/button"));
		//	Submit.click();
			// driver.quit();
			System.out.println("Details Accepted Successfully####################");

		} catch (Exception ex) {
			System.out.println("Exception occured#######################");
			
		}
		}
		public static void AddSalary() {
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
				WebElement Salary = driver.findElement(By.xpath("//*[@id=\"MainMenu\"]/div[1]/a[3]"));
				Salary.click();
				Thread.sleep(1000);
				WebElement Add = driver.findElement(By.xpath("//*[@id=\"salary\"]/a[1]"));
				Add.click();
				WebElement EmployeeName = driver.findElement(By.xpath("//*[@id=\"empname\"]"));
				EmployeeName.sendKeys("ABC XYZ");
				Thread.sleep(1000);
				WebElement Bank = driver.findElement(By.xpath("//*[@id=\"BankName\"]"));
				Bank.sendKeys("icici");
				Thread.sleep(1000);
				WebElement Year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
				Year.sendKeys("2020");
				Thread.sleep(1000);

				List<WebElement> inputList = driver.findElements(By.cssSelector("input"));
				for (WebElement webElement : inputList) {
					if (webElement.getAttribute("id").equals("salary")) {
						webElement.sendKeys("1000");
					}

				}
				System.out.println("Details Accepted Successfully####################");
				Thread.sleep(1000);
				//WebElement Submit = driver.findElement(By.xpath("//*[@id=\"addUserForm\"]/div[5]/div/button"));
				//Submit.click();
			} catch (Exception ex) {
				ex.printStackTrace();
				System.out.println("Exception occured#######################");
				
			}
		
	}

}
