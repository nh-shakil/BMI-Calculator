package com.shakil.bmiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText width, feet, inchi;
    Button bt1;
    TextView dp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        width=findViewById(R.id.width);
        feet=findViewById(R.id.feet);
        inchi=findViewById(R.id.inchi);
        bt1=findViewById(R.id.btn1);
        dp1=findViewById(R.id.dp1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sWeight = width.getText().toString();
                String sFeet = feet.getText().toString();
                String SInchi = inchi.getText().toString();

                Float width = Float.parseFloat(sWeight);
                Float feet = Float.parseFloat(sFeet);
                Float inchi = Float.parseFloat(SInchi);

                Float height = (float) (feet*0.3048+ inchi*0.0254);
                Float bmiIndex = width/ (height*height);

                dp1.setText("your BMI Is:"+bmiIndex);

            }
        });
    }
}