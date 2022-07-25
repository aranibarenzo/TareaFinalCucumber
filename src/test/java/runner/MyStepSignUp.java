package runner;

import PageChangePassword.changePassword;
import PageSignUp.MainPageSignUp;
import PageSignUp.SignUpModal;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.MenuSection;

import java.util.Map;

public class MyStepSignUp {
    MainPageSignUp signUp=new MainPageSignUp();
    SignUpModal signUpModal=new SignUpModal();
    MenuSection menuSection= new MenuSection();

    @When("yo quiero crear una nueva cuenta")
    public void yoQuieroCrearUnaNuevaCuenta(Map<String,String> Credentials) {
        signUp.sigUpButton.click();
        signUpModal.fullnameTxtBox.writeText(Credentials.get("FullName"));
        signUpModal.emailSUTxtBox.writeText(Credentials.get("Email"));
        signUpModal.pwdSUTxtBox.writeText(Credentials.get("Password"));
        signUpModal.checkBox.Checked(true);
        signUpModal.signUpButton.click();

    }

    @Then("la cuenta deberia estar creada")
    public void laCuentaDeberiaEstarCreada() {
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR el SingUp fallo");
    }




}
