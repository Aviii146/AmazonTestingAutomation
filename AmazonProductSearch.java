package co.amzon.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProductSearch extends InsertOperation{
	
	static WebDriver driver;
	
	 By productSearchfeild=By.cssSelector(("#twotabsearchtextbox"));
	 By searchButtonproductfield=By.cssSelector((".nav-search-submit"));
	 static By productname1st=By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]");
	 static By productname2nd=By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]");
	 static By productprice1st=By.xpath("(//span[@class='a-price-whole'])[1]");
	 static By productprice2nd=By.xpath("(//span[@class='a-price-whole'])[2]");
	public AmazonProductSearch(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public void ProductSearch1(WebDriver driver) {
		this.driver = driver;
		}
	
	public void productSearch(String arg1) {
		
		
		WebElement searchBox=driver.findElement(productSearchfeild);
        searchBox.sendKeys(arg1);
        WebElement searchButton=driver.findElement(searchButtonproductfield);
        searchButton.click();
	}

}

