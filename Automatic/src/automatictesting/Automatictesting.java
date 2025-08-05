package automatictesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatictesting {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https:testingbaba.com/old");
		driver.manage().window().maximize();
		System.out.println("Vivaronaldo");
		System.out.println("HALAMADRID");
}
}
