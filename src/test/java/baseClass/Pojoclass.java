package baseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass extends Baseclass{
	public Pojoclass() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="pass")
	private WebElement pass;
	@FindBy(name="login")
	private WebElement login;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement cancel;
	public WebElement getCancel() {
		return cancel;
	}
	@FindBy(xpath="//input[@class='_3704LK']")
	private WebElement serachbox;
	public WebElement getSerachbox() {
		return serachbox;
	}
	@FindBy(className="_34RNph")
	private WebElement searchicon;
	public WebElement getSearchicon() {
		return searchicon;
	}
	@FindBy(xpath="(//a[text()='Men Green Sports Sandal'])[1]")
	private WebElement adidas;
	public WebElement getAdidas() {
		return adidas;
	}
	
	@FindBy(className="_30jeq3 _16Jk6d")
	private WebElement price;
	public WebElement getPrice() {
		return price;
	}
	
	
	}
	
	



