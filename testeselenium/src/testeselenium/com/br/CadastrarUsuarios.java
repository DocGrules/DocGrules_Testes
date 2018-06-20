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
		
		
		WebElement camponome = driver.findElement(By.id("nome"));
		WebElement campoidade = driver.findElement(By.id("idade"));
		WebElement campoend = driver.findElement(By.id("endereco"));
		WebElement botaoSalvar = driver.findElement(By.name("salvar"));
		
		
		camponome.sendKeys(nome);
		campoidade.sendKeys(idade);
		campoend.sendKeys(endereco);
		botaoSalvar.submit();
		
		
	}

	

     
     public void editar() {
    	 
       List<WebElement>	lista = driver.findElements(By.linkText("Editar"));
       lista.get(1).click();
      

		 driver.findElement(By.name("enviar")).submit();
		
		
		
 
   
    	     }
		
	
     public void eliminar() {
    	 
         List<WebElement>	lista = driver.findElements(By.linkText("Eliminar"));
         lista.get(0).click();
        
         
          
  		 driver.findElement(By.name("eliminar")).submit();
	

}
     
}
