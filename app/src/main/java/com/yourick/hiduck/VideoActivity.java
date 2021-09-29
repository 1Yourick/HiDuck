package com.yourick.hiduck;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class VideoActivity extends AppCompatActivity {
    WebView mWebView;
    SharedPreferences sPref;
    final String SAVED_TEXT = "what series";
    int s ;
    String videoStr;
    int height;
    float width;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
b=findViewById(R.id.button);


        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
         width = displayMetrics.widthPixels/3.3f;
         height = displayMetrics.heightPixels/4;



        loadText();
        link();
        video();
        saveText();



}

    private void link() {
        switch (s){
            case 0:
            case 1:                                                                                         //https://www.youtube.com/embed/Jj4iFmVkJn4
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/P4Xr6uY-bjc\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 2:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/Jj4iFmVkJn4\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 3:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/Wb9jLSW4i-A\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 4:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/XtHlhhgSpAk\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 5:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/ifJtmZT3vAU\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 6:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/OJSKCz_DmFI\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 7:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/h7nN8EWZRFw\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 8:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/-I7GKb4HQHQ\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 9:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/d015Zil1vwE\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 10:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/bloTWiDANZc\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 11:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/V4MjtFCFC18\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 12:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/R6eIDye5mrU\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 13:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/fetB0gn55os\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 14:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/w0rvQ9MzNH0\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 15:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/Zd8D_QL76JA\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 16:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/rY1r6PEzL1M\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 17:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/YbRD6wIvECs\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 18:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/fEb5EFaIhRg\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 19:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/I0eiW3_PPUg\"  \"allowfullscreen ></iframe></body></html>";

                break;
            case 20:
                videoStr = "<html><body><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/w6LGtAXN_zE\"  \"allowfullscreen ></iframe></body></html>";

                break;
        }
        b.setText(""+s);
        s=s+1;
    }

    private void video() {

        mWebView=(WebView)findViewById(R.id.videoview); //          то что было   <html><body>Promo video<br><iframe width="420" height="315" src="https://youtu.be/P4Xr6uY-bjc" frameborder="0" allowfullscreen></iframe></body></html>


        //build your own src link with your video ID                моё видео https://youtu.be/P4Xr6uY-bjc     <iframe width="894" height="674" src="https://www.youtube.com/embed/P4Xr6uY-bjc" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
        //String videoStr = "<html><body>Promo video<br><iframe width="+ width + " height="+height+" src=\"https://www.youtube.com/embed/P4Xr6uY-bjc\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe></body></html>";

        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings ws = mWebView.getSettings();
        ws.setJavaScriptEnabled(true);
        mWebView.loadData(videoStr, "text/html", "utf-8");
    }

    private void saveText() {
        sPref = getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, String.valueOf(s));
        ed.commit();



    }


    private void loadText(){
        sPref = getSharedPreferences("MyPref", MODE_PRIVATE);
        s = Integer.parseInt(sPref.getString(SAVED_TEXT, "0"));


    }

    public void onClickBack(View view) {
        saveText();
        Intent i = new Intent(VideoActivity.this, MainActivity.class);
        startActivity(i);
    }
    public void onBackPressed() {
    saveText();
    }
}