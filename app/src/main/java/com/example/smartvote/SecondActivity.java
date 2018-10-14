package com.example.smartvote;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Button pro = findViewById(R.id.pro);

        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText id = findViewById(R.id.id);
                String id2 = id.getText().toString();
                if (id2.equals("") || id2.length() != 13){
                    String msg = "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก";
                    Toast t2 = Toast.makeText(SecondActivity.this,msg,Toast.LENGTH_SHORT);
                    t2.show();
                }
                else{
                    if(id2.equals("1111111111111") || id2.equals("2222222222222")){
                        AlertDialog.Builder dialog = new AlertDialog.Builder(SecondActivity.this);
                        dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                        dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                        dialog.setPositiveButton("OK",null);
                        dialog.show();
                    }
                    else{
                        AlertDialog.Builder dialog = new AlertDialog.Builder(SecondActivity.this);
                        dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                        dialog.setMessage("คุณไม่มีมีสิทธิเลือกตั้ง");
                        dialog.setPositiveButton("OK",null);
                        dialog.show();
                    }
                }
            }
        });
    }
}
