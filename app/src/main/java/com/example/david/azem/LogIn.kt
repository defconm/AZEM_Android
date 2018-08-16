package com.example.david.azem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_log_in.*

class LogIn : AppCompatActivity()
{


        override fun onCreate(savedInstanceState: Bundle?)
        {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_log_in)
            
                LoginVM VM = new LoginVM();
             
            login.setOnClickListener {
                var userName = userName.text;
                var password = password.text;
                boolean loginSucess = VM.loginAttempt(userName,password);
                    
            }
        }
}
