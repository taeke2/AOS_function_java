package com.taek.test.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.taek.test.R;

public class DatabindingActivity extends AppCompatActivity {

    private ActivityDatabindingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding);

        binding.toggleButton.setOnClickListener(this::toggleViews);

        Bio bio = new Bio("RooMedia", "Playing Guitar, Drink Water, ..., etc");
        binding.setBio(bio);
    }

    private void toggleViews(View view) {
        int visibillity = View.VISIBLE;
        String buttonText = "HIDE";

        switch (binding.profileImage.getVisibility()) {
            case View.VISIBLE:
                visibillity = View.GONE;
                buttonText = "SHOW";
                break;
            case View.GONE:
                visibillity = View.VISIBLE;
                buttonText = "HIDE";
                break;
        }

        binding.profileImage.setVisibility(visibillity);
        binding.name.setVisibility(visibillity);
        binding.hobbies.setVisibility(visibillity);
        binding.toggleButton.setText(buttonText);
    }
}