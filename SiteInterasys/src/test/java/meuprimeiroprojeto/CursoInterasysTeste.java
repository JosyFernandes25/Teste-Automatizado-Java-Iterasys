 // 1- Pacote (Conjunto de classes)
package meuprimeiroprojeto;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//2- Bibliotecas
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// System.setProperty: controlado de sistema- pc
//driver.manage(): gerenciador de sistema
public class CursoInterasysTeste {
         // 3.1 Atribuitos / características
	     String url;    // endereço do site alvo
	     WebDriver driver;     // Objeto do Selenium WebDriver
	
	     // 3.2 Métodos ou funções (tudo que se consegue fazer)
	     @Before // url: site que usarei+controle de sistema+Selenium+Browser+DriverBrowser+EndereçoDoDrivePC
	     public void iniciar () {
	    	url = "https://www.iterasys.com.br";
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Luiz\\eclipse-workspace\\SiteInterasys\\driversCursos\\chrome\\chromedriver105\\chromedriver.exe");
	    	//Indicação de Driver a utilizar
	    	driver = new ChromeDriver ();
	    	//definição de tempo de espera para o Selenium
	    	driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
	    	//definição de gerenciamento de janela-maximizada
	    	driver.manage().window().maximize();
	     }
	     
	     @After
	     public void finalizar () {
	    	 driver.quit();
	    	 
	    	 
	     }
	     @Test
	     public void consultarCurso() {
	    	 //Home- pagina inicial
	    	 driver.get(url);//abre navegador na página indicada url
	    	 //busca elemento por uma caracteristica- no caso id
	    	 driver.findElement(By.cssSelector("div.item-pill")).click();
	    	 driver.findElement(By.cssSelector("div.input-wrapper-inpt")).click();
	    	 //Clear irá limpár a caixa de texto no site
	    	 driver.findElement(By.xpath("//input[@inputmode=\"text\"]")).sendKeys(Keys.chord("Início Rápido em Teste e QA"));
	    	 //sendkeys irá escrever a palavra letra por letra (keys.chord)
	    	 //clica na tecla Enter
	    	 
	    	 //pagina de lista de cursos
	    	 driver.findElement(By.xpath("//*[@id=\"page\"]/div[4]/div[3]/button[2]")).click();
	    	 driver.findElement(By.xpath("//h3[text()=\"Início Rápido em Teste e QA\"]")).click();
	     
	    	 //vai para o carrinho de compras
	    	 //resultado esperado - titulo do curso
	    	 String subtitulo = "Início Rápido em Teste e QA";
	    	 String titulo = "AGORA NO UDEMY";
	    	 
	    	 //assertEquals( resultadoEsperado, resultadoAtual)
	    	 assertEquals(titulo, driver.findElement(By.xpath("//h2[text()=\"AGORA NO UDEMY\"]")).getText());
	    	 assertEquals(subtitulo, driver.findElement(By.xpath("//h1[text()=\"Início Rápido em Teste e QA\"]")).getText());
	    
	    	 
	    	 
	    	 
	    	 
	     }
}
