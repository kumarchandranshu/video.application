package com.example.myvideoapplication

import android.app.Dialog
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.VideoView

class List_videos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_videos)
    }



    fun img_video_check(view:View){

        val imgView = findViewById<ImageView>(view.id)

        val alert = Dialog(this@List_videos)

        alert.setContentView(R.layout.name_custom_video_alert)

        val video = alert.findViewById<VideoView>(R.id.video_alert)

        val play = alert.findViewById<Button>(R.id.play)


        when(imgView.id){

            R.id.img_one -> {
                val video_uri = Uri.parse("android.resource://"+packageName+"/"+R.raw.videoo)

                video.setVideoURI(video_uri)

                alert.show()
                play.setOnClickListener {
                    video.start()
                }
            }
            R.id.img_two -> {
                val video_uri = Uri.parse("android.resource://"+packageName+"/"+R.raw.videoo)

                video.setVideoURI(video_uri)

                alert.show()
                play.setOnClickListener {
                    video.start()
                }
            }
            R.id.img_three -> {
                val video_uri = Uri.parse("android.resource://"+packageName+"/"+R.raw.videoo)

                video.setVideoURI(video_uri)

                alert.show()
                play.setOnClickListener {
                    video.start()
                }
            }
            R.id.img_four -> {
                val video_uri = Uri.parse("android.resource://"+packageName+"/"+R.raw.videoo)

                video.setVideoURI(video_uri)

                alert.show()
                play.setOnClickListener {
                    video.start()
                }
            }

        }


    }
}