package testeselenium.com.br;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteAuto {
	
	private WebDriver driver = null;
	
	String nome = "Ana Claudia";
	String idade = "22";
	String endereco = "rua chao molhado, 75 - esperan�a";

	
	@Before
	public void inicializar() {
		System.setProperty("webdriver.chrome.driver" , "C:\\Selenium\\chromedriver.exe");
		this.driver = new ChromeDriver();
				
		
	}
	
	
    @Test
	public void fluxo() {
    	
    	Logar Logar = new Logar(driver);
    	
    	Logar.LogarNoSistema();
    	
    	CadastrarUsuarios usuarios = new CadastrarUsuarios(driver);
    	usuarios.cadastrar(nome, idade, endereco);
        //usuarios.editar();
    	usuarios.eliminar();
    	

		
    	//DeletarUsuario usuarios2 = new DeletarUsuario(driver);
    	//usuarios2.deletar();
    }
    


}
