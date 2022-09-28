package com.example.a3d_printer_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.os.Bundle;

public class Splach_Screen extends AppCompatActivity {
    private static int splach_screen_timeout = 1800;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splach_screen);

        Animation animation = new AlphaAnimation(1,0);
        animation.setInterpolator(new AccelerateInterpolator());
        animation.setStartOffset(500);
        animation.setDuration(1800);
        ImageView  imageView =findViewById(R.id.imageView2);
        imageView.setAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splach_Screen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },splach_screen_timeout);
    }
}