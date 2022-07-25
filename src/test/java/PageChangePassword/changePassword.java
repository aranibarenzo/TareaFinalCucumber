package PageChangePassword;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class changePassword {

    //Opciones Change Password

    public Button Settings=new Button(By.xpath("//a[text()='Settings']"));

    public TextBox OldPassword=new TextBox(By.id("TextPwOld"));
    public TextBox NewPassword=new TextBox(By.id("TextPwNew"));
    public Button OkButton=new Button(By.xpath("//span[text()='Ok']"));
}
