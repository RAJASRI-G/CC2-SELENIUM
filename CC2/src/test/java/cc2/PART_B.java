package cc2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PART_B {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.yatra.com/hotels");
		driver.manage().window().maximize();
		WebElement flight=driver.findElement(By.xpath("//*[@id=\"booking_engine_flights\"]"));
    	flight.click();
    	WebElement round=driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[1]/ul[1]/li[2]/a"));
    	round.click();
    	WebElement date=driver.findElement(By.xpath("//*[@id=\"BE_flight_arrival_date\"]"));
    	date.click();
    	WebElement box=driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[3]/div[1]/div[1]/a/i"));
    	box.click();
    	driver.get("https://flight.yatra.com/air-search-ui/dom2/trigger?type=R&viewName=normal&flexi=0&noOfSegments=2&origin=DEL&originCountry=IN&destination=BOM&destinationCountry=IN&flight_depart_date=20%2F04%2F2023&arrivalDate=28%2F04%2F2023&ADT=1&CHD=0&INF=0&non_stop=1&class=Economy&source=fresco-home&unqvaldesktop=688441000721");
	}
}
