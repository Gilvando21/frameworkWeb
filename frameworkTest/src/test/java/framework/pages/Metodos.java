package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {
	WebDriver driver;
	public void abrirNavegador(String appUrl, String navegador) {

		switch (navegador) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(appUrl);
			driver.manage().window().maximize();
			break;

		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\driver\\\\geckodriver.exe.url");
			driver = new FirefoxDriver();
			driver.get(appUrl);
			driver.manage().window().maximize();
			break;
	}

}
}