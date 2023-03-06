package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver2;

import java.util.List;

public class SaocePomPage  {
public SaocePomPage(){
    PageFactory.initElements(Driver2.getDriver(),this);
}
@FindBy(xpath = "//title")
    public WebElement title;

@FindBy(xpath = "//input[@id='login-button']")
    public WebElement loginText;
@FindBy(id = "user-name")
    public WebElement userNameInput;
@FindBy(id = "password")
public WebElement passwordInput;
@FindBy(id ="login-button" )
    public WebElement loginButton;
@FindBy(xpath = "//select")
    public WebElement dropdown;
@FindBy(xpath = "//button[.='Add to cart']")
    public List<WebElement> addToChartButton;
@FindBy(xpath = "//div[@class='inventory_item_name']")
    public List<WebElement> products;
    @FindBy(xpath = "//button[.='Add to cart']")
    public WebElement addButton;

}
