package app.coguard.health.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.firebase.auth.FirebaseAuth;

import app.coguard.health.Auth.LoginActivity;
import app.coguard.health.R;

public class MainActivity extends AppCompatActivity {
LinearLayout l,cikis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.tatil);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });
        cikis=findViewById(R.id.cikis);
        cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                        FirebaseAuth.getInstance().signOut();
                        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);


            }
        });
    }
}