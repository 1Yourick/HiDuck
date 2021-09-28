package com.yourick.hiduck;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class VideoActivity extends AppCompatActivity {
    WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        mWebView=(WebView)findViewById(R.id.videoview); //          то что было   <html><body>Promo video<br><iframe width="420" height="315" src="https://youtu.be/P4Xr6uY-bjc" frameborder="0" allowfullscreen></iframe></body></html>
        //int width = getWindowManager().getDefaultDisplay().getWidth()/3;
        //int height = getWindowManager().getDefaultDisplay().getHeight()/3;

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels/4;
        int height = displayMetrics.heightPixels/4;

        //build your own src link with your video ID                моё видео https://youtu.be/P4Xr6uY-bjc     <iframe width="894" height="674" src="https://www.youtube.com/embed/P4Xr6uY-bjc" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
        String videoStr = "<html><body>Promo video<br><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/P4Xr6uY-bjc\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe></body></html>";

        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings ws = mWebView.getSettings();
        ws.setJavaScriptEnabled(true);
        mWebView.loadData(videoStr, "text/html", "utf-8");

        /*Intent intent ;
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=Hxy8BZGQ5Jo")));*/ //открывает ютуб

        /*int x = 2;

        String frameVideo = "<html><body>Video From YouTube<br><iframe width=\\\"420\\\" height=\\\"315\\\" src=\\\"https://www.youtube.com/embed/47yJ2XCRLZs\\\" frameborder=\\\"0\\\" allowfullscreen></iframe></body></html>";

        WebView displayYoutubeVideo = (WebView) findViewById(R.id.mWebView);
        displayYoutubeVideo.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings = displayYoutubeVideo.getSettings();
        webSettings.setJavaScriptEnabled(true);
        displayYoutubeVideo.loadData(frameVideo, "text/html", "utf-8");*/
    }


}