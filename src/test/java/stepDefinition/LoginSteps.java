package stepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import pages.BasePage;
import pages.LoginPage;
import pages.SelectFlightPage;

public class LoginSteps extends BasePage {

    LoginPage login = new LoginPage();
    SelectFlightPage selectFlight = new SelectFlightPage();

    @Dado("que estou na tela de login")
    public void que_estou_na_tela_de_login() {
        driver.get(login.url);
    }
    @Quando("entro com credenciais validas")
    public void entro_com_credenciais_validas() {
        fillInput(login.etUserName, login.username);
        fillInput(login.etPassword, login.password);
        click(login.btnSignIn);
    }
    @Entao("vejo a tela de Select Flight")
    public void vejo_a_tela_de_select_flight() {
        isVisible(selectFlight.tvSignedIn);
    }




}
