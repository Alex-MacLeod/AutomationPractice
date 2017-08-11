package tests;

import methods.AddHomePopularToCart;
import methods.Navigate;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class TestAddToCart {

    private static WebDriver cD;
    private static Actions act;

    private Navigate navigate;
    private AddHomePopularToCart add;

    @BeforeClass
    public static void beforeClass(){
        cD = new ChromeDriver();
        act = new Actions(cD);

        cD.manage().window().maximize();    //maximise Chrome
    }

    @Before
    public void before() {

        navigate = PageFactory.initElements(cD, Navigate.class);
        add = PageFactory.initElements(cD, AddHomePopularToCart.class);
    }

    @AfterClass
    public static void afterClass() {
        cD.quit();
    }

    @Test
    public void testAddFromHomepage() {
        navigate.homePage(cD);   //navigate to site

        add.addHomeFeatured(cD, act);

    }
}