package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class ProfilePage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора меню пользователя
     */
    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/div[4]/div/a[1]")
    private WebElement userMenu;

    /**
     * определение локатора имени пользователя
     */
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[1]/div[2]/span[2]")
    private WebElement userName;

    /**
     * определение локатора кнопки выхода из аккаунта
     */
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[4]/div")
    private WebElement logoutBtn;
    /**
     * метод для получения имени пользователя из меню пользователя
     */
    public String getUserName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(0).plusSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/span[2]")));
        String name = userName.getText();
        return name; }
    /**
     * метод для нажатия кнопки меню пользователя
     */
    public void entryMenu() {
        userMenu.click(); }
    /**
     * метод для нажатия кнопки выхода из аккаунта
     */
    public void userLogout() {
        logoutBtn.click(); } }