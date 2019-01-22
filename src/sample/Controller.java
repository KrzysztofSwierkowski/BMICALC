package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {


    public TextField mass;
    public TextField height;
    public TextField BMI;
    public TextField index;


    public void calculateButton (ActionEvent e) {

        double bmi = (Integer.parseInt (mass.getText ())/ Math.pow ((Integer.parseInt ( height.getText ())),2 ));

        BMI.setText ( String.valueOf ( bmi ) );


    }



}
