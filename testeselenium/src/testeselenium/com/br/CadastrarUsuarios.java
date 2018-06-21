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
	
	public void cadastrar(String nome, String idade, String endereco) {
		
		driver.findElement(By.linkText("Novo Contato")).click();
		
		
		WebElement camponome = driver.findElement(By.id("nome1"));
		WebElement campoidade = driver.findElement(By.id("idade1"));
		WebElement campoend = driver.findElement(By.id("endereco1"));
		WebElement botaoSalvar = driver.findElement(By.name("salvar"));
		
		
		camponome.sendKeys(nome);
		campoidade.sendKeys(idade);
		campoend.sendKeys(endereco);
		botaoSalvar.submit();
		
		
	}

	

     
	public void editar() {
		
		List<WebElement>	lista = driver.findElements(By.linkText("Editar"));
	    lista.get(3).click();
	    
	     
	     
	     driver.findElement(By.id("nome")).clear();
	     driver.findElement(By.id("idade")).clear();
	     driver.findElement(By.id("endereco")).clear();
	     
	 	WebElement camponome = driver.findElement(By.id("nome"));
		WebElement campoidade = driver.findElement(By.id("idade"));
		WebElement campoend = driver.findElement(By.id("endereco"));
		WebElement botaoEnviar = driver.findElement(By.name("enviar"));
		
		
		camponome.sendKeys("Luiz Antonio");
		campoidade.sendKeys("22");
		campoend.sendKeys("Rua Vem pra mim");
		botaoEnviar.submit();
		
	   
	
	}
	
     public void eliminar() {
    	 
         List<WebElement>	lista = driver.findElements(By.linkText("Eliminar"));
         lista.get(0).click();
        
         
          WebElement botaoEliminar = driver.findElement(By.name("eliminar"));
  		 
          botaoEliminar.submit();
  		 
  			
}
     
     public void fechar () {
    	 
    	 driver.close();
		 driver.quit();
    	 
     }
     
     
}
