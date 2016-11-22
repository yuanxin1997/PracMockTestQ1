package com.prac3.a154405a.pracmocktestq1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etName, etPhoneNo;
    Button btnRegister;
    RadioButton rBtnMale, rBtnFemale;
    TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.etName);
        etPhoneNo = (EditText) findViewById(R.id.etPhoneNo);
        rBtnMale = (RadioButton) findViewById(R.id.rBtnMale);
        rBtnFemale = (RadioButton) findViewById(R.id.rBtnFemale);
        tvStatus = (TextView) findViewById(R.id.tvStatus);
        btnRegister = (Button) findViewById(R.id.btnRegister);

//        btnRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tvStatus.setText(etName.getText() + "," + etPhoneNo.getText() + "," + rBtnMale.isChecked() + "," + rBtnFemale.isChecked());
//            }
//        });

    }

    public void onMyBtnClick(View v){

        tvStatus.setText(etName.getText() + ", " + etPhoneNo.getText() + ", " + rBtnMale.isChecked() + ", " + rBtnFemale.isChecked());

    }
}
