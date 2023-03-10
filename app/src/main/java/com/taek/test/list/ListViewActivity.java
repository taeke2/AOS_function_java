package com.taek.test.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.taek.test.R;
import com.taek.test.databinding.ActivityListViewBinding;

public class ListViewActivity extends AppCompatActivity {

    private ActivityListViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final String[] avengers = {"스파이더 맨", "아이언 맨", "캡틴 아메리카", "블랙 위도우", "완다", "토르", "호크아이", "헐크"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, avengers);

        binding.testListView.setAdapter(adapter);
        binding.testListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), avengers[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}