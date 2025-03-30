package com.pedro.fiorio.calculadorasimples;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleButtonClick(View view) {
        TextView input1 = (TextView) findViewById(R.id.editText1);
        TextView input2 = (TextView) findViewById(R.id.editText2);

        double value1 = Double.parseDouble(input1.getText().toString());
        double value2 = Double.parseDouble(input2.getText().toString());

        double result = 0.0;
        String tag = view.getTag().toString();

        if (tag.equals("add")) {
            result = value1 + value2;
        } else if (tag.equals("sub")) {
            result = value1 - value2;
        } else if (tag.equals("mul")) {
            result = value1 * value2;
        } else if (tag.equals("div") && value2 != 0.0) {
            result = value1 / value2;
        } else {
            msg = (TextView) findViewById(R.id.textViewResult);
            msg.setText("O resultado é: ERRO");
            return;
        }

        msg = (TextView) findViewById(R.id.textViewResult);
        msg.setText("O resultado é: " + result);
    }
}