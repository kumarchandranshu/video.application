package com.example.myvideoapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView

class single_video : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_video)

        val video = findViewById<VideoView>(R.id.my_video)
        val play = findViewById<Button>(R.id.play_btn)
        val pause = findViewById<Button>(R.id.pause_btn)


        val video_uri = Uri.parse("android.resource://"+packageName+"/"+R.raw.videoo)

        video.setVideoURI(video_uri)

        play.setOnClickListener {
            video.start()
        }

        pause.setOnClickListener {
            video.pause()

        }
    }
}