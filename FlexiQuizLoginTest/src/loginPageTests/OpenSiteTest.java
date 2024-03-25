package loginPageTests;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenSiteTest {
static WebDriver driver;
public static void validate(String Message,String Error_Message) {
	if(Message.equals(Error_Message)) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
	
}
public static void LoginWithEmptyFields() {
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	driver.findElement(By.id("loginNow")).click();
	System.out.println("Login with empty field test results:");
	String Message=driver.findElement(By.id("userNameValidationMessage")).getText();
	String Error_Message="The Email / Username field is required.";
	validate(Message,Error_Message);
	
}
public static void LoginWithEmailAndPasswordEmpty(){
	driver.findElement(By.id("UserName")).sendKeys("harichowdary5797@gmail.com");
	driver.findElement(By.id("loginNow")).click();
	System.out.println("Login with only EmailId with out password");
	String Message=driver.findElement(By.id("passwordValidationMessage")).getText();
	String Error_Message="The Password field is required.";
	validate(Message,Error_Message);
}
public static void LoginWithPasswordAndEmailEmpty() {
	driver.findElement(By.id("Password")).sendKeys("Havisha@2015");
	driver.findElement(By.id("loginNow")).click();
	System.out.println("Login with only password without Email/Userid");
	String Message=driver.findElement(By.id("userNameValidationMessage")).getText();
	String Error_Message="The Email / Username field is required.";
	validate(Message,Error_Message);
}
public static void LoginWithValidEmailAndPassword() {
	driver.findElement(By.id("UserName")).sendKeys("harichowdary5797@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Havisha@2015");
	driver.findElement(By.id("loginNow")).click();
	String Message=driver.getTitle();
	String Error_Message="FlexiQuiz - Dashboard";
	validate(Message,Error_Message);
}
public static void LoginWithInvalidEmailAndPassword() {
	driver.findElement(By.id("UserName")).sendKeys("hari5797@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Hari@2015");
	driver.findElement(By.id("loginNow")).click();
	String Message=driver.findElement(By.cssSelector(".validation-summary-errors")).getText();
	String Error_Message="The user name or password provided is incorrect.";
	validate(Message,Error_Message);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.flexiquiz.com/account/login");
		String Title=driver.getTitle();
		//System.out.println(Title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		String Title_Page="Login - FlexiQuiz";
		validate(Title,Title_Page);
		//LoginWithEmptyFields();
		//LoginWithEmailAndPasswordEmpty();
		//LoginWithPasswordAndEmailEmpty();
		//LoginWithValidEmailAndPassword();
		//LoginWithInvalidEmailAndPassword();
	}
}
