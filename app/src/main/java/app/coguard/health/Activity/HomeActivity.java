package app.coguard.health.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import app.coguard.health.R;
import app.coguard.health.customview.SquareImageView;

public class HomeActivity extends AppCompatActivity {
    FirebaseFirestore db;
    private FirebaseAuth mAuth;
        SquareImageView iv_photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        iv_photo=findViewById(R.id.iv_photo);
        iv_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this,DetailsActivity.class);
                startActivity(i);
            }
        });
    }

}