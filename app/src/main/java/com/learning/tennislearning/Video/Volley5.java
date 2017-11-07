package com.learning.tennislearning.Video;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.learning.tennislearning.R;

public class Volley5 extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    
        public static final String API_KEY = "AIzaSyC7mWspoPyAIvcErI9A-EgYKSAOgLaxIDI";
        public static final  String VIDEO_ID = "rdvWZtKNpPo";
    
         @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.video_volley5);

             YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
             youTubePlayerView.initialize(API_KEY, this);
    
        }
    
        @Override
        public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
            youTubePlayer.setPlayerStateChangeListener(playerStateChangeListener);
            youTubePlayer.setPlaybackEventListener(playbackEventListener);
    
            if(!b){
                youTubePlayer.cueVideo (VIDEO_ID);
            }
        }
    
        @Override
        public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
            Toast.makeText(this, "Gaga Memuat video", Toast.LENGTH_LONG);
        }
    
        private YouTubePlayer.PlaybackEventListener playbackEventListener = new YouTubePlayer.PlaybackEventListener(){
    
            @Override
            public void onBuffering(boolean arg0){
    
            }
    
            @Override
            public void onSeekTo(int i) {
    
            }
    
            @Override
            public void onPaused(){
    
            }
    
            @Override
            public void onStopped() {
    
            }
    
            @Override
            public void onPlaying(){
    
            }
        };
    
        public YouTubePlayer.PlayerStateChangeListener playerStateChangeListener = new YouTubePlayer.PlayerStateChangeListener() {
            @Override
            public void onLoading() {
    
            }
    
            @Override
            public void onLoaded(String s) {
    
            }
    
            @Override
            public void onAdStarted() {
    
            }
    
            @Override
            public void onVideoStarted() {
    
            }
    
            @Override
            public void onVideoEnded() {
    
            }
    
            @Override
            public void onError(YouTubePlayer.ErrorReason errorReason) {
    
            }
        };
    }
