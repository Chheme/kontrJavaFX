package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    TextField t1;

    @FXML
    TextField t2;

    @FXML
    Label s;


    @FXML
    public void c (ActionEvent e){
        String a = t1.getText();
        String b = t2.getText();
        if (a.equals("admin") && b.equals("pass")){
s.setText("Hello Admin!");
        } else {
            s.setText("Ошибка авторизации!");
        }
    }




}
