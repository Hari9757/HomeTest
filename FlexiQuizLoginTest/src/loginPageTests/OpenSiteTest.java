package loginPageTests;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenSiteTest {
public static void validate(String Message,String Error_Message) {
	if(Message.equals(Error_Message)) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
	
}
public static void LoginWithEmptyFields() {
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flexiquiz.com/account/login");
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		String Title_Page="Login - FlexiQuiz";
		validate(Title,Title_Page);
	}
	
		
	

}
