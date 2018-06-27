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
	
	public void cadastrar(String nome, String matricula, String periodo) {
		
		driver.findElement(By.linkText("Alunos")).click();
		
		driver.findElement(By.linkText("Novo Aluno")).click();
		
		
		WebElement camponome = driver.findElement(By.name("txtnome_completo"));
		WebElement campomatricula = driver.findElement(By.name("txtmatricula"));
		WebElement campoperiodo = driver.findElement(By.name("txtperiodo"));
		WebElement botaoEnviar = driver.findElement(By.name("enviar"));
		
		
		camponome.sendKeys(nome);
		campomatricula.sendKeys(matricula);
		campoperiodo.sendKeys(periodo);
		botaoEnviar.submit();
				
	}


     
	public void editar() {
		
		driver.findElement(By.linkText("Alunos")).click();
		
		List<WebElement>	lista = driver.findElements(By.name("editar"));
	    lista.get(0).click();
	    
	     
	     
	     driver.findElement(By.name("txtnome_completo")).clear();
	     driver.findElement(By.name("txtmatricula")).clear();
	     driver.findElement(By.name("txtperiodo")).clear();
	     
	     WebElement camponome = driver.findElement(By.name("txtnome_completo"));
		 WebElement campomatricula = driver.findElement(By.name("txtmatricula"));
		 WebElement campoperiodo = driver.findElement(By.name("txtperiodo"));
		 WebElement botaoEnviar = driver.findElement(By.name("enviar"));
		
		camponome.sendKeys("Luiz Antonio");
		campomatricula.sendKeys("155300001");
		campoperiodo.sendKeys("5");
		botaoEnviar.submit();
		
	   
	
	}
	
     public void deletar() {
    	 
    	 driver.findElement(By.linkText("Alunos")).click();
    	 
         List<WebElement>	lista = driver.findElements(By.name("deletar"));
         lista.get(0).click();
        
         
          
  		 
  			
}
     
 
     
     
}
