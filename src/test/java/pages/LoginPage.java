package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public String username = "agileway";
    public String password = "testwise";
    public String url = "https://travel.agileway.net/login";

    public final By etUserName = By.id("username");

    public final By etPassword = By.id("password");

    public final By btnSignIn = By.name("commit");

    // Exemplo - porém vamos colocar as funções em outra classe por organização de código
//    public void fillUserUsername() {
//        fillInput(etUserName, username);
//    }
}
