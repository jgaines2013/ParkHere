package com.sjsu.jese.parkhere;

import android.content.Intent;
import android.icu.util.Freezable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.sjsu.jese.parkhere.browsePost.BrowsePostActivity;
import com.sjsu.jese.parkhere.login.LoginActivity;
import com.sjsu.jese.parkhere.model.Address;
import com.sjsu.jese.parkhere.model.Customer;
import com.sjsu.jese.parkhere.newPost.NewPostActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView loggedInAsTextView = (TextView) findViewById(R.id.currUserText);

        mAuth = FirebaseAuth.getInstance();
        loggedInAsTextView.setText("Logged in as: " + mAuth.getCurrentUser().getEmail());
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    // When button id = browsePostBtn clicked takes you to BrowsePostActivity
    public void toBrowsePost(View view) {
        Intent intent = new Intent(this, BrowsePostActivity.class);
        startActivity(intent);
    }

    // When button id = logoutBtn clicked logouts user and goes to LoginActivity
    public void toLogin(View view) {
        mAuth.signOut();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void toNewPost(View view) {
        Intent intent = new Intent(this, NewPostActivity.class);
        startActivity(intent);
    }

}
