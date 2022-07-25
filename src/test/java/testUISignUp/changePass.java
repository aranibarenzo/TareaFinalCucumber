package testUISignUp;

import PageChangePassword.changePassword;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import session.Session;

public class changePass {
       //login
       //
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection= new MenuSection();

    //Change password
    changePassword changePass=new changePassword();

    @BeforeEach
    public void goWebAppSignUp(){
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }
    @AfterEach
    public void closeWebAppSignUp(){
        Session.getInstance().closeSession();
    }

    @Test
    public  void VerifyChangePasswordSucefuly(){

        //Acceso al la cuenta Creada

        mainPage.loginButton.click();
        loginModal.emailTxtBox.writeText("aranibare@maestria.com");
        loginModal.pwdTxtBox.writeText("123456");
        loginModal.loginButton.click();

        //cambio de password
        changePass.Settings.click();
        changePass.OldPassword.writeText("123456");
        changePass.NewPassword.writeText("654321");
        changePass.OkButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR el Cambio de Password fallo");
    }
}
