package com.progtech.opinionleaders.ui.initiatives;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.progtech.opinionleaders.R;

import java.util.List;

public class InitiativeInfoAdapter extends RecyclerView.Adapter<InitiativeInfoAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<InitiativeInfo> initiativeInfos;

    InitiativeInfoAdapter(Context context, List<InitiativeInfo> initiativeInfos) {
        this.initiativeInfos = initiativeInfos;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.leaders_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        InitiativeInfo initiativeInfo = initiativeInfos.get(position);
        holder.titleView.setText(initiativeInfo.getTitle());
        holder.textView.setText(initiativeInfo.getText());
    }

    @Override
    public int getItemCount() {
        return initiativeInfos.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView titleView, textView;
        ViewHolder(View view){
            super(view);
            titleView = view.findViewById(R.id.title);
            textView = view.findViewById(R.id.text);
        }
    }
}
