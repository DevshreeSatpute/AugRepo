package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.WebBrowser;
import utility.WebElementMethods;

public class WorkingOnDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		WebDriver driver = WebBrowser.openBrowser("http://demo.automationtesting.in/Register.html");
		WebElement country = driver.findElement(By.id("countries"));
		Select ddcountry = new Select(country);
		List<WebElement> options = ddcountry.getOptions();
		for(WebElement op : options) 
		{
			if(op.getText().equals("India"))
			{
				ddcountry.selectByVisibleText("India");
				flag = true;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("Option selected");
		}
		else
			System.out.println("Incorrect option given");
		
		//By Value
		for(WebElement op : options) 
		{
			if(op.getAttribute("value").equals("Australia"))
			{
				ddcountry.selectByVisibleText("Australia");
				flag = true;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("Option selected");
		}
		else
			System.out.println("Incorrect option given");
		
		WebElementMethods.selectDDByText(driver, By.id("Skills"), "Java");

	}

}
