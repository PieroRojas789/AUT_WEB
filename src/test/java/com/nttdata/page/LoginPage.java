package com.nttdata.page;
import org.openqa.selenium.By;

public class LoginPage {
    // Corregido el selector para el botón de login
    public static By SearchPageLogin = By.xpath("//*[@id='_desktop_user_info']/div/a");  // Usamos <a> en lugar de <span>
    public static By User = By.id("field-email");
    public static By Password = By.id("field-password");
    public static By BtnLogin = By.id("submit-login");
    public static By Category = By.className("category");
    public static By man = By.xpath("//*[@id='left-column']/div[1]/ul/li[2]/ul/li[1]/a");
    public static By Product1 = By.xpath("//*[@id='js-product-list']/div[1]/div/article/div/div[2]/h2/a");
    public static By Quantity = By.xpath("//*[@id='quantity_wanted']");
    public static By BtnCar = By.cssSelector(".btn.btn-primary.add-to-cart");
    public static By Multiplicando = By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[1]/div/div[2]/p");
    public static By Multiplicador = By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[1]/div/div[2]/span[3]/strong");
    public static By Result = By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/p[4]/span[2]");
    public static By FinalityShop = By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/div/a");
    public static By TitleCarShop = By.xpath("//*[@id='main']/div/div[1]/div/div[1]/h1");

}