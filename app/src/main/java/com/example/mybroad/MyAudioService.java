package com.example.mybroad;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyAudioService extends Service {
    MediaPlayer mediaPlayer;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {
        mediaPlayer  = MediaPlayer.create(this,R.raw.white);
        mediaPlayer.start();
    }
    @Override
    public void onDestroy() {
        mediaPlayer.stop();
    }
}
