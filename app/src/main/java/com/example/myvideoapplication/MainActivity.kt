package com.example.myvideoapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val video_btn = findViewById<Button>(R.id.video_btn)

        val list_video =findViewById<Button>(R.id.list_videos)

        video_btn.setOnClickListener {

            val video_intent = Intent(this@MainActivity,single_video::class.java)

            startActivity(video_intent)
        }

        list_video.setOnClickListener {

            val list_intent =Intent(this@MainActivity,single_video::class.java)

            startActivity(list_intent)

        }
    }
}