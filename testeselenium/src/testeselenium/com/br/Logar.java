package testeselenium.com.br;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Logar {
	
	
	private WebDriver driver = null;

	public Logar (WebDriver driver) {
		this.driver = driver;
	
	
}
	
	public void LogarNoSistema () {
		
		driver.get("http://localhost/sistemaphp/");
		
		WebElement usuario = driver.findElement(By.id("usu"));
		WebElement senha = driver.findElement(By.id("pass"));
		WebElement botaologar = driver.findElement(By.name("botao"));
		
		usuario.sendKeys("admin");
		senha.sendKeys("admin");
		botaologar.submit();
	}

}
