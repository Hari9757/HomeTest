package loginPageTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSiteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flexiquiz.com/account/login");
		String Title=driver.getTitle();
		System.out.println(Title);

	}

}
