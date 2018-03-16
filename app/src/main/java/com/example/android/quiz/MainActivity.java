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
import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.res_q1) TextView textView1;
    @BindView(R.id.res_q2) TextView textView2;
    @BindView(R.id.res_q3) TextView textView3;
    @BindView(R.id.res_q4) TextView textView4;
    @BindView(R.id.res_q5) TextView textView5;
    @BindView(R.id.res_q6) TextView textView6;
    @BindView(R.id.res_q7) TextView textView7;
    @BindView(R.id.res_q8) TextView textView8;

    @BindView(R.id.radiobutton6_1_1) RadioButton radioButton6_1_1;
    @BindView(R.id.radiobutton6_1_2) RadioButton radioButton6_1_2;
    @BindView(R.id.radiobutton6_1_3) RadioButton radioButton6_1_3;
    @BindView(R.id.radiobutton6_2_1) RadioButton radioButton6_2_1;
    @BindView(R.id.radiobutton6_2_2) RadioButton radioButton6_2_2;
    @BindView(R.id.radiobutton6_2_3) RadioButton radioButton6_2_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    // checking every answer one by one
    public void checkAnswers(View view) {
        int totalScore = 0;

        EditText editText1 = (EditText) findViewById(R.id.edittext_1);
        String response1 = editText1.getText().toString().toLowerCase().trim().replaceAll(" +", " ");
        if (response1.equals("eminem") | response1.equals("marshal mathers")) {
            totalScore += 1;
            textView1.setText(getString(R.string.correct));
        } else {
            textView1.setText(getString(R.string.incorrect));
        }

        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_2_true);
        if (radioButton2.isChecked()) {
            totalScore += 1;
            textView2.setText(getString(R.string.correct));
        } else {
            textView2.setText(getString(R.string.incorrect));
        }

        CheckBox checkBox3_1 = (CheckBox) findViewById(R.id.checkbox_3_1);
        CheckBox checkBox3_2 = (CheckBox) findViewById(R.id.checkbox_3_2);
        CheckBox checkBox3_3 = (CheckBox) findViewById(R.id.checkbox_3_3);
        CheckBox checkBox3_4 = (CheckBox) findViewById(R.id.checkbox_3_4);
        CheckBox checkBox3_5 = (CheckBox) findViewById(R.id.checkbox_3_5);
        CheckBox checkBox3_6 = (CheckBox) findViewById(R.id.checkbox_3_6);
        if (checkBox3_1.isChecked() & checkBox3_2.isChecked()
                & checkBox3_4.isChecked() & checkBox3_6.isChecked()
                & checkBox3_3.isChecked() == false & checkBox3_5.isChecked() == false) {
            totalScore += 1;
            textView3.setText(getString(R.string.correct));
        } else {
            textView3.setText(getString(R.string.incorrect));
        }

        RadioButton radioButton4 = (RadioButton) findViewById(R.id.radio_4_true);
        if (radioButton4.isChecked()) {
            totalScore += 1;
            textView4.setText(getString(R.string.correct));
        } else {
            textView4.setText(getString(R.string.incorrect));
        }

        EditText editText5 = (EditText) findViewById(R.id.edittext_5);
        if (editText5.getText().length()>0) {
            int response5 = Integer.parseInt(editText5.getText().toString());
            if (response5 == 25) {
                totalScore += 1;
                textView5.setText(getString(R.string.correct));
            }
        } else {
            textView5.setText(getString(R.string.incorrect));
        }

        RadioButton radioButton6_2_2 = (RadioButton) findViewById(R.id.radiobutton6_2_2);
        if (radioButton6_2_2.isChecked()) {
            totalScore += 1;
            textView6.setText(getString(R.string.correct));
        } else {
            textView6.setText(getString(R.string.incorrect));
        }

        RadioButton radioButton7 = (RadioButton) findViewById(R.id.radio_7);
        if (radioButton7.isChecked()) {
            totalScore += 1;
            textView7.setText(getString(R.string.correct));
        } else {
            textView7.setText(getString(R.string.incorrect));
        }

        EditText editText8 = (EditText) findViewById(R.id.edittext_8);
        String response8 = editText8.getText().toString().toLowerCase().trim().replaceAll(" +", " ");
        if (response8.equals("jay-z") | response8.equals("jay z")) {
            totalScore += 1;
            textView8.setText(getString(R.string.correct));
        } else {
            textView8.setText(getString(R.string.incorrect));
        }

        String low = getString(R.string.low_score);
        String medium = getString(R.string.medium_score);
        String high = getString(R.string.high_score);
        String all = getString(R.string.all_score);

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
        if (radioButton6_1_1.isChecked() | radioButton6_1_2.isChecked() | radioButton6_1_3.isChecked()) {
            if (radioButton6_2_1.isChecked() | radioButton6_2_2.isChecked() | radioButton6_2_3.isChecked()) {
                radioButton6_2_1.setChecked(false);
                radioButton6_2_2.setChecked(false);
                radioButton6_2_3.setChecked(false);
            }
        }
    }

    // 6th question RadioGroup union simulation (if RIGHT side is checked - LEFT unchecked)
    public void radioGroup6_1dropper (View view) {
        if (radioButton6_2_1.isChecked() | radioButton6_2_2.isChecked() | radioButton6_2_3.isChecked()) {
            if (radioButton6_1_1.isChecked() | radioButton6_1_2.isChecked() | radioButton6_1_3.isChecked()) {
                radioButton6_1_1.setChecked(false);
                radioButton6_1_2.setChecked(false);
                radioButton6_1_3.setChecked(false);
            }
        }
    }

    // resets filled values in quiz questions and textViews indicating correct/incorrect answers after submission
    public void reset (View view) {
        EditText editText1 = (EditText) findViewById(R.id.edittext_1);
        editText1.setText("");

        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radiogroup2);
        radioGroup2.clearCheck();

        CheckBox checkBox3_1 = (CheckBox) findViewById(R.id.checkbox_3_1);
        CheckBox checkBox3_2 = (CheckBox) findViewById(R.id.checkbox_3_2);
        CheckBox checkBox3_3 = (CheckBox) findViewById(R.id.checkbox_3_3);
        CheckBox checkBox3_4 = (CheckBox) findViewById(R.id.checkbox_3_4);
        CheckBox checkBox3_5 = (CheckBox) findViewById(R.id.checkbox_3_5);
        CheckBox checkBox3_6 = (CheckBox) findViewById(R.id.checkbox_3_6);
        checkBox3_1.setChecked(false);
        checkBox3_2.setChecked(false);
        checkBox3_3.setChecked(false);
        checkBox3_4.setChecked(false);
        checkBox3_5.setChecked(false);
        checkBox3_6.setChecked(false);

        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.radiogroup4);
        radioGroup4.clearCheck();

        EditText editText5 = (EditText) findViewById(R.id.edittext_5);
        editText5.setText("");

        RadioGroup radioGroup6_1 = (RadioGroup) findViewById(R.id.radiogroup6_1);
        radioGroup6_1.clearCheck();
        RadioGroup radioGroup6_2 = (RadioGroup) findViewById(R.id.radiogroup6_2);
        radioGroup6_2.clearCheck();

        RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.radiogroup7);
        radioGroup7.clearCheck();

        EditText editText8 = (EditText) findViewById(R.id.edittext_8);
        editText8.setText("");

        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollview);
        scrollView.smoothScrollTo(0,0);

        textView1.setText("");
        textView2.setText("");
        textView3.setText("");
        textView4.setText("");
        textView5.setText("");
        textView6.setText("");
        textView7.setText("");
        textView8.setText("");
    }
}