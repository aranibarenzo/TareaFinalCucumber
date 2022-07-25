package control;

import org.openqa.selenium.By;

public class CheckBox extends Control{
    public CheckBox(By locator) {
        super(locator);
    }
    public boolean Checked(boolean status){
        findControl();
       // control.isSelected();
        control.click();
        return status ;//control.isSelected();

    }
}
