package com.example.android.quiz;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;


import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // checking every answer one by one
    public void checkAnswers(View view) {
        int totalScore = 0;

        EditText edittext1 = (EditText) findViewById(R.id.edittext_1);
        TextView textview1 = (TextView) findViewById(R.id.res_q1);
        String response1 = edittext1.getText().toString().toLowerCase().trim().replaceAll(" +", " ");
        if (response1.equals("eminem") | response1.equals("marshal mathers")) {
            totalScore += 1;
            textview1.setText("Correct");
        } else {
            textview1.setText("Incorrect");
        }

        RadioButton rb2 = (RadioButton) findViewById(R.id.radio_2_true);
        TextView textview2 = (TextView) findViewById(R.id.res_q2);
        if (rb2.isChecked()) {
            totalScore += 1;
            textview2.setText("Correct");
        } else {
            textview2.setText("Incorrect");
        }

        CheckBox checkBox3_1 = (CheckBox) findViewById(R.id.checkbox_3_1);
        CheckBox checkBox3_2 = (CheckBox) findViewById(R.id.checkbox_3_2);
        CheckBox checkBox3_4 = (CheckBox) findViewById(R.id.checkbox_3_4);
        CheckBox checkBox3_6 = (CheckBox) findViewById(R.id.checkbox_3_6);
        TextView textview3 = (TextView) findViewById(R.id.res_q3);
        if (checkBox3_1.isChecked() & checkBox3_2.isChecked()
                & checkBox3_4.isChecked() & checkBox3_6.isChecked()) {
            totalScore += 1;
            textview3.setText("Correct");
        } else {
            textview3.setText("Incorrect");
        }

        RadioButton rb4 = (RadioButton) findViewById(R.id.radio_4_true);
        TextView textview4 = (TextView) findViewById(R.id.res_q4);
        if (rb4.isChecked()) {
            totalScore += 1;
            textview4.setText("Correct");
        } else {
            textview4.setText("Incorrect");
        }

        EditText edittext5 = (EditText) findViewById(R.id.edittext_5);
        TextView textview5 = (TextView) findViewById(R.id.res_q5);
        if (edittext5.getText().length()>0) {
            int response5 = Integer.parseInt(edittext5.getText().toString());
            if (response5 == 25) {
                totalScore += 1;
                textview5.setText("Correct");
            }
        } else {
            textview5.setText("Incorrect");
        }

        RadioButton radiobutton6_2_2 = (RadioButton) findViewById(R.id.radiobutton6_2_2);
        TextView textview6 = (TextView) findViewById(R.id.res_q6);
        if (radiobutton6_2_2.isChecked()) {
            totalScore += 1;
            textview6.setText("Correct");
        } else {
            textview6.setText("Incorrect");
        }

        RadioButton rb7 = (RadioButton) findViewById(R.id.radio_7);
        TextView textview7 = (TextView) findViewById(R.id.res_q7);
        if (rb7.isChecked()) {
            totalScore += 1;
            textview7.setText("Correct");
        } else {
            textview7.setText("Incorrect");
        }

        EditText edittext8 = (EditText) findViewById(R.id.edittext_8);
        TextView textview8 = (TextView) findViewById(R.id.res_q8);
        String response8 = edittext8.getText().toString().toLowerCase().trim().replaceAll(" +", " ");
        if (response8.equals("jay-z") | response8.equals("jay z")) {
            totalScore += 1;
            textview8.setText("Correct");
        } else {
            textview8.setText("Incorrect");
        }

        String low = "Seems ya're far from rap history";
        String medium = "Ya know a thang bout real-deal rappers";
        String high = "Man, ya're a true rap fan";
        String all = "Snoop, ain't that you, hommie? Or maybe Dre?";

        Context context = getApplicationContext();
        String total = totalScore + "/8  ";

        if (totalScore <= 2) {
            Toast toast = Toast.makeText(context, total + low, Toast.LENGTH_LONG);
            toast.show();
        } else if (totalScore <= 5) {
            Toast toast = Toast.makeText(context, total + medium, Toast.LENGTH_LONG);
            toast.show();
        } else if (totalScore <= 7) {
            Toast toast = Toast.makeText(context, total + high, Toast.LENGTH_LONG);
            toast.show();
        } else if (totalScore == 8) {
            Toast toast = Toast.makeText(context, total + all, Toast.LENGTH_LONG);
            toast.show();
        }
    }

    // 6th question RadioGroup union simulation (if LEFT side is checked - RIGHT unchecked)
    public void radioGroup6_2dropper (View view) {
        RadioButton radiobutton6_1_1 = (RadioButton) findViewById(R.id.radiobutton6_1_1);
        RadioButton radiobutton6_1_2 = (RadioButton) findViewById(R.id.radiobutton6_1_2);
        RadioButton radiobutton6_1_3 = (RadioButton) findViewById(R.id.radiobutton6_1_3);
        RadioButton radiobutton6_2_1 = (RadioButton) findViewById(R.id.radiobutton6_2_1);
        RadioButton radiobutton6_2_2 = (RadioButton) findViewById(R.id.radiobutton6_2_2);
        RadioButton radiobutton6_2_3 = (RadioButton) findViewById(R.id.radiobutton6_2_3);

        if (radiobutton6_1_1.isChecked() | radiobutton6_1_2.isChecked() | radiobutton6_1_3.isChecked()) {
            if (radiobutton6_2_1.isChecked() | radiobutton6_2_2.isChecked() | radiobutton6_2_3.isChecked()) {
                radiobutton6_2_1.setChecked(false);
                radiobutton6_2_2.setChecked(false);
                radiobutton6_2_3.setChecked(false);
            }
        }
    }

    // 6th question RadioGroup union simulation (if RIGHT side is checked - LEFT unchecked)
    public void radioGroup6_1dropper (View view) {
        RadioButton radiobutton6_1_1 = (RadioButton) findViewById(R.id.radiobutton6_1_1);
        RadioButton radiobutton6_1_2 = (RadioButton) findViewById(R.id.radiobutton6_1_2);
        RadioButton radiobutton6_1_3 = (RadioButton) findViewById(R.id.radiobutton6_1_3);
        RadioButton radiobutton6_2_1 = (RadioButton) findViewById(R.id.radiobutton6_2_1);
        RadioButton radiobutton6_2_2 = (RadioButton) findViewById(R.id.radiobutton6_2_2);
        RadioButton radiobutton6_2_3 = (RadioButton) findViewById(R.id.radiobutton6_2_3);

        if (radiobutton6_2_1.isChecked() | radiobutton6_2_2.isChecked() | radiobutton6_2_3.isChecked()) {
            if (radiobutton6_1_1.isChecked() | radiobutton6_1_2.isChecked() | radiobutton6_1_3.isChecked()) {
                radiobutton6_1_1.setChecked(false);
                radiobutton6_1_2.setChecked(false);
                radiobutton6_1_3.setChecked(false);
            }
        }
    }

    // resets filled values in quiz questions
    public void reset (View view) {
        EditText edittext1 = (EditText) findViewById(R.id.edittext_1);
        edittext1.setText("");

        RadioGroup radiogroup2 = (RadioGroup) findViewById(R.id.radiogroup2);
        radiogroup2.clearCheck();

        CheckBox checkbox3_1 = (CheckBox) findViewById(R.id.checkbox_3_1);
        CheckBox checkbox3_2 = (CheckBox) findViewById(R.id.checkbox_3_2);
        CheckBox checkbox3_3 = (CheckBox) findViewById(R.id.checkbox_3_3);
        CheckBox checkbox3_4 = (CheckBox) findViewById(R.id.checkbox_3_4);
        CheckBox checkbox3_5 = (CheckBox) findViewById(R.id.checkbox_3_5);
        CheckBox checkbox3_6 = (CheckBox) findViewById(R.id.checkbox_3_6);
        checkbox3_1.setChecked(false);
        checkbox3_2.setChecked(false);
        checkbox3_3.setChecked(false);
        checkbox3_4.setChecked(false);
        checkbox3_5.setChecked(false);
        checkbox3_6.setChecked(false);

        RadioGroup radiogroup4 = (RadioGroup) findViewById(R.id.radiogroup4);
        radiogroup4.clearCheck();

        EditText edittext5 = (EditText) findViewById(R.id.edittext_5);
        edittext5.setText("");

        RadioGroup radiogroup6_1 = (RadioGroup) findViewById(R.id.radiogroup6_1);
        radiogroup6_1.clearCheck();
        RadioGroup radiogroup6_2 = (RadioGroup) findViewById(R.id.radiogroup6_2);
        radiogroup6_2.clearCheck();

        RadioGroup radiogroup7 = (RadioGroup) findViewById(R.id.radiogroup7);
        radiogroup7.clearCheck();

        EditText edittext8 = (EditText) findViewById(R.id.edittext_8);
        edittext8.setText("");

        ScrollView scrollview = (ScrollView) findViewById(R.id.scrollview);
        scrollview.smoothScrollTo(0,0);
    }
}