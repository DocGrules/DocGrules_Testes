package testeselenium.com.br;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastrarApn {

	
	
	private WebDriver driver = null;

	public CadastrarApn (WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
		public void cadastrar(String titulo, String resumo , String data , String eventos) {
		
		driver.findElement(By.linkText("Apresentação")).click();
		
		driver.findElement(By.linkText("Nova Apresentação")).click();
		
		
		WebElement campotitulo = driver.findElement(By.name("txttitulo"));
		WebElement camporesumo = driver.findElement(By.name("txtresumo"));
		WebElement campodata = driver.findElement(By.name("txtdata"));
		WebElement campoevento = driver.findElement(By.name("evento_id"));
		WebElement botaoEnviar = driver.findElement(By.name("enviar"));
		
		
		campotitulo.sendKeys(titulo);
		camporesumo.sendKeys(resumo);
		campodata.sendKeys(data);
		campoevento.sendKeys(eventos);
		botaoEnviar.click();
				
	}


			public void editar() {
	
			driver.findElement(By.linkText("Apresentação")).click();
	
			List<WebElement>	lista = driver.findElements(By.name("editar"));
			lista.get(0).click();
    
     
     
			driver.findElement(By.name("txttitulo")).clear();
			driver.findElement(By.name("txtresumo")).clear();
   
     
			WebElement campotitulo = driver.findElement(By.name("txttitulo"));
			WebElement camporesumo = driver.findElement(By.name("txtresumo"));
			WebElement campodata = driver.findElement(By.name("txtdata"));
			WebElement campoevento = driver.findElement(By.name("evento_id"));
			WebElement botaoEnviar = driver.findElement(By.name("enviar"));
	
			campotitulo.sendKeys("Novo Título para Teste 02");
			camporesumo.sendKeys("Foi inserido o novo título de apresentação para teste 02");
			campodata.sendKeys("29062018");
			campoevento.sendKeys("TECNOLOGIA VERDE");
			botaoEnviar.click();
					
	
	
	}
	
	
			  public void deletar() {
			    	 
			    	 driver.findElement(By.linkText("Apresentação")).click();
			    	 
			         List<WebElement>	lista = driver.findElements(By.name("deletar"));
			         lista.get(0).click();
			        
			             
			  		 
			  			
			}
			     
			  public void add() {
			    	 
			    	 driver.findElement(By.linkText("Apresentação")).click();
			    	 
			         List<WebElement>	lista = driver.findElements(By.name("adicionar"));
			         lista.get(0).click();
			        
			         List<WebElement>	lista1 = driver.findElements(By.name("selecionar"));
			         lista1.get(0).click();
			  		 
			         WebElement botaoAdd = driver.findElement(By.name("adicionar"));
			         
			     	 botaoAdd.click();
			}
	
	
}
