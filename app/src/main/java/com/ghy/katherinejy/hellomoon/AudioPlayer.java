package com.ghy.katherinejy.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioPlayer {
    private MediaPlayer mPlay;

    public void stop(){
        if( mPlay!=null ){
            mPlay.release();
            mPlay = null;
        }
    }

    public void play(Context c){
        stop();
        mPlay = MediaPlayer.create(c,R.raw.one_small_step);
        mPlay.start();

        mPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });
    }
}
