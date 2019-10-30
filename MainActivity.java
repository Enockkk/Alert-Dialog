package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }
    @Override
        public void onClick(View v){
            switch (v.getId()) {
                case R.id.button:
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Question");
                    dialog.setMessage("王晨宇是什么东西？");
                    dialog.setCancelable(false);
                    dialog.setPositiveButton("是狗！", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int i) {
                            Toast.makeText(MainActivity.this,"群众的眼睛是雪亮的",Toast.LENGTH_SHORT).show();
                        }
                    });
                    dialog.setNegativeButton("不是东西", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();
                    break;

                case R.id.button2:
                    AlertDialog.Builder dialog1 = new AlertDialog.Builder(MainActivity.this);
                    LayoutInflater inflater = getLayoutInflater();
                    final View va=inflater.inflate(R.layout.login, null);
                    dialog1.setView(va);
                    dialog1.setTitle("登录");
                    dialog1.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            String str1="";
                            EditText editText =(EditText)va.findViewById(R.id.editText);
                            str1=editText.getText().toString();
                            String str2="";
                            EditText editText1 =(EditText)va.findViewById(R.id.editText1);
                            str2=editText1.getText().toString();
                            if(str1.equals("abc")&&str2.equals("123")){
                                Toast.makeText(MainActivity.this,"yep.",Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                Toast.makeText(MainActivity.this,"please try again.",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    dialog1.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog1.show();
                    break;
            }
        }
    }

