package app.coguard.health.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;

import app.coguard.health.Auth.LoginActivity;
import app.coguard.health.R;

public class SplashActivity extends AppCompatActivity {
ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView=findViewById(R.id.splash1);
        Animation slide_down = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom);
        imageView.startAnimation(slide_down);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },2500);
    }

}