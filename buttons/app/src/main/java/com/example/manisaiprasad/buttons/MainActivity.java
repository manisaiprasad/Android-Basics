package com.example.manisaiprasad.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void signUp(View view){
        Log.i("SignUp","Signup is tapped");
    }
    public void signin(View view){
        Log.i("Signip","Signin is tapped");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
