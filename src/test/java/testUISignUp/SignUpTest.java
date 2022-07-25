package testUISignUp;

import PageChangePassword.changePassword;
import PageSignUp.MainPageSignUp;
import PageSignUp.SignUpModal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import session.Session;

public class SignUpTest {


    MenuSection menuSection= new MenuSection();

    //creacion de cuenta
    MainPageSignUp mainpageSignup =new MainPageSignUp();
    SignUpModal signUpModal=new SignUpModal() ;
    //MenuSection menuSection= new MenuSection();



    @BeforeEach
    public void goWebAppSignUp(){
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }
    @AfterEach
    public void closeWebAppSignUp(){
        Session.getInstance().closeSession();
    }

    @Test
    public void verifyLoginIsSuccessfully(){
        mainpageSignup.sigUpButton.click();
        signUpModal.fullnameTxtBox.writeText("Enzo Aranibar Rojas");
        signUpModal.emailSUTxtBox.writeText("aranibare@maestria.com");
        signUpModal.pwdSUTxtBox.writeText("123456");
        signUpModal.checkBox.Checked(true);
        signUpModal.signUpButton.click();



        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR el login fallo");

    }
}
