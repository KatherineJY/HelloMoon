package com.ghy.katherinejy.hellomoon;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HelloMoonFragment extends Fragment {
    private AudioPlayer mPlay = new AudioPlayer();
    private Button mPlayButton;
    private Button mStopButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_hello_moon,container,false);
        mPlayButton = (Button) v.findViewById(R.id.hellomoon_playButtom);
        mStopButton = (Button) v.findViewById(R.id.hellomoon_stopButtom);
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlay.play(getActivity());
            }
        });
        mStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlay.stop();
            }
        });
        return v;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPlay.stop();
    }
}
