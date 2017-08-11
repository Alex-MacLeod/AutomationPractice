package methods;

import org.openqa.selenium.WebDriver;

public class Navigate {

    public void homePage(WebDriver wD) {
        wD.navigate().to("http://automationpractice.com/index.php");
    }
}
