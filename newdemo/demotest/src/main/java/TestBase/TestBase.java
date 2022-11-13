package TestBase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;



import PageLayers.ContacUs;
import PageLayers.Login;
import PageLayers.RegisterDetails;
import actions.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriverWait Wait;
	public static WebDriver driver;
	public static Login Log;
	public static Action Act;
	public static RegisterDetails Reg;
	public static ContacUs Con;
	@Parameters("browser")
  @BeforeMethod
public void Setup(String br) {
	  
	if(br.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if(br.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
	}
	else if(br.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
	}
	else {System.out.println("select valid browser");}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
  Log=new Login();
  Reg= new RegisterDetails();
  Con=new ContacUs();
  Act= new Action();
  
  
  }
  @AfterMethod
	public void TearDown() {
		driver.quit();
	} 
	
	

}
