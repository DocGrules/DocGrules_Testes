package testeselenium.com.br;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteAuto {
	
	private WebDriver driver = null;
	
	String nome = "Genisson de Freitas";
	String matricula = "150301103";
	String periodo = "7";
	
	String tema = "Nova Tecnologia da Informação";
	String semestre = "2";
	
	String titulo = "Apresentação Teste 01" ;
	String resumo = "Resumo teste 01 para apresentação em sala";
	String data = "21041982";
	String eventos = "TI VERDE" ;
	

	
	@Before
	public void inicializar() {
		System.setProperty("webdriver.chrome.driver" , "C:\\Selenium\\chromedriver.exe");
		this.driver = new ChromeDriver();
				
		
	}
	
	
    @Test
	public void fluxo() {
    	
    	Logar Logar = new Logar(driver);
    	
    	Logar.LogarNoSistema();
    	
        //CadastrarUsuarios usuarios = new CadastrarUsuarios(driver);
    	//usuarios.cadastrar(nome, matricula, periodo);
        //usuarios.editar();
    	//usuarios.deletar();
    	
    	
    	
     	//CadastrarEvento evento = new CadastrarEvento(driver);
    	//evento.cadastrar(tema,semestre);
        //evento.editar();
    	//evento.deletar();
     	
     	CadastrarApn apn = new CadastrarApn(driver);
    	//apn.cadastrar(titulo, resumo, data, eventos);
        //apn.editar();
    	//apn.deletar();
    	//apn.add();
    	
    	Contato cont = new Contato(driver);
    	cont.Contatos();
    
    }
    


}
