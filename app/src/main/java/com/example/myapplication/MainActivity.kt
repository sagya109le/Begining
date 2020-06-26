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
            val msg : String = etusermsge.text.toString()
            val intent=Intent(this,SecondPage::class.java )
            intent.putExtra("crn_msg",msg)
            startActivity(intent)
        }

        anotherapp.setOnClickListener {
            val message : String = etusermsge.text.toString()
            val intent=Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type="tect/plain"

            startActivity(Intent.createChooser(intent,"share to"))

        }
    }
}