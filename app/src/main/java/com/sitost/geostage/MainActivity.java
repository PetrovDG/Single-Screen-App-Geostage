package com.sitost.geostage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user taps the TextView Address
     */
    public void address(View view) {
        // Do something in response to button
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/YvxiziThbur"));
        startActivity(browserIntent);
    }

    /**
     * Called when the user taps the TextView Telephone
     */
    public void phone(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+35928060356"));
        startActivity(intent);
    }

    /**
     * Called when the user taps the TextView E-mail
     */
    public void mail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: dimitar@geostage.info")); // only email apps should handle this
        startActivity(intent);
    }

    /**
     * Called when the user taps the view contacts button
     */
    public void view_website(View view) {
        // Do something in response to button
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://geostage.info/mineragraphy"));
        startActivity(browserIntent);
    }
}
