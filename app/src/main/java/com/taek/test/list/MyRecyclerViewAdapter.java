package com.taek.test.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.taek.test.R;
import com.taek.test.databinding.RecyclerViewItemBinding;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {

    private List<RecyclerViewItem> list;
    private Context context;

    public MyRecyclerViewAdapter(List<RecyclerViewItem> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.recycler_view_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bindItem(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        RecyclerViewItemBinding binding;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = RecyclerViewItemBinding.bind(itemView);
        }

        void bindItem(RecyclerViewItem item) {
            binding.imgViewItem.setImageResource(R.drawable.ic_launcher_background);
            binding.txtMain.setText(item.getMainText());
            binding.txtSub.setText(item.getSubText());
        }
    }
}
