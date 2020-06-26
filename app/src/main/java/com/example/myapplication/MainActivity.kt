package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnshowmsg.setOnClickListener {
                Log.i("MainActivity","button is clicked");
                Toast.makeText(this,"button i clicked",Toast.LENGTH_SHORT).show();
        }

        secondactivity.setOnClickListener {

            var msg : String = etusermsge.text.toString()
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
            var intent=Intent(this,SecondPage::class.java )
            startActivity(intent)


        }
    }
}