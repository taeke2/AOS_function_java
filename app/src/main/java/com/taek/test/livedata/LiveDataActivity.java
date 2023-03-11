package com.taek.test.livedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.taek.test.R;
import com.taek.test.databinding.ActivityLiveDataBinding;

public class LiveDataActivity extends AppCompatActivity {

    private ActivityLiveDataBinding binding;
    private LiveDataViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_live_data);
        model = new ViewModelProvider(this).get(LiveDataViewModel.class);
        binding.setViewModel(model);

        model.getCurrentScore().observe(this, (num) -> binding.tvNumber.setText(Integer.toString(num)));
    }
}