package com.apphoangleo.viethoang.convertc_f;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtf, txtc;
    Button btncf, btnfc, btnclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtf = (EditText) findViewById(R.id.dof);
        txtc = (EditText) findViewById(R.id.doc);
        btncf = (Button) findViewById(R.id.btncf);
        btnfc = (Button) findViewById(R.id.btnfc);
        btnclear = (Button) findViewById(R.id.btnclear);

        btncf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double c = Double.parseDouble(txtc.getText()+"");
                    double kq = (c*9)/5 + 32;
                    txtf.setText(kq+"");
                }catch (Exception ex){
                    txtc.setText("Vui lòng nhập đúng dữ liệu!");
                }
            }
        });
        btnfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double f= Double.parseDouble(txtf.getText()+"");
                    double kq = ((f-32)*5)/9;
                    txtc.setText(kq+"");
                }catch (Exception ex){
                    txtf.setText("Vui lòng nhập đúng dữ liệu!");
                }
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtc.setText("");
                txtf.setText("");
            }
        });
    }
}
