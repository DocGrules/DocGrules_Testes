package testeselenium.com.br;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contato {
	
	
	
	private WebDriver driver = null;

	public Contato (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Contatos() {
		
	driver.findElement(By.linkText("Contato")).click();
	
	
	}

}
