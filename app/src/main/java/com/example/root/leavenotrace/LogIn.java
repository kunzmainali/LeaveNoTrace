package com.example.root.leavenotrace;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class LogIn extends ActionBarActivity {

    Connection connection;
    String email = "email1@gmail.com";
    String password = "asdf1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        connection = new Connection();
        connection.getCSRFToken();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_log_in, menu);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Log In");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    public void logIn(View view) {
        connection.logIn(email, password);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void signUpOne(View view) {
        Intent intent = new Intent(this, SignUpOne.class);
        startActivity(intent);
    }
}
