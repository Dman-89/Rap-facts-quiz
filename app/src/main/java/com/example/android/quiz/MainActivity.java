package com.example.android.quiz;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;


import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
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

        EditText et1 = (EditText) findViewById(R.id.answer_question_1);
        TextView tv1 = (TextView) findViewById(R.id.res_q1);
        String response1 = et1.getText().toString().toLowerCase().trim().replaceAll(" +", " ");
        if (response1.equals("eminem") | response1.equals("marshal mathers")) {
            totalScore += 1;
            tv1.setText("Correct");
        } else {
            tv1.setText("Incorrect");
        }

        RadioButton rb2 = (RadioButton) findViewById(R.id.radio_2_true);
        TextView tv2 = (TextView) findViewById(R.id.res_q2);
        if (rb2.isChecked()) {
            totalScore += 1;
            tv2.setText("Correct");
        } else {
            tv2.setText("Incorrect");
        }

        CheckBox checkBox3_1 = (CheckBox) findViewById(R.id.answer_question_3_1);
        CheckBox checkBox3_2 = (CheckBox) findViewById(R.id.answer_question_3_2);
        CheckBox checkBox3_4 = (CheckBox) findViewById(R.id.answer_question_3_4);
        CheckBox checkBox3_6 = (CheckBox) findViewById(R.id.answer_question_3_6);
        TextView tv3 = (TextView) findViewById(R.id.res_q3);
        if (checkBox3_1.isChecked() & checkBox3_2.isChecked()
                & checkBox3_4.isChecked() & checkBox3_6.isChecked()) {
            totalScore += 1;
            tv3.setText("Correct");
        } else {
            tv3.setText("Incorrect");
        }

        RadioButton rb4 = (RadioButton) findViewById(R.id.radio_4_true);
        TextView tv4 = (TextView) findViewById(R.id.res_q4);
        if (rb4.isChecked()) {
            totalScore += 1;
            tv4.setText("Correct");
        } else {
            tv4.setText("Incorrect");
        }

        EditText et5 = (EditText) findViewById(R.id.answer_question_5);
        TextView tv5 = (TextView) findViewById(R.id.res_q5);
        if (et5.getText().length()>0) {
            int response5 = Integer.parseInt(et5.getText().toString());
            if (response5 == 25) {
                totalScore += 1;
                tv5.setText("Correct");
            }
        } else {
            tv5.setText("Incorrect");
        }

        RadioButton rb6_2_2 = (RadioButton) findViewById(R.id.rb6_2_2);
        TextView tv6 = (TextView) findViewById(R.id.res_q6);
        if (rb6_2_2.isChecked()) {
            totalScore += 1;
            tv6.setText("Correct");
        } else {
            tv6.setText("Incorrect");
        }

        RadioButton rb7 = (RadioButton) findViewById(R.id.radio_7);
        TextView tv7 = (TextView) findViewById(R.id.res_q7);
        if (rb7.isChecked()) {
            totalScore += 1;
            tv7.setText("Correct");
        } else {
            tv7.setText("Incorrect");
        }

        EditText et8 = (EditText) findViewById(R.id.answer_question_8);
        TextView tv8 = (TextView) findViewById(R.id.res_q8);
        String response8 = et8.getText().toString().toLowerCase().trim().replaceAll(" +", " ");
        if (response8.equals("jay-z") | response8.equals("jay z")) {
            totalScore += 1;
            tv8.setText("Correct");
        } else {
            tv8.setText("Incorrect");
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

    // 6 question RadioGroup union simulation (if LEFT side is checked - RIGHT unchecked)
    public void radioGroup6_2dropper (View view) {
        RadioButton rb6_1_1 = (RadioButton) findViewById(R.id.rb6_1_1);
        RadioButton rb6_1_2 = (RadioButton) findViewById(R.id.rb6_1_2);
        RadioButton rb6_1_3 = (RadioButton) findViewById(R.id.rb6_1_3);
        RadioButton rb6_2_1 = (RadioButton) findViewById(R.id.rb6_2_1);
        RadioButton rb6_2_2 = (RadioButton) findViewById(R.id.rb6_2_2);
        RadioButton rb6_2_3 = (RadioButton) findViewById(R.id.rb6_2_3);

        if (rb6_1_1.isChecked() | rb6_1_2.isChecked() | rb6_1_3.isChecked()) {
            if (rb6_2_1.isChecked() | rb6_2_2.isChecked() | rb6_2_3.isChecked()) {
                rb6_2_1.setChecked(false);
                rb6_2_2.setChecked(false);
                rb6_2_3.setChecked(false);
            }
        }
    }

    // 6 question RadioGroup union simulation (if RIGHT side is checked - LEFT unchecked)
    public void radioGroup6_1dropper (View view) {
        RadioButton rb6_1_1 = (RadioButton) findViewById(R.id.rb6_1_1);
        RadioButton rb6_1_2 = (RadioButton) findViewById(R.id.rb6_1_2);
        RadioButton rb6_1_3 = (RadioButton) findViewById(R.id.rb6_1_3);
        RadioButton rb6_2_1 = (RadioButton) findViewById(R.id.rb6_2_1);
        RadioButton rb6_2_2 = (RadioButton) findViewById(R.id.rb6_2_2);
        RadioButton rb6_2_3 = (RadioButton) findViewById(R.id.rb6_2_3);

        if (rb6_2_1.isChecked() | rb6_2_2.isChecked() | rb6_2_3.isChecked()) {
            if (rb6_1_1.isChecked() | rb6_1_2.isChecked() | rb6_1_3.isChecked()) {
                rb6_1_1.setChecked(false);
                rb6_1_2.setChecked(false);
                rb6_1_3.setChecked(false);
            }
        }
    }

}