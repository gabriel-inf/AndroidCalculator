package com.example.aluno.minhaaplicacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button buttonResult = (Button) findViewById(R.id.Button1);
        final EditText val1 = (EditText) findViewById(R.id.EditText1);
        final EditText val2 = (EditText) findViewById(R.id.EditText2);
        final TextView res = (TextView) findViewById(R.id.TextView1);

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer v1 = Integer.parseInt(val1.getText().toString());
                Integer v2 = Integer.parseInt(val2.getText().toString());
                Integer result = v1+v2;
                res.setText(result.toString());
            }
        });
    }


}
