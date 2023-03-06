package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver2;

import java.util.ArrayList;
import java.util.List;

public class AbstrackClass {



    private WebDriver driver= Driver2.getDriver();
    WebDriverWait wait=new WebDriverWait(driver,10);


    public void clickFonction(WebElement clickElement){

        clickElement.click();
    }
    public  void sendKeysFonction(WebElement sendKeysElement,String value){


        sendKeysElement.sendKeys(value);

    }
    public void selectElementFromDropdownFonction(WebElement dropdown,String element){
        Select slc=new Select(dropdown);
        slc.selectByVisibleText(element);

    }
    public void assertTrueFonction(boolean condition){
        Assert.assertTrue(condition);
    }
    public  void assertEqualFonction(String actual,String expected){
        Assert.assertEquals(actual,expected);
    }

    public void verifyTitleFonction(String expected){
        Assert.assertEquals(expected,driver.getTitle());

    }

    /**
     * This method will take dropdown element and return options list text of options
     * @param element
     * @return
     */
    public List<String> listGetTextFonction(WebElement element){
        Select select=new Select(element);
        List<String> actualList=new ArrayList<>();
        for (WebElement option : select.getOptions()) {
            actualList.add(option.getText());
        }


        return actualList;
    }

    /**
     * This method will click radio button  that have spesific value( find with getAtribute() method)
     * @param radioButton
     * @param attributeValue
     */
    public void clickRadioButtonFonction(List<WebElement> radioButton,String attributeValue){

        for (WebElement element : radioButton) {
            if (element.getAttribute("value").equalsIgnoreCase(attributeValue)){
                element.click();
            }
        }
    }
}
