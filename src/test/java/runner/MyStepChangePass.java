package runner;

import PageChangePassword.changePassword;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.MenuSection;

import java.util.Map;

public class MyStepChangePass {
    changePassword changePass=new changePassword();
    MenuSection menuSection= new MenuSection();
    @Then("quiero cambiar el password de mi session")
    public void quieroCambiarElPasswordDeMiSession(Map<String,String> CredentialsPass) {
        //cambio de password
        changePass.Settings.click();
        changePass.OldPassword.writeText(CredentialsPass.get("PasswordOld"));
        changePass.NewPassword.writeText(CredentialsPass.get("PasswordNew"));
        changePass.OkButton.click();
    }

    @Then("mis Password esta actualizado")
    public void misPasswordEstaActualizado() {
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR el login fallo");
    }
}
