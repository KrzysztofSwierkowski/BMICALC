package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.util.Locale;

import static java.util.Locale.*;

public class Controller {


    public TextField mass;
    public TextField height;
    public TextField BMI;
    public TextField index;

    public void disableField()
    {
        BMI.setDisable(true);
        index.setDisable(true);
    }

    public void calculateButton (ActionEvent e) {

        double bmi = (Double.valueOf(mass.getText ())/ Math.pow ((Double.valueOf ( height.getText ())),2 ));

        BMI.setText ( String.format ("%.2f",bmi) );

        if(bmi < 18.4)
            index.setText("niedowaga");
        else if (18.5 < bmi && bmi < 24.9)
        index.setText("waga prawidłowa");
        else if  (25 < bmi && bmi < 29.9)
            index.setText("nadwaga");
        else if  (30 > bmi)
            index.setText("otyłość");



    }

    public void eraseButton (ActionEvent e) {

        BMI.setText ( "" );
        mass.setText("");
        height.setText("");
        index.setText("");



    }



}
