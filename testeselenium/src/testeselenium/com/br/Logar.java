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
		
		driver.get("http://localhost/sitegrules1/index.php");
		driver.manage().window().maximize();
		
		WebElement usuario = driver.findElement(By.name("txtusuario"));
		WebElement senha = driver.findElement(By.name("txtsenha"));
		WebElement botaologar = driver.findElement(By.name("login"));
		
		usuario.sendKeys("teste@teste.com");
		senha.sendKeys("123");
		botaologar.submit();
	}

}
