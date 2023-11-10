package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomobileInsurancePage {

	protected WebDriver driver;

	public AutomobileInsurancePage(WebDriver driver) {
		this.driver = driver;
	}

	public AutomobileInsurancePage abaFormulario(String aba) {

		if (aba.equals("Enter Vehicle Data")) {

			WebDriverWait wait = new WebDriverWait(driver, 15);
			@SuppressWarnings("unused")
			WebElement pageVehicle = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("make"))));

			WebElement comboMake = driver.findElement(By.id("make"));
			Select select = new Select(comboMake);
			select.selectByVisibleText("Volkswagen");
			
			driver.findElement(By.id("engineperformance")).sendKeys("1500");
			
			driver.findElement(By.id("dateofmanufacture")).sendKeys("11/10/2023");
			
			WebElement comboNumberSeats = driver.findElement(By.id("numberofseats"));
			select = new Select(comboNumberSeats);
			select.selectByVisibleText("1");
			
			WebElement comboFuel = driver.findElement(By.id("fuel"));
			select = new Select(comboFuel);
			select.selectByVisibleText("Petrol");
			
			driver.findElement(By.id("listprice")).sendKeys("15000");

			driver.findElement(By.id("licenseplatenumber")).sendKeys("0987654321");
			
			driver.findElement(By.id("annualmileage")).sendKeys("10000");
			

			driver.findElement(By.id("nextenterinsurantdata")).click();

		}
		if (aba.equals("Enter Insurant Data")) {

			WebDriverWait wait = new WebDriverWait(driver, 15);
			@SuppressWarnings("unused")
			WebElement pageInsurant = wait
					.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("firstname"))));

			driver.findElement(By.id("firstname")).sendKeys("Rafael");

			driver.findElement(By.id("lastname")).sendKeys("Coura");

			driver.findElement(By.id("birthdate")).sendKeys("12/24/1987");

			driver.findElement(By.xpath("//form[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();

			driver.findElement(By.id("streetaddress")).sendKeys("Rua Conselheiro Lafayette");

			WebElement comboNumberSeats = driver.findElement(By.id("country"));
			Select select = new Select(comboNumberSeats);
			select.selectByVisibleText("Brazil");

			driver.findElement(By.id("zipcode")).sendKeys("09550001");

			driver.findElement(By.id("city")).sendKeys("São Caetano do Sul");

			WebElement comboOccupation = driver.findElement(By.id("occupation"));
			select = new Select(comboOccupation);
			select.selectByVisibleText("Employee");

			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span")).click();

			driver.findElement(By.id("website")).sendKeys("www.rafaelcoura.com.br");

			driver.findElement(By.id("nextenterproductdata")).click();

		}
		if (aba.equals("Enter Product Data")) {

			WebDriverWait wait = new WebDriverWait(driver, 15);
			@SuppressWarnings("unused")
			WebElement pageProduct = wait
					.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("startdate"))));

			driver.findElement(By.id("startdate")).sendKeys("11/10/2024");

			WebElement comboInsurance = driver.findElement(By.id("insurancesum"));
			Select select = new Select(comboInsurance);
			select.selectByVisibleText("5.000.000,00");

			WebElement comboMerit = driver.findElement(By.id("meritrating"));
			select = new Select(comboMerit);
			select.selectByVisibleText("Bonus 10");

			WebElement comboDamage = driver.findElement(By.id("damageinsurance"));
			select = new Select(comboDamage);
			select.selectByVisibleText("No Coverage");

			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();

			WebElement comboCourtesyCar = driver.findElement(By.id("courtesycar"));
			select = new Select(comboCourtesyCar);
			select.selectByVisibleText("Yes");

			driver.findElement(By.id("nextselectpriceoption")).click();

		}
		if (aba.equals("Select Price Option")) {

			WebDriverWait wait = new WebDriverWait(driver, 15);
			@SuppressWarnings("unused")
			WebElement pagePrice = wait
					.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("priceTable"))));

			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")).click();

			WebElement btnNext = wait
					.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("nextsendquote"))));
			btnNext.click();

		}
		if (aba.equals("Send Quote")) {

			WebDriverWait wait = new WebDriverWait(driver, 15);
			@SuppressWarnings("unused")
			WebElement pageSendQuote = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));

			driver.findElement(By.id("email")).sendKeys("r_coura@hotmail.com");

			driver.findElement(By.id("phone")).sendKeys("5511998737708");

			driver.findElement(By.id("username")).sendKeys("Rafael");

			driver.findElement(By.id("password")).sendKeys("Senha@123");

			driver.findElement(By.id("confirmpassword")).sendKeys("Senha@123");

			driver.findElement(By.id("Comments")).sendKeys("Cadastro Finalizado!");

		}

		return this;
	}

}
