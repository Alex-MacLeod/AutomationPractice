package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import tools.WaitClass;

import java.util.ArrayList;

public class AddHomePopularToCart {

    private WaitClass wait = new WaitClass();

    @FindBy (css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line")
    private WebElement tShirtHomePopular;

    @FindBy (css = "#homefeaturedli.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-item-of-mobile-line")
    private WebElement blouseHomePopular;

    @FindBy (css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-item-of-tablet-line.first-item-of-mobile-line")
    private WebElement printedDress1HomePopular;

    @FindBy (css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line")
    private WebElement printedDress2HomePopular;

    @FindBy (css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.last-line.first-item-of-mobile-line")
    private WebElement printedSumDress1HomePopular;

    @FindBy(css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-line.last-item-of-tablet-line.last-item-of-mobile-line")
    private WebElement printedSumDress2HomePopular;

    @FindBy(css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line")
    private WebElement printedChiffDressHomePopular;

    private ArrayList<WebElement> homePopular = new ArrayList<WebElement>();
    homePopular.add(tShirtHomePopular);
    homePopular.add(blouseHomePopular);
    homePopular.add(printedDress1HomePopular);
    homePopular.add(printedDress2HomePopular);
    homePopular.add(printedSumDress1HomePopular);
    homePopular.add(printedSumDress2HomePopular);
    homePopular.add(printedChiffDressHomePopular);

    @FindBy (css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line.hovered " +
            "> div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")
    private WebElement addTShirtHomePopular;

    @FindBy (css = "#homefeaturedli.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-item-of-mobile-line.hovered > div " +
            "> div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")
    private WebElement addBlouseHomePopular;

    @FindBy (css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-item-of-tablet-line.first-item-of-mobile-line.hovered " +
            "> div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")
    private WebElement addPrintedDress1HomePopular;

    @FindBy (css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line.hovered " +
            "> div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")
    private WebElement addPrintedDress2HomePopular;

    @FindBy (css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.last-line.first-item-of-mobile-line.hovered " +
            "> div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")
    private WebElement addPrintedSumDress1HomePopular;

    @FindBy(css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-line.last-item-of-tablet-line.last-item-of-mobile-line.hovered " +
            "> div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")
    private WebElement addPrintedSumDress2HomePopular;

    @FindBy(css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line.hovered " +
            "> div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")
    private WebElement addPrintedChiffDressHomePopular;

    private ArrayList<WebElement> addHomePopular = new ArrayList<WebElement>();
    addHomePopular.add(addTShirtHomePopular);
    addHomePopular.add(addBlouseHomePopular);
    addHomePopular.add(addPrintedDress1HomePopular);
    addHomePopular.add(addPrintedDress2HomePopular);
    addHomePopular.add(addPrintedSumDress1HomePopular);
    addHomePopular.add(addPrintedSumDress2HomePopular);
    addHomePopular.add(addPrintedChiffDressHomePopular);

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
    private WebElement continueShopping;



    public void addHomeFeatured(WebDriver wD, Actions action) {
        for (int i=0; i<homePopular.size(); i++) {
            wait.waitToLoad(wD, homePopular.get(i));
            action.moveToElement(homePopular.get(i)).perform();
            wait.pause();
            wait.waitToLoad(wD, addHomePopular.get(i));
            addHomePopular.get(i).click();
            wait.pause();
            wait.waitToLoad(wD, continueShopping);
            continueShopping.click();
            wait.pause();

        }
    }


}
