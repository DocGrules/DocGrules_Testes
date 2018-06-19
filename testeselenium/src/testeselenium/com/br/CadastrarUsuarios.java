package testeselenium.com.br;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastrarUsuarios {
	
	private WebDriver driver = null;

	public CadastrarUsuarios (WebDriver driver) {
		this.driver = driver;
	
	
}
	
	public void cadastrar() {
		
		driver.findElement(By.linkText("Novo Contato")).click();
		
		
		WebElement nome = driver.findElement(By.id("nome"));
		WebElement idade = driver.findElement(By.id("idade"));
		WebElement endereco = driver.findElement(By.id("endereco"));
		WebElement botaoSalvar = driver.findElement(By.name("salvar"));
		
		nome.sendKeys("Luiz José Gonçalves");
		idade.sendKeys("65");
		endereco.sendKeys("Rua Monteiro Lobato, 75 - Cidade Nobre");
		botaoSalvar.submit();
		
	}
		
		public void editar () {
			
			List<WebElement> lista = driver.findElements(By.className("editar"));
			lista.get(0).click();
			
			
		}
		
		

	
				
}
