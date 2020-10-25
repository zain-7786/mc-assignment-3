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

        int checked = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(checked);
        textView.setText(radioButton.getText());

        int checked2 = radioGroup2.getCheckedRadioButtonId();
        radioButton = findViewById(checked2);
        textView.setText(radioButton.getText());

    }
}
