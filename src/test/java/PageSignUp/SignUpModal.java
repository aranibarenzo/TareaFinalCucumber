package PageSignUp;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

public class SignUpModal {

    //opciones para SignUp
    public TextBox fullnameTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailSUTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox pwdSUTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public CheckBox checkBox=new CheckBox(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button signUpButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));


}
