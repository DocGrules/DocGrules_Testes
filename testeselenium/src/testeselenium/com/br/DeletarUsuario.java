package testeselenium.com.br;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DeletarUsuario {
	
	
	private WebDriver driver = null;

	public DeletarUsuario (WebDriver driver) {
		this.driver = driver;
	
	
}
	
	
	public void deletar() {
		
		driver.findElement(By.linkText("Eliminar")).click();
		
		
		
	}

}
