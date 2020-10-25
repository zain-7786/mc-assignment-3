package org.haqnawaz.a20201021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.*;

public class Main2Activity extends AppCompatActivity {

    RadioGroup radioGroup,radioGroup2;
    RadioButton radioButton;
    Checkbox chk1,chk2,chk3,chk4;
    CheckboxButton checkboxButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.textViewResults);

        radioGroup2 = findViewById(R.id.radioGroup2);
        textView = findViewById(R.id.textViewResults);
    }

    public void ShowSelection(View view) {

        switch(view.getId()){
            case R.id.chk1:
                chk1.setChecked(true);
                chk2.setChecked(false);
                chk3.setChecked(false);
                chk4.setChecked(false);
                break;
            case R.id.chk2:
                chk2.setChecked(true);
                chk3.setChecked(false);
                chk1.setChecked(false);
                chk4.setChecked(false);
                break;
            case R.id.chk3:
                chk3.setChecked(true);
                chk2.setChecked(false);
                chk1.setChecked(false);
                chk4.setChecked(false);
                break;
            case R.id.chk4:
                chk4.setChecked(true);
                chk2.setChecked(false);
                chk1.setChecked(false);
                chk3.setChecked(false);
                break;
        }

        int checked = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(checked);
        textView.setText(radioButton.getText());

        int checked2 = radioGroup2.getCheckedRadioButtonId();
        radioButton = findViewById(checked2);
        textView.setText(radioButton.getText());

    }
}
