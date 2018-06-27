package testeselenium.com.br;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastrarEvento {
	
	
	
	
	private WebDriver driver = null;

	public CadastrarEvento (WebDriver driver) {
		this.driver = driver;
	
	
}
	
	public void cadastrar(String tema, String semestre) {
		
		driver.findElement(By.linkText("Evento")).click();
		
		driver.findElement(By.linkText("Novo Evento")).click();
		
		
		WebElement campotema = driver.findElement(By.name("txttema"));
		WebElement camposemestre = driver.findElement(By.name("txtsemestre"));
		WebElement botaoEnviar = driver.findElement(By.name("enviar"));
		
		
		campotema.sendKeys(tema);
		camposemestre.sendKeys(semestre);
		botaoEnviar.submit();
				
	}


     
	public void editar() {
		
		driver.findElement(By.linkText("Evento")).click();
		
		List<WebElement>	lista = driver.findElements(By.name("editar"));
	    lista.get(0).click();
	    
	     
	     
	     driver.findElement(By.name("txttema")).clear();
	     driver.findElement(By.name("txtsemestre")).clear();
	   
	     
	     WebElement campotema = driver.findElement(By.name("txttema"));
		 WebElement camposemestre = driver.findElement(By.name("txtsemestre"));
		 WebElement botaoEnviar = driver.findElement(By.name("enviar"));
		
		campotema.sendKeys("SEGURANÇA DA INFORMAÇÃO");
		camposemestre.sendKeys("1");
		botaoEnviar.submit();
		
	   
	
	}
	
     public void deletar() {
    	 
    	 driver.findElement(By.linkText("Evento")).click();
    	 
         List<WebElement>	lista = driver.findElements(By.name("deletar"));
         lista.get(0).click();
        
         
          
  		 
  			
}
     

}
