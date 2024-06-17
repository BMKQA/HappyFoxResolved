package Admin_Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class BasePage {
        protected WebDriver driver;

        public BasePage(WebDriver driver) {
            this.driver = driver;
        }
    }

    public class LoginPage extends BasePage {
        public LoginPage(WebDriver driver) {
            super(driver);
        }

        public void login(String username, String password) {

            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("loginButton")).click();
        }

        public void navigateToProfileHappyFoxHomePageURL(String adminPortalURL) {
            driver.get(adminPortalURL);
        }

        public AdminPortalTest1stPage validatePendingTicketsTitle() {
            System.out.println("validated");
            return  new AdminPortalTest1stPage(driver);
        }

        public void validatePendingTicketsTitle1() {
            System.out.println("Validation successful!");
        }
    }
