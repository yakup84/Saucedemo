package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AbstrackClass;
import pages.SaocePomPage;
import utilities.Driver2;

import java.util.List;

public class Souce_StepDefinition extends AbstrackClass {
    SaocePomPage saocePomPage=new SaocePomPage();
    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver2.getDriver().get("https://www.saucedemo.com/");
    }
    @Then("user verify that title as Swag Labs")
    public void user_verify_that_title_as_swag_labs() {
        verifyTitleFonction("Swag Labs");
    }


    @Then("user verify login button text is capitalized")
    public void userVerifyLoginButtonTextIsCapitalized() {

//String[] login= saocePomPage.loginText.getAttribute("value").split("");
//        List<String> list=new ArrayList<>(Arrays.asList(login));
//        Collections.
        Assert.assertEquals(saocePomPage.loginText.getAttribute("value"),"LOGIN");
    }

//    @When("user enter user name as {string}")
//    public void userEnterUserNameAs(String arg0) {
//       sendKeysFonction(saocePomPage.userNameInput,arg0);
//    }

    @And("user enter password as {string}")
    public void userEnterPasswordAs(String arg0) {
        sendKeysFonction(saocePomPage.passwordInput, arg0);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        clickFonction(saocePomPage.loginButton);
    }

    @Then("user should see the home page")
    public void userShouldSeeTheHomePage() {
        verifyTitleFonction("Swag Labs");
    }

    @When("user enter user name as {string}")
    public void userEnterUserNameAs(String arg0) {
        sendKeysFonction(saocePomPage.userNameInput,arg0);
    }

    @Then("user should verify default filter dropdown is A-Z")
    public void userShouldVerifyDefaultFilterDropdownIsAZ() {
        Select select=new Select(saocePomPage.dropdown);
        assertEqualFonction(select.getFirstSelectedOption().getText(),"A-Z");
    }



    @And("user click addChart button")
    public void userClicAddChartButton() {
        for (WebElement element : saocePomPage.addToChartButton) {
            element.click();
        }
    }

    @And("user click addChart {string}")
    public void userClickAddChart(String arg0) throws InterruptedException {
        for (WebElement product : saocePomPage.products) {
            if (product.getText().equals(arg0))
                saocePomPage.addButton.click();

        }
    }

    @When("user click addChart product2")
    public void user_click_add_chart_product2(List<String> dataTable) {
        for (String s : dataTable) {
            for (WebElement product : saocePomPage.products) {
                if (product.getText().equals(s))
                    saocePomPage.addButton.click();
            }
        }
    }

}
