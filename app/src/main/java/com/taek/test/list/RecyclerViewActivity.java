package com.taek.test.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.taek.test.databinding.ActivityRecyclerViewBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private ActivityRecyclerViewBinding binding;
    private List<RecyclerViewItem> list;
    private MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecyclerViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            addItem("iconName", "Taek" + i, "taek2.tistory.com");
        }

        adapter = new MyRecyclerViewAdapter(list, this);

        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void addItem(String imgName, String mainText, String subText) {
        RecyclerViewItem item = new RecyclerViewItem();

        item.setImgName(imgName);
        item.setMainText(mainText);
        item.setSubText(subText);

        list.add(item);
    }
}