package com.example.parcial1grupo3;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Rep_de_video extends AppCompatActivity {
    VideoView videoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_video);

        videoview = (VideoView)this.findViewById(R.id.vVideo);
        String path = "android.resource://"+ getPackageName() + "/" + R.raw.video_tiktok;
        videoview.setVideoURI(Uri.parse(path));
        videoview.start();
    }
}