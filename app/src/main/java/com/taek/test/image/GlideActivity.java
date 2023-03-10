package com.taek.test.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.taek.test.R;
import com.taek.test.databinding.ActivityGlideBinding;

public class GlideActivity extends AppCompatActivity {

    private ActivityGlideBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGlideBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Glide.with(this)
                .load(R.drawable.giphy)
                .into(binding.imgGif);
    }
}