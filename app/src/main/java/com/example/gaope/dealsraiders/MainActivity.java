package com.example.gaope.dealsraiders;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gaope.dealsraiders.View.Main2Activity;
import com.example.gaope.dealsraiders.View.StartActivity;

public class MainActivity extends AppCompatActivity {


    private EditText textNames;
    private EditText  passWords;
    private CheckBox  rember_Password;
    private Button enter;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private Boolean ok=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }

        enter = (Button) findViewById(R.id.enter_a);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
        });

        sharedPreferences = getSharedPreferences("isOk",MODE_PRIVATE);
        ok = sharedPreferences.getBoolean("ok",true);

        if (ok){
            Intent intent = new Intent(MainActivity.this,StartActivity.class);
            startActivity(intent);
        }

    }
}
