package com.example.android.barclayspremierleaguetrivial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = (Button) findViewById(R.id.get_result);
        submit.setOnClickListener(submitButtonOnClickListener);
    }


    /**
     * This method is called when the submit button is clicked.
     */

    private void Trivia() {
        // get number of titles manchester united has won
        EditText noOfLeagueTitles = (EditText) findViewById(R.id.number_of_league_titles);
        String numberOfTitles = noOfLeagueTitles.getText().toString();
        // get number of points mancity used to pip manutd
        EditText noOfPoints = (EditText) findViewById(R.id.number_of_points);
        String numberOfPoints = noOfPoints.getText().toString();
        // Is the harryKane button now checked?
        RadioButton harryKane = (RadioButton) findViewById(R.id.harry_kane);
        Boolean hasHarryKane = harryKane.isChecked();
        // Is the sergioAguero button now checked?
        RadioButton sergioAguero = (RadioButton) findViewById(R.id.sergio_aguero);
        Boolean hasSergioAguero = sergioAguero.isChecked();
        // Is the moSalah button now checked?
        RadioButton moSalah = (RadioButton) findViewById(R.id.mo_salah);
        Boolean hasMoSalah = moSalah.isChecked();
        // Is the yes1 button now checked?
        RadioButton yes1 = (RadioButton) findViewById(R.id.yes_1);
        Boolean hasYes1 = yes1.isChecked();
        // Is the no1 button now checked?
        RadioButton no1 = (RadioButton) findViewById(R.id.no_1);
        Boolean hasNo1 = no1.isChecked();
        // Is the once button now checked?
        RadioButton once = (RadioButton) findViewById(R.id.once);
        Boolean hasOnce = once.isChecked();
        // Is the twice button now checked?
        RadioButton twice = (RadioButton) findViewById(R.id.twice);
        Boolean hasTwice = twice.isChecked();
        // Is the thrice button now checked?
        RadioButton thrice = (RadioButton) findViewById(R.id.thrice);
        Boolean hasThrice = thrice.isChecked();
        // Is the no2 button now checked?
        RadioButton no2 = (RadioButton) findViewById(R.id.no_2);
        Boolean hasNo2 = no2.isChecked();
        // Is the yes2button now checked?
        RadioButton yes2 = (RadioButton) findViewById(R.id.yes_2);
        Boolean hasYes2 = yes2.isChecked();
        // Is the manutd button now checked?
        RadioButton manutd = (RadioButton) findViewById(R.id.manutd);
        Boolean hasManutd = manutd.isChecked();
        // Is the liverpool button now checked?
        RadioButton liverpool = (RadioButton) findViewById(R.id.liverpool);
        Boolean hasLiverpool = liverpool.isChecked();
        // Is the chelsea button now checked?
        RadioButton chelsea = (RadioButton) findViewById(R.id.chelsea);
        Boolean hasChelsea = chelsea.isChecked();
        // Is the wayneRooney checkbox now checked?
        CheckBox wayneRooney = (CheckBox) findViewById(R.id.wayne_rooney);
        boolean hasWayneRooney = wayneRooney.isChecked();
        // Is the romeluLukaku checkbox now checked?
        CheckBox romeluLukaku = (CheckBox) findViewById(R.id.romelu_lukaku);
        boolean hasRomeluLukaku = romeluLukaku.isChecked();
        // Is the alanShearer checkbox now checked?
        CheckBox alanShearer = (CheckBox) findViewById(R.id.alan_shearer);
        boolean hasAlanShearer = alanShearer.isChecked();
        // increase score if mo salah is selected
        if (hasMoSalah) {
            score += 1;
        }
        // increase score if No is selected
        if (hasNo1) {
            score += 1;
        }
        // increase score if once is selected
        if (hasOnce) {
            score += 1;
        }
        // increase score if No is selected
        if (hasNo2) {
            score += 1;
        }
        // increase score if manutd is selected
        if (hasManutd) {
            score += 1;
        }
        // increase score if both rooney and shearer are selected and lukaku is not selected
        if (hasWayneRooney && hasAlanShearer && !hasRomeluLukaku) {
            score += 1;
        }
        // increase score if no of titles inputed is 20
        if (numberOfTitles.trim().equalsIgnoreCase("20")) {
            score += 1;
        }
        // increase score if no of points inputed is 0
        if (numberOfPoints.trim().equalsIgnoreCase("0")) {
            score += 1;
        }
    }

    // reset score to zero after final score is obtained
    private void resetScore() {
        score = 0;
    }

    final View.OnClickListener submitButtonOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            // get name of test taker
            EditText name = (EditText) findViewById(R.id.name);
            String nameOfTriviaTaker = name.getText().toString();
            // calls trivia method
            Trivia();
            //displays score summary on the screen
            Toast.makeText(MainActivity.this, nameOfTriviaTaker + " You scored: " + score + " out of 8",
                    Toast.LENGTH_LONG).show();
            // calls resetScore method
            resetScore();
        }
    };
}
