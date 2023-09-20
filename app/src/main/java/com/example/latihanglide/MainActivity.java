package com.example.latihanglide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView);

        Glide.with(this)
                .load("https://upload.wikimedia.org/wikipedia/commons/9/98/Logo_udinus1.jpg")
                .error(R.drawable.ic_launcher_background)
                .centerCrop()
                .apply(RequestOptions.circleCropTransform())
                .apply(new RequestOptions().overrideOf(800,800))
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(imageView);
    }
}